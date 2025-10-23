package com.logotec.ast;

public class Ponx extends Stmt {
    private final Expr x;
    public Ponx(Expr x, int line, int column) { super(line, column); this.x = x; }
    public Expr getX() { return x; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
