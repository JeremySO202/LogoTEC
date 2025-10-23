package com.logotec.ast;

/** Literal value node (number, boolean, string). */
public class LiteralExpr extends Expr {
    private final Object value;

    public LiteralExpr(Object value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public Object getValue() { return value; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitLiteralExpr(this); }
}
