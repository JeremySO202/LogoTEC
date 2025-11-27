#ifndef LOGO_RUNTIME_WIFI_H
#define LOGO_RUNTIME_WIFI_H

#ifdef __cplusplus
extern "C"
{
#endif

    // ============================================
    // Estado y control general
    // ============================================
    void logo_init_runtime(int argc, char** argv); // inicializa runtime con argumentos
    void logo_reset(); // resetea la posición y estado

    // ============================================
    // Instrucciones básicas
    // ============================================
    void logo_haz(const char *var_name, double value);
    void logo_inic(const char *var_name, double value);
    void logo_inc(double value1, double value2);

    // ============================================
    // Instrucciones de movimiento
    // ============================================
    void logo_avanza(double dist);
    void logo_retrocede(double dist);
    void logo_giraderecha(double deg);
    void logo_giraizquierda(double deg);

    // ============================================
    // Instrucciones de posicionamiento
    // ============================================
    void logo_ponpos(double x, double y);
    void logo_ponxy(double x, double y);
    void logo_ponrumbo(double angle);
    void logo_ponx(double x);
    void logo_pony(double y);
    void logo_centro();

    // ============================================
    // Instrucciones de lápiz
    // ============================================
    void logo_bajalapiz();
    void logo_subelapiz();
    void logo_poncolorlapiz(int color); // 0=NEGRO, 1=AZUL, 2=ROJO, etc.

    // ============================================
    // Otras instrucciones
    // ============================================
    void logo_ocultatortuga();
    void logo_espera(double milliseconds);
    void logo_show(); // Mostrar el canvas (si es necesario)

    // ============================================
    // Operaciones matemáticas (retornan valores)
    // ============================================
    double logo_diferencia(double a, double b);
    double logo_azar(double max);
    double logo_producto(double a, double b);
    double logo_potencia(double base, double exp);
    double logo_division(double a, double b);
    double logo_suma(double a, double b);

    // ============================================
    // Operaciones comparativas (retornan booleanos como int)
    // ============================================
    int logo_iguales(double a, double b);
    int logo_mayorque(double a, double b);
    int logo_menorque(double a, double b);

    // ============================================
    // Operaciones lógicas
    // ============================================
    int logo_y(int a, int b);
    int logo_o(int a, int b);

    // ============================================
    // Consultas
    // ============================================
    double logo_rumbo();

#ifdef __cplusplus
}
#endif

#endif // LOGO_RUNTIME_WIFI_H
