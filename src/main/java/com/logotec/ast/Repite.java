package com.logotec.ast;

import java.util.List;

public class Repite extends Stmt {
    private final Expr count;
    private final List<Node> body;

    public Repite(Expr count, List<Node> body, int line, int column) {
        super(line, column);
        this.count = count;
        this.body = body;
    }

    public Expr getCount() { return count; }
    public List<Node> getBody() { return body; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
