package com.logotec.ast;

import java.util.List;

public class ProcDeclStmt extends Stmt {
    private final String name;
    private final List<String> params;
    private final List<Node> body;

    public ProcDeclStmt(String name, List<String> params, List<Node> body, int line, int column) {
        super(line, column);
        this.name = name;
        this.params = params;
        this.body = body;
    }

    public String getName() { return name; }
    public List<String> getParams() { return params; }
    public List<Node> getBody() { return body; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitProcDeclStmt(this); }
}
