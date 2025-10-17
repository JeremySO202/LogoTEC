package Semantics;

public class SemanticError {
    private final String message;
    private final int line;
    private final int charPositionInLine;

    public SemanticError(String message, int line, int charPositionInLine) {
        this.message = message;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    @Override
    public String toString() {
        return "[SemanticError] line " + line + ":" + charPositionInLine + ": " + message;
    }
}
