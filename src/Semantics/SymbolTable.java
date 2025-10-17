package Semantics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Deque<Map<String, Type>> scopes = new ArrayDeque<>();

    public SymbolTable() {
        pushScope();
    }

    public void pushScope() {
        scopes.push(new HashMap<>());
    }

    public void popScope() {
        if (!scopes.isEmpty()) scopes.pop();
    }

    public boolean define(String name, Type type) {
        Map<String, Type> top = scopes.peek();
        if (top.containsKey(name)) return false; // already defined in current scope
        top.put(name, type);
        return true;
    }

    public boolean assign(String name, Type type) {
        Map<String, Type> scope = resolveScope(name);
        if (scope == null) return false;
        Type existing = scope.get(name);
        if (existing == Type.UNKNOWN) {
            scope.put(name, type);
            return true;
        }
        if (existing == type) {
            return true;
        }
        return false;
    }

    public boolean isDefined(String name) {
        return resolveScope(name) != null;
    }

    public Type get(String name) {
        Map<String, Type> scope = resolveScope(name);
        if (scope == null) return null;
        return scope.get(name);
    }

    private Map<String, Type> resolveScope(String name) {
        for (Map<String, Type> scope : scopes) {
            if (scope.containsKey(name)) return scope;
        }
        return null;
    }
}
