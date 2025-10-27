package com.logotec.ast;
public class Bajalapiz extends Stmt {
    public Bajalapiz(int line, int column) {
        super(line, column);
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNode(this);
    }
}
