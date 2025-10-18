package Semantics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase ErrorReporter es la encargada de gestionar y registrar los errores semánticos
 * detectados durante el análisis de un programa.
 *
 * Su función principal es almacenar los errores, permitir consultarlos,
 * imprimirlos y limpiar la lista cuando sea necesario.
 */

public class ErrorReporter {

    // Lista que almacena todos los errores semánticos encontrados
    private final List<SemanticError> errors = new ArrayList<>();

    /**
     * Aquí se registra un nuevo error semántico con su mensaje y posición en el código.
     *
     * @param message             descripción del error
     * @param line                número de línea donde ocurrió
     * @param charPositionInLine  posición del carácter dentro de la línea
     */

    public void report(String message, int line, int charPositionInLine) {
        errors.add(new SemanticError(message, line, charPositionInLine));
    }

    /**
     * Indica si existen errores registrados.
     *
     * @return true si hay errores, false si no hay ninguno
     */

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     * Devuelve la lista de errores como una colección inmodificable,
     * para evitar que otras clases la alteren directamente.
     *
     * @return lista de errores semánticos detectados
     */
    public List<SemanticError> getErrors() {
        return Collections.unmodifiableList(errors);
    }


    /**
     * Aquí se eliminan todos los errores almacenados.
     * Útil para reiniciar el análisis o limpiar el estado.
     */
    public void clear() {
        errors.clear();
    }

    /**
     * Aquí se imprimen todos los errores registrados en la salida de error estándar.
     * Cada error se mostrará con su información detallada.
     */
    public void printAll() {
        for (SemanticError e : errors) {
            System.err.println(e);
        }
    }
}
