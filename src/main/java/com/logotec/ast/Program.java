package com.logotec.ast;

import java.util.List;

/**
 * Root of the AST: a program containing top-level declarations and statements.
 */
public class Program implements Node {
    private final List<Node> entries;
    private final int line;
    private final int column;

    public Program(List<Node> entries, int line, int column) {
        this.entries = entries;
        this.line = line;
        this.column = column;
    }

    public List<Node> getEntries() { return entries; }

    @Override public int getLine() { return line; }
    @Override public int getColumn() { return column; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitProgram(this); }
}
