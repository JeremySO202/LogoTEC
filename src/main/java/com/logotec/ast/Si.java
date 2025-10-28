package com.logotec.ast;

import java.util.List;

public class Si extends Stmt {
    private final Expr condicion;
    private final List<Node> entonces; // ordenes
    private final List<Node> sino; // optional else block

    public Si(Expr condicion, List<Node> entonces, List<Node> sino, int line, int column) {
        super(line, column);
        this.condicion = condicion;
        this.entonces = entonces;
        this.sino = sino;
    }

    public Expr getCondicion() { return condicion; }
    public List<Node> getEntonces() { return entonces; }
    public List<Node> getSino() { return sino; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
