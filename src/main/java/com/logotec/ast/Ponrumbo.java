package com.logotec.ast;

public class Ponrumbo extends Stmt {
    private final Expr rumbo;
    public Ponrumbo(Expr rumbo, int line, int column) { super(line, column); this.rumbo = rumbo; }
    public Expr getRumbo() { return rumbo; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
