/*
 * LogoTEC WiFi Runtime - Cliente C++ HTTP
 *
 * Runtime alternativo que se comunica con ESP32 vía HTTP
 * en lugar de imprimir comandos a stdout.
 *
 * PROTOCOLO HTTP:
 * - POST http://ROBOT_IP/cmd
 * - Body: COMANDO parametros
 * - Response: {"status":"ok","result":"..."}
 *
 * COMANDOS DIRECTOS (pasan tal cual al ESP32):
 *   RESET
 *   AVANZA dist
 *   RETROCEDE dist
 *   GIRADERECHA deg
 *   GIRAIZQUIERDA deg
 *   PONRUMBO angle
 *   BAJALAPIZ
 *   SUBELAPIZ
 *
 * COMANDOS TRADUCIDOS (el runtime los descompone):
 *   PONPOS x y    → SUBELAPIZ + PONRUMBO + AVANZA + (restaurar pen)
 *   PONX x        → PONRUMBO (0 o 180) + AVANZA
 *   PONY y        → PONRUMBO (90 o 270) + AVANZA
 *   CENTRO        → PONPOS 0 0
 *   OCULTATORTUGA → PONPOS 0 0 + PONRUMBO 0
 *
 * CONFIGURACIÓN:
 *   Variable de entorno: LOGOTEC_ROBOT_IP (default: 192.168.1.100)
 *   Puerto: 80 (HTTP)
 *
 * MODOS DE DEBUG:
 *   LOGOTEC_DEBUG=1  → Imprime todos los comandos y respuestas
 *   LOGOTEC_DRY_RUN=1 → Solo imprime, no conecta
 */

#include "logo_runtime_wifi.h"
#include <iostream>
#include <fstream>
#include <cstring>
#include <cmath>
#include <cstdlib>
#include <sstream>
#include <iomanip>

// Platform-specific socket headers
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#pragma comment(lib, "ws2_32.lib")
typedef int socklen_t;
#else
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <netinet/in.h>
#define SOCKET int
#define INVALID_SOCKET -1
#define SOCKET_ERROR -1
#define closesocket close
#endif

// ============================================
// ESTADO DEL ROBOT
// ============================================
static double s_x = 0.0;         // Posición X actual
static double s_y = 0.0;         // Posición Y actual
static double s_angle_deg = 0.0; // Ángulo actual (0-360°)
static bool s_pen_down = true;   // Estado del lápiz
static int s_color = 0;          // Color actual (0=NEGRO, 1=AZUL, 2=ROJO)

// ============================================
// CONEXIÓN WIFI
// ============================================
static bool s_initialized = false;
static bool s_debug = false;
static bool s_dry_run = false;
static std::string s_robot_ip = "192.168.1.100";
static int s_robot_port = 80; // Puerto HTTP

// ============================================
// CONSTANTES
// ============================================
const double PI = 3.14159265358979323846;
const int RECV_TIMEOUT_SEC = 30;

// ============================================
// UTILIDADES
// ============================================

// Normalizar ángulo a rango 0-360
static double normalizeAngle(double angle)
{
    while (angle >= 360.0)
        angle -= 360.0;
    while (angle < 0.0)
        angle += 360.0;
    return angle;
}

// Inicializar configuración
static bool initWiFiRuntime()
{
    if (s_initialized)
        return true;

    s_initialized = true;

    // Leer configuración de variables de entorno
    const char *debug_env = std::getenv("LOGOTEC_DEBUG");
    const char *dry_run_env = std::getenv("LOGOTEC_DRY_RUN");

    s_debug = (debug_env && std::string(debug_env) == "1");
    s_dry_run = (dry_run_env && std::string(dry_run_env) == "1");

    // Nota: La IP se establece en logo_init_runtime() desde argumentos de línea de comandos

    if (s_dry_run)
    {
        std::cout << "==================================" << std::endl;
        std::cout << "LogoTEC HTTP Runtime - DRY RUN MODE" << std::endl;
        std::cout << "==================================" << std::endl;
        return true;
    }

    std::cout << "==================================" << std::endl;
    std::cout << "LogoTEC HTTP Runtime" << std::endl;
    std::cout << "==================================" << std::endl;
    std::cout << "Robot URL: http://" << s_robot_ip << "/cmd" << std::endl;
    if (s_debug)
    {
        std::cout << "Debug mode: ON" << std::endl;
    }
    std::cout << std::endl;

#ifdef _WIN32
    // Inicializar Winsock en Windows
    WSADATA wsaData;
    if (WSAStartup(MAKEWORD(2, 2), &wsaData) != 0)
    {
        std::cerr << "ERROR: WSAStartup failed" << std::endl;
        return false;
    }
#endif

    return true;
}

// Enviar comando HTTP
static bool sendCommand(const std::string &cmd)
{
    if (!s_initialized)
    {
        initWiFiRuntime();
    }

    if (s_dry_run)
    {
        std::cout << ">> " << cmd << std::endl;
        return true;
    }

    if (s_debug)
    {
        std::cout << "[HTTP POST] " << cmd << std::endl;
    }

    // Crear socket para esta petición
    SOCKET sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock == INVALID_SOCKET)
    {
        std::cerr << "ERROR: No se pudo crear socket" << std::endl;
        return false;
    }

    // Configurar timeout
#ifdef _WIN32
    DWORD timeout = 10000; // 10 segundos
    setsockopt(sock, SOL_SOCKET, SO_RCVTIMEO, (char *)&timeout, sizeof(timeout));
    setsockopt(sock, SOL_SOCKET, SO_SNDTIMEO, (char *)&timeout, sizeof(timeout));
#else
    struct timeval tv;
    tv.tv_sec = 10;
    tv.tv_usec = 0;
    setsockopt(sock, SOL_SOCKET, SO_RCVTIMEO, &tv, sizeof(tv));
    setsockopt(sock, SOL_SOCKET, SO_SNDTIMEO, &tv, sizeof(tv));
#endif

    // Configurar dirección del servidor
    struct sockaddr_in server_addr;
    std::memset(&server_addr, 0, sizeof(server_addr));
    server_addr.sin_family = AF_INET;
    server_addr.sin_port = htons(s_robot_port);

#ifdef _WIN32
    server_addr.sin_addr.s_addr = inet_addr(s_robot_ip.c_str());
#else
    if (inet_pton(AF_INET, s_robot_ip.c_str(), &server_addr.sin_addr) <= 0)
    {
        std::cerr << "ERROR: Dirección IP inválida" << std::endl;
        closesocket(sock);
        return false;
    }
#endif

    // Conectar
    if (connect(sock, (struct sockaddr *)&server_addr, sizeof(server_addr)) != 0)
    {
        std::cerr << "ERROR: No se pudo conectar a " << s_robot_ip << std::endl;
        closesocket(sock);
        return false;
    }

    // Construir petición HTTP POST
    std::stringstream http_request;
    http_request << "POST /cmd HTTP/1.1\r\n";
    http_request << "Host: " << s_robot_ip << "\r\n";
    http_request << "Content-Type: text/plain\r\n";
    http_request << "Content-Length: " << cmd.length() << "\r\n";
    http_request << "Connection: close\r\n";
    http_request << "\r\n";
    http_request << cmd;

    std::string request_str = http_request.str();

    // Enviar petición
    int sent = send(sock, request_str.c_str(), request_str.length(), 0);
    if (sent == SOCKET_ERROR)
    {
        std::cerr << "ERROR: No se pudo enviar petición HTTP" << std::endl;
        closesocket(sock);
        return false;
    }

    // Recibir respuesta
    char buffer[4096];
    std::string response;
    int received;

    while ((received = recv(sock, buffer, sizeof(buffer) - 1, 0)) > 0)
    {
        buffer[received] = '\0';
        response += buffer;
    }

    closesocket(sock);

    if (response.empty())
    {
        std::cerr << "ERROR: No se recibió respuesta" << std::endl;
        return false;
    }

    // Buscar código de respuesta HTTP
    if (response.find("200 OK") == std::string::npos)
    {
        std::cerr << "ERROR: Respuesta HTTP no OK" << std::endl;
        if (s_debug)
        {
            std::cerr << response << std::endl;
        }
        return false;
    }

    // Buscar el JSON en la respuesta
    size_t json_start = response.find("{");
    if (json_start != std::string::npos)
    {
        std::string json = response.substr(json_start);
        if (s_debug)
        {
            std::cout << "[RESPONSE] " << json << std::endl;
        }

        // Verificar que status sea "ok"
        if (json.find("\"status\":\"ok\"") != std::string::npos)
        {
            return true;
        }
        else if (json.find("\"status\":\"error\"") != std::string::npos)
        {
            std::cerr << "ERROR del robot: " << json << std::endl;
            return false;
        }
    }

    if (s_debug)
    {
        std::cerr << "ERROR: Respuesta inválida" << std::endl;
        std::cerr << response << std::endl;
    }

    return false;
}

// ============================================
// IMPLEMENTACIÓN DE FUNCIONES LOGO
// ============================================

extern "C"
{

    // Inicializar runtime con argumentos de línea de comandos
    void logo_init_runtime(int argc, char** argv)
    {
        // Si se pasa una IP como primer argumento, usarla
        if (argc > 1 && argv[1] != nullptr && strlen(argv[1]) > 0)
        {
            s_robot_ip = argv[1];
            std::cout << "Usando IP del argumento: " << s_robot_ip << std::endl;
        }
        else
        {
            std::cout << "Usando IP por defecto: " << s_robot_ip << std::endl;
        }
    }

    // Estado y control general
    void logo_reset()
    {
        s_x = 0.0;
        s_y = 0.0;
        s_angle_deg = 0.0;
        s_pen_down = true;
        s_color = 0;

        sendCommand("RESET");
    }

    // Instrucciones básicas (no necesitan enviar al robot)
    void logo_haz(const char *var_name, double value)
    {
        // Variables se manejan en LLVM, no necesitan comunicación
    }

    void logo_inic(const char *var_name, double value)
    {
        // Variables se manejan en LLVM, no necesitan comunicación
    }

    void logo_inc(double value1, double value2)
    {
        // Operación local, no requiere comunicación
    }

    // Instrucciones de movimiento (pasan directamente)
    void logo_avanza(double dist)
    {
        std::ostringstream cmd;
        cmd << "AVANZA " << std::fixed << std::setprecision(2) << dist;
        sendCommand(cmd.str());

        // Actualizar posición estimada
        double rad = s_angle_deg * PI / 180.0;
        s_x += std::cos(rad) * dist;
        s_y += std::sin(rad) * dist;
    }

    void logo_retrocede(double dist)
    {
        std::ostringstream cmd;
        cmd << "RETROCEDE " << std::fixed << std::setprecision(2) << dist;
        sendCommand(cmd.str());

        // Actualizar posición estimada
        double rad = s_angle_deg * PI / 180.0;
        s_x -= std::cos(rad) * dist;
        s_y -= std::sin(rad) * dist;
    }

    void logo_giraderecha(double deg)
    {
        std::ostringstream cmd;
        cmd << "GIRADERECHA " << std::fixed << std::setprecision(2) << deg;
        sendCommand(cmd.str());

        s_angle_deg -= deg;
        s_angle_deg = normalizeAngle(s_angle_deg);
    }

    void logo_giraizquierda(double deg)
    {
        std::ostringstream cmd;
        cmd << "GIRAIZQUIERDA " << std::fixed << std::setprecision(2) << deg;
        sendCommand(cmd.str());

        s_angle_deg += deg;
        s_angle_deg = normalizeAngle(s_angle_deg);
    }

    // Instrucciones de posicionamiento (se traducen)
    void logo_ponpos(double x, double y)
    {
        // PONPOS no debe dibujar, según especificación original
        // Traducción: SUBELAPIZ + PONRUMBO + AVANZA + (restaurar pen)

        bool pen_was_down = s_pen_down;

        // Levantar lápiz si está abajo
        if (s_pen_down)
        {
            sendCommand("SUBELAPIZ");
            s_pen_down = false;
        }

        // Calcular ángulo y distancia
        double dx = x - s_x;
        double dy = y - s_y;
        double distance = std::sqrt(dx * dx + dy * dy);

        if (distance > 0.1)
        { // Solo mover si la distancia es significativa
            // Calcular ángulo hacia el objetivo
            double angle_rad = std::atan2(dy, dx);
            double angle_deg = angle_rad * 180.0 / PI;
            angle_deg = normalizeAngle(angle_deg);

            // Orientar hacia el objetivo
            std::ostringstream cmd_rumbo;
            cmd_rumbo << "PONRUMBO " << std::fixed << std::setprecision(2) << angle_deg;
            sendCommand(cmd_rumbo.str());
            s_angle_deg = angle_deg;

            // Avanzar a la posición
            std::ostringstream cmd_avanza;
            cmd_avanza << "AVANZA " << std::fixed << std::setprecision(2) << distance;
            sendCommand(cmd_avanza.str());
        }

        // Actualizar posición
        s_x = x;
        s_y = y;

        // Restaurar estado del lápiz si estaba abajo
        if (pen_was_down)
        {
            sendCommand("BAJALAPIZ");
            s_pen_down = true;
        }
    }

    void logo_ponxy(double x, double y)
    {
        // PONXY es idéntico a PONPOS según especificación
        logo_ponpos(x, y);
    }

    void logo_ponrumbo(double angle)
    {
        angle = normalizeAngle(angle);
        std::ostringstream cmd;
        cmd << "PONRUMBO " << std::fixed << std::setprecision(2) << angle;
        sendCommand(cmd.str());

        s_angle_deg = angle;
    }

    void logo_ponx(double x)
    {
        // Mover solo en eje X (horizontal)
        double dx = x - s_x;
        if (std::abs(dx) < 0.1)
            return; // Distancia muy pequeña

        // Determinar ángulo (0° = derecha, 180° = izquierda)
        double angle = (dx > 0) ? 0.0 : 180.0;

        // Orientar
        logo_ponrumbo(angle);

        // Avanzar
        logo_avanza(std::abs(dx));

        s_x = x;
    }

    void logo_pony(double y)
    {
        // Mover solo en eje Y (vertical)
        double dy = y - s_y;
        if (std::abs(dy) < 0.1)
            return; // Distancia muy pequeña

        // Determinar ángulo (90° = arriba, 270° = abajo)
        double angle = (dy > 0) ? 90.0 : 270.0;

        // Orientar
        logo_ponrumbo(angle);

        // Avanzar
        logo_avanza(std::abs(dy));

        s_y = y;
    }

    void logo_centro()
    {
        // Ir al centro (0, 0) sin dibujar
        logo_ponpos(0.0, 0.0);
    }

    // Instrucciones de lápiz
    void logo_bajalapiz()
    {
        sendCommand("BAJALAPIZ");
        s_pen_down = true;
    }

    void logo_subelapiz()
    {
        sendCommand("SUBELAPIZ");
        s_pen_down = false;
    }

    void logo_poncolorlapiz(int color)
    {
        // El ESP32 no tiene múltiples colores físicos
        // Solo lo registramos en el estado
        s_color = color;

        if (s_debug)
        {
            const char *color_names[] = {"NEGRO", "AZUL", "ROJO"};
            std::cout << "COLOR cambiado a " << color_names[color % 3] << " (solo registro local)" << std::endl;
        }
    }

    // Alias para compatibilidad con código generado antiguo
    void logo_poncolor(int color)
    {
        logo_poncolorlapiz(color);
    }

    // Otras instrucciones
    void logo_ocultatortuga()
    {
        // Ocultar tortuga: ir a (0,0) y poner rumbo 0
        logo_ponpos(0.0, 0.0);
        logo_ponrumbo(0.0);
    }

    void logo_espera(double milliseconds)
    {
// Espera local en el cliente, no en el robot
#ifdef _WIN32
        Sleep(static_cast<DWORD>(milliseconds));
#else
        usleep(static_cast<useconds_t>(milliseconds * 1000));
#endif
    }

    void logo_show()
    {
        // No hace nada en modo robot físico
    }

    // Operaciones matemáticas (locales)
    double logo_diferencia(double a, double b) { return a - b; }
    double logo_azar(double max) { return (double)std::rand() / RAND_MAX * max; }
    double logo_producto(double a, double b) { return a * b; }
    double logo_potencia(double base, double exp) { return std::pow(base, exp); }
    double logo_division(double a, double b) { return (b != 0.0) ? a / b : 0.0; }
    double logo_suma(double a, double b) { return a + b; }

    // Operaciones comparativas
    int logo_iguales(double a, double b) { return std::abs(a - b) < 1e-9 ? 1 : 0; }
    int logo_mayorque(double a, double b) { return a > b ? 1 : 0; }
    int logo_menorque(double a, double b) { return a < b ? 1 : 0; }

    // Operaciones lógicas
    int logo_y(int a, int b) { return (a && b) ? 1 : 0; }
    int logo_o(int a, int b) { return (a || b) ? 1 : 0; }

    // Consultas
    double logo_rumbo() { return s_angle_deg; }

} // extern "C"
