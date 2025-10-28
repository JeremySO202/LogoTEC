package com.logotec.ast;

/**
 * Base interface for all AST nodes.
 * Provides source position info and accept for visitor.
 */
public interface Node {
    int getLine();
    int getColumn();

    <R> R accept(ASTVisitor<R> visitor);
}
