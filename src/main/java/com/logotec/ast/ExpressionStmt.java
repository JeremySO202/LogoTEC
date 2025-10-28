package com.logotec.ast;

public class ExpressionStmt extends Stmt {
    private final Expr expr;

    public ExpressionStmt(Expr expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }

    public Expr getExpr() { return expr; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitExpressionStmt(this); }
}
