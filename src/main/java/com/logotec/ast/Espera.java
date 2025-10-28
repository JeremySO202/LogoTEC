package com.logotec.ast;

public class Espera extends Stmt {
    private final Expr tiempo;

    public Espera(int line, int column, Expr tiempo) {
        super(line, column);
        this.tiempo = tiempo;
    }

    public Expr getTiempo() {
        return tiempo;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNode(this);
    }
}

