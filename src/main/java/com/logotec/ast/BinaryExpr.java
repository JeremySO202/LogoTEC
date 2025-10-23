package com.logotec.ast;

/** Binary expression with an operator and two operands. */
public class BinaryExpr extends Expr {
    public enum Op { ADD, SUB, MUL, DIV, POW, RANDOM, EQ, GT, LT, AND, OR }

    private final Op op;
    private final Expr left;
    private final Expr right;

    public BinaryExpr(Op op, Expr left, Expr right, int line, int column) {
        super(line, column);
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public Op getOp() { return op; }
    public Expr getLeft() { return left; }
    public Expr getRight() { return right; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitBinaryExpr(this); }
}
