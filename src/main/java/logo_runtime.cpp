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
static double s_angle_deg = 0.0;
static bool s_pen_down = true;
static int s_color = 0;
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
        std::lock_guard<std::mutex> lock(s_mutex);
        double rad = s_angle_deg * M_PI / 180.0;
        double nx = s_x - std::cos(rad) * dist;
        double ny = s_y - std::sin(rad) * dist;
        if (s_pen_down) {
            std::printf("LINE %.6f %.6f %.6f %.6f\n", s_x, s_y, nx, ny);
        }
        s_x = nx;
        s_y = ny;
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

    //ponpos y poxy son la mismo funcion y ninguna debe de pintar
    void logo_ponpos(double x, double y) {
        std::lock_guard<std::mutex> lock(s_mutex);
        s_x = x;
        s_y = y;
        std::printf("POSITION %.6f %.6f\n", x, y);
    }

    void logo_ponxy(double x, double y) {
        std::lock_guard<std::mutex> lock(s_mutex);
        s_x = x;
        s_y = y;
        std::printf("POSITION %.6f %.6f\n", x, y);
    }

    //ponrumbo es poner el bicho a ver a cierto angulo sin moverlo
    void logo_ponrumbo(double angle) {
        std::lock_guard<std::mutex> lock(s_mutex);
        s_angle_deg = std::fmod(angle, 360.0);
        if (s_angle_deg < 0) s_angle_deg += 360.0;
        std::printf("ANGLE %.6f\n", s_angle_deg);
    }

    void logo_ponx(double x) {
        std::lock_guard<std::mutex> lock(s_mutex);
        if (s_pen_down) {
            std::printf("LINE %.6f %.6f %.6f %.6f\n", s_x, s_y, x, s_y);
        }else {
            std::printf("POSITION %.6f %.6f\n", x, s_y);
        }
        s_x = x;
    }

    void logo_pony(double y) {
        std::lock_guard<std::mutex> lock(s_mutex);
        if (s_pen_down) {
            std::printf("LINE %.6f %.6f %.6f %.6f\n", s_x, s_y, s_x, y);
        }else {
            std::printf("POSITION %.6f %.6f\n", s_x, y);
        }
        s_y = y;
    }

    void logo_centro() {
        std::lock_guard<std::mutex> lock(s_mutex);
        s_x = 0;
        s_y = 0;
        std::printf("POSITION %.6f %.6f\n", s_x, s_y);
    }

    // ============================================
    // Instrucciones de lÃ¡piz
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

    void logo_poncolorlapiz(int color) {
        std::lock_guard<std::mutex> lock(s_mutex);

        if (color < 0 || color > 2) {
            color = 0;
        }

        s_color = color;

        const char* color_names[] = {"NEGRO", "AZUL", "ROJO"};
        std::printf("COLOR %s\n", color_names[s_color]);
    }

    // ============================================
    // Otras instrucciones
    // ============================================
        void logo_ocultatortuga() {
        std::lock_guard<std::mutex> lock(s_mutex);
        double nx = 0.0;
        double ny = 0.0;
        if (s_pen_down) {
            std::printf("OC LINE %.6f %.6f %.6f %.6f\n", s_x, s_y, nx, ny);
        }else {
            std::puts("OCULTATORTUGA");
        }
        s_x = nx;
        s_y = ny;        s_angle_deg = 0.0;
    }

    // ============================================
    // Consultas
    // ============================================
    double logo_rumbo() {
        std::lock_guard<std::mutex> lock(s_mutex);
        std::printf("ANGLE %.6f\n", s_angle_deg);
        return s_angle_deg;
    }

    //TODO: IMPLEMENTAR EL ESPERA
    void logo_espera(double milliseconds) {
        std::printf("ESPERA %.6f\n", milliseconds);
    }
}