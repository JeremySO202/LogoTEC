package com.logotec.ast;

public class Ponpos extends Stmt {
    private final Expr x;
    private final Expr y;
    public Ponpos(Expr x, Expr y, int line, int column) { super(line, column); this.x = x; this.y = y; }
    public Expr getX() { return x; }
    public Expr getY() { return y; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
