package com.logotec.ast;

public class Giraizquierda extends Stmt {
    private final Expr angulo;
    public Giraizquierda(Expr angulo, int line, int column) { super(line, column); this.angulo = angulo; }
    public Expr getAngulo() { return angulo; }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
