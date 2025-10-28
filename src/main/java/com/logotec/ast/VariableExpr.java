package com.logotec.ast;

/** Variable reference expression. */
public class VariableExpr extends Expr {
    private final String name;

    public VariableExpr(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName() { return name; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitVariableExpr(this); }
}
