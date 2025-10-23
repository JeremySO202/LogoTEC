package com.logotec.ast;

public class Pony extends Stmt {
    private final Expr y;
    public Pony(Expr y, int line, int column) { super(line, column); this.y = y; }
    public Expr getY() { return y; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
