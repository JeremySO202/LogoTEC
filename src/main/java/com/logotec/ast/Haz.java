package com.logotec.ast;

/**
 * Represents the `haz` instruction (assignment or variable update) from the grammar.
 */
public class Haz extends Stmt {
    private final String name;
    private final Expr value;

    public Haz(String name, Expr value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public Expr getValue() { return value; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
