package com.logotec.ast;

public class Centro extends Stmt {
    public Centro(int line, int column) { super(line, column); }
    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
