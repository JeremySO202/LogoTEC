package com.logotec;

import com.logotec.ui.IDLE_LogoTEC;

/**
 * Clase Launcher para iniciar la aplicación JavaFX.
 * Necesaria para evitar problemas con el módulo JavaFX en Java 11+
 */
public class Launcher {
    public static void main(String[] args) {
        IDLE_LogoTEC.main(args);
    }
}
