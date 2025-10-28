package com.logotec.ast;

import java.util.List;

public class Haz_mientras extends Stmt {
    private final List<Node> body;
    private final Expr condicion;

    public Haz_mientras(List<Node> body, Expr condicion, int line, int column) {
        super(line, column);
        this.body = body;
        this.condicion = condicion;
    }

    public List<Node> getBody() { return body; }
    public Expr getCondicion() { return condicion; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
