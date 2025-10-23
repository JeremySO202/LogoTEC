package com.logotec.ast;

import java.util.List;

public class Hasta extends Stmt {
    private final Expr condicion;
    private final List<Node> body;

    public Hasta(Expr condicion, List<Node> body, int line, int column) {
        super(line, column);
        this.condicion = condicion;
        this.body = body;
    }

    public Expr getCondicion() { return condicion; }
    public List<Node> getBody() { return body; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
