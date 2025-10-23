package com.logotec.ast;

public abstract class Stmt implements Node {
    protected final int line;
    protected final int column;

    protected Stmt(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override public int getLine() { return line; }
    @Override public int getColumn() { return column; }
}
