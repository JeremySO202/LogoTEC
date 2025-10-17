package Semantics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorReporter {
    private final List<SemanticError> errors = new ArrayList<>();

    public void report(String message, int line, int charPositionInLine) {
        errors.add(new SemanticError(message, line, charPositionInLine));
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<SemanticError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public void clear() {
        errors.clear();
    }

    public void printAll() {
        for (SemanticError e : errors) {
            System.err.println(e);
        }
    }
}
