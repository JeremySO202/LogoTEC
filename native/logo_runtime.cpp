// Implementation of the C ABI runtime for Logo operations.
// The runtime prints textual commands to stdout (e.g. LINE x1 y1 x2 y2, PENUP, PENDOWN)
// so a Java UI can run the compiled program and parse those lines to draw on a canvas.

#include "logo_runtime.h"
#include <cstdio>
#include <cmath>
#include <mutex>

// Internal state
static double s_x = 0.0;
static double s_y = 0.0;
static double s_angle_deg = 0.0; // 0 degrees = +X
static bool s_pen_down = true;
static std::mutex s_mutex;

extern "C" {

// ============================================
// Estado y control general
// ============================================
void logo_reset() {
    std::lock_guard<std::mutex> lock(s_mutex);
    s_x = 0.0;
    s_y = 0.0;
    s_angle_deg = 0.0;
    s_pen_down = true;
    std::puts("RESET");
}

// ============================================
// Instrucciones básicas
// ============================================
void logo_haz(const char* var_name, double value) {
    // TODO: Implementar lógica de asignación de variable
    std::printf("HAZ %s %.6f\n", var_name, value);
}

void logo_inic(const char* var_name, double value) {
    // TODO: Implementar lógica de inicialización de variable
    std::printf("INIC %s %.6f\n", var_name, value);
}

void logo_inc(double value1, double value2) {
    // TODO: Implementar lógica de incremento
    std::printf("INC %.6f %.6f\n", value1, value2);
}

// ============================================
// Instrucciones de movimiento
// ============================================
void logo_avanza(double dist) {
    std::lock_guard<std::mutex> lock(s_mutex);
    double rad = s_angle_deg * M_PI / 180.0;
    double nx = s_x + std::cos(rad) * dist;
    double ny = s_y + std::sin(rad) * dist;
    if (s_pen_down) {
        std::printf("LINE %.6f %.6f %.6f %.6f\n", s_x, s_y, nx, ny);
    }
    s_x = nx;
    s_y = ny;
}

void logo_retrocede(double dist) {
    // TODO: Implementar lógica de retroceso (mover en dirección opuesta)
    std::printf("RETROCEDE %.6f\n", dist);
}

void logo_giraderecha(double deg) {
    std::lock_guard<std::mutex> lock(s_mutex);
    s_angle_deg = std::fmod(s_angle_deg - deg, 360.0);
    if (s_angle_deg < 0) s_angle_deg += 360.0;
    std::printf("ANGLE %.6f\n", s_angle_deg);
}

void logo_giraizquierda(double deg) {
    std::lock_guard<std::mutex> lock(s_mutex);
    s_angle_deg = std::fmod(s_angle_deg + deg, 360.0);
    if (s_angle_deg < 0) s_angle_deg += 360.0;
    std::printf("ANGLE %.6f\n", s_angle_deg);
}

// ============================================
// Instrucciones de posicionamiento
// ============================================
void logo_ponpos(double x, double y) {
    // TODO: Implementar lógica de posicionamiento
    std::printf("PONPOS %.6f %.6f\n", x, y);
}

void logo_ponxy(double x, double y) {
    // TODO: Implementar lógica de posicionamiento XY
    std::printf("PONXY %.6f %.6f\n", x, y);
}

void logo_ponrumbo(double angle) {
    // TODO: Implementar lógica de cambio de rumbo
    std::printf("PONRUMBO %.6f\n", angle);
}

void logo_ponx(double x) {
    // TODO: Implementar lógica de cambio de coordenada X
    std::printf("PONX %.6f\n", x);
}

void logo_pony(double y) {
    // TODO: Implementar lógica de cambio de coordenada Y
    std::printf("PONY %.6f\n", y);
}

void logo_centro() {
    // TODO: Implementar lógica de centrado
    std::puts("CENTRO");
}

// ============================================
// Instrucciones de lápiz
// ============================================
void logo_bajalapiz() {
    std::lock_guard<std::mutex> lock(s_mutex);
    s_pen_down = true;
    std::puts("PENDOWN");
}

void logo_subelapiz() {
    std::lock_guard<std::mutex> lock(s_mutex);
    s_pen_down = false;
    std::puts("PENUP");
}

void logo_poncolor(int color) {
    // TODO: Implementar lógica de cambio de color
    const char* color_name = "NEGRO";
    if (color == 1) color_name = "AZUL";
    else if (color == 2) color_name = "ROJO";
    std::printf("COLOR %s\n", color_name);
}

// ============================================
// Otras instrucciones
// ============================================
void logo_ocultatortuga() {
    // TODO: Implementar lógica de ocultar tortuga
    std::puts("OCULTATORTUGA");
}

void logo_espera(double milliseconds) {
    // TODO: Implementar lógica de espera
    std::printf("ESPERA %.6f\n", milliseconds);
}

// ============================================
// Operaciones matemáticas
// ============================================
double logo_diferencia(double a, double b) {
    // TODO: Implementar lógica de diferencia
    return 0.0;
}

double logo_azar(double max) {
    // TODO: Implementar lógica de número aleatorio
    return 0.0;
}

double logo_producto(double a, double b) {
    // TODO: Implementar lógica de producto
    return 0.0;
}

double logo_potencia(double base, double exp) {
    // TODO: Implementar lógica de potencia
    return 0.0;
}

double logo_division(double a, double b) {
    // TODO: Implementar lógica de división
    return 0.0;
}

double logo_suma(double a, double b) {
    // TODO: Implementar lógica de suma
    return 0.0;
}

// ============================================
// Operaciones comparativas
// ============================================
int logo_iguales(double a, double b) {
    // TODO: Implementar lógica de comparación de igualdad
    return 0;
}

int logo_mayorque(double a, double b) {
    // TODO: Implementar lógica de comparación mayor que
    return 0;
}

int logo_menorque(double a, double b) {
    // TODO: Implementar lógica de comparación menor que
    return 0;
}

// ============================================
// Operaciones lógicas
// ============================================
int logo_y(int a, int b) {
    // TODO: Implementar lógica AND
    return 0;
}

int logo_o(int a, int b) {
    // TODO: Implementar lógica OR
    return 0;
}

// ============================================
// Consultas
// ============================================
double logo_rumbo() {
    // TODO: Implementar lógica de consulta de rumbo
    return 0.0;
}

} // extern "C"
