package com.logotec.semantics;

/**
 * Clase que representa un error semántico detectado durante el análisis.
 *
 * Contiene la información básica sobre el error: el mensaje descriptivo,
 * la línea y la posición exacta dentro del código fuente donde ocurrió.
 */
public class SemanticError {

    // Mensaje descriptivo del error (ejemplo: "Variable no declarada")
    private final String message;

    // Número de línea del código donde se detectó el error
    private final int line;

    // Posición del carácter dentro de la línea donde ocurrió el error
    private final int charPositionInLine;

    /**
     * Crea un nuevo objeto SemanticError con los datos proporcionados.
     *
     * @param message             descripción del error
     * @param line                número de línea donde ocurrió
     * @param charPositionInLine  posición del carácter dentro de la línea
     */
    public SemanticError(String message, int line, int charPositionInLine) {
        this.message = message;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    /** @return el mensaje descriptivo del error */
    public String getMessage() {
        return message;
    }

    /** @return la línea donde ocurrió el error */
    public int getLine() {
        return line;
    }

    /** @return la posición del carácter dentro de la línea */
    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    /**
     * Devuelve una representación legible del error, mostrando su tipo,
     * la línea, la posición y el mensaje.
     */
    @Override
    public String toString() {
        return "[SemanticError] line " + line + ":" + charPositionInLine + ": " + message;
    }
}
