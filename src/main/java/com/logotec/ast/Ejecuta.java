package com.logotec.ast;

import java.util.List;

/** Ejecuta: ejecuta un bloque de ordenes (SQUARE_OPEN ordenes SQUARE_CLOSE). */
public class Ejecuta extends Stmt {
    private final List<Node> body;

    public Ejecuta(List<Node> body, int line, int column) {
        super(line, column);
        this.body = body;
    }

    public List<Node> getBody() { return body; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
