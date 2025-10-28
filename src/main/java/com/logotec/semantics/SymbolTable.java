package com.logotec.semantics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase implementa una tabla de símbolos para el análisis semántico.
 *
 * Se utiliza para almacenar y manejar las variables, funciones o identificadores
 * definidos en distintos niveles de alcance (scopes) del programa.
 *
 * Cada scope se maneja mediante una pila de mapas (Deque), donde cada mapa
 * asocia nombres (identificadores) con su tipo correspondiente.
 */

public class SymbolTable {

    // Pila de scopes (alcances), donde cada nivel es un mapa de identificadores a tipos
    private final Deque<Map<String, Type>> scopes = new ArrayDeque<>();


    /**
     * Constructor: inicializa la tabla de símbolos con un scope global vacío.
     */
    public SymbolTable() {
        pushScope();
    }

    /**
     * Crea un nuevo scope (nivel de alcance).
     *
     * Generalmente se usa al entrar en una función, bloque o estructura de control.
     */
    public void pushScope() {
        scopes.push(new HashMap<>());
    }

    /**
     * Elimina el scope actual (nivel más alto en la pila).
     *
     * Se usa al salir de una función o bloque.
     */
    public void popScope() {
        if (!scopes.isEmpty()) scopes.pop();
    }

    /**
     * Define un nuevo símbolo (variable, función, etc.) en el scope actual.
     *
     * @param name nombre del identificador
     * @param type tipo asociado al identificador
     * @return false si ya estaba definido en el mismo scope, true si se agregó correctamente
     */
    public boolean define(String name, Type type) {
        Map<String, Type> top = scopes.peek();
        if (top.containsKey(name)) return false; // Ya existe en el alcance actual
        top.put(name, type);
        return true;
    }

    /**
     * Asigna o actualiza el tipo de un identificador ya definido.
     *
     * Si el identificador existe pero su tipo era desconocido, se actualiza.
     * Si el tipo coincide con el existente, se mantiene.
     *
     * @param name nombre del identificador
     * @param type nuevo tipo a asignar
     * @return true si la asignación fue válida, false si el símbolo no existe o hay conflicto de tipos
     */
    public boolean assign(String name, Type type) {
        Map<String, Type> scope = resolveScope(name);
        if (scope == null) return false; // No está definido en ningún scope
        Type existing = scope.get(name);
        if (existing == Type.UNKNOWN) { // Si el tipo era desconocido, se actualiza
            scope.put(name, type);
            return true;
        }
        if (existing == type) {  // Si ya tiene el mismo tipo, no hay problema
            return true;
        }
        // Si el tipo existente es distinto, no se puede reasignar
        return false;
    }

    /**
     * Verifica si un identificador está definido en algún scope.
     *
     * @param name nombre del identificador
     * @return true si está definido, false en caso contrario
     */
    public boolean isDefined(String name) {
        return resolveScope(name) != null;
    }

    /**
     * Obtiene el tipo asociado a un identificador, buscando desde el scope más interno hacia afuera.
     *
     * @param name nombre del identificador
     * @return el tipo del identificador, o null si no está definido
     */
    public Type get(String name) {
        Map<String, Type> scope = resolveScope(name);
        if (scope == null) return null;
        return scope.get(name);
    }

    /**
     * Busca el scope donde está definido un identificador.
     *
     * Recorre los scopes desde el más interno hasta el global.
     *
     * @param name nombre del identificador
     * @return el mapa (scope) donde se encontró el identificador, o null si no existe
     */
    private Map<String, Type> resolveScope(String name) {
        for (Map<String, Type> scope : scopes) {
            if (scope.containsKey(name)) return scope;
        }
        return null;
    }
}
