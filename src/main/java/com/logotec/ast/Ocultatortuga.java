package com.logotec.ast;

public class Ocultatortuga extends Stmt {
    public Ocultatortuga(int line, int column) {
        super(line, column);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNode(this);
    }
}

