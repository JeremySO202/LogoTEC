#include "logo_runtime.h"

int main() {
    logo_reset();
    logo_avanza(100.0);
    logo_giraderecha(90.0);
    logo_avanza(50.0);
    logo_subelapiz();
    logo_avanza(10.0);
    logo_bajalapiz();
    logo_avanza(20.0);
    return 0;
}
