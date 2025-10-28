package com.logotec.ast;

public class Subelapiz extends Stmt {
    public Subelapiz(int line, int column) {
        super(line, column);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNode(this);
    }
}

