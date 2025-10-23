package com.logotec.ast;

/** INIC: assigns a new value to an existing variable (e.g., INIC x = 5) */
public class Inic extends Stmt {
    private final String identifier;
    private final Expr value;

    public Inic(String identifier, Expr value, int line, int column) {
        super(line, column);
        this.identifier = identifier;
        this.value = value;
    }

    public String getIdentifier() { return identifier; }
    public Expr getValue() { return value; }

    @Override
    public <R> R accept(ASTVisitor<R> visitor) {
        return visitor.visitNode(this);
    }
}
