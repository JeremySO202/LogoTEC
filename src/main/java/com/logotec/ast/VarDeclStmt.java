package com.logotec.ast;

public class VarDeclStmt extends Stmt {
    private final String name;
    private final Expr initializer; // may be null

    public VarDeclStmt(String name, Expr initializer, int line, int column) {
        super(line, column);
        this.name = name;
        this.initializer = initializer;
    }

    public String getName() { return name; }
    public Expr getInitializer() { return initializer; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitVarDeclStmt(this); }
}
