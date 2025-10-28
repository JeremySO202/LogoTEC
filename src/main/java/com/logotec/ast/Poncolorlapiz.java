package com.logotec.ast;

public class Poncolorlapiz extends Stmt {
    private final Expr color;
    public Poncolorlapiz(Expr color, int line, int column) {
        super(line, column);
        this.color = color;
    }
    public Expr getColor() { return color; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}

