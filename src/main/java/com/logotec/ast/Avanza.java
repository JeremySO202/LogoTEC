package com.logotec.ast;

public class Avanza extends Stmt {
    private final Expr distancia;

    public Avanza(Expr distancia, int line, int column) {
        super(line, column);
        this.distancia = distancia;
    }

    public Expr getDistancia() { return distancia; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
