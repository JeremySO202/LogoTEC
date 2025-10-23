package com.logotec.ast;

import java.util.List;

/** INC: increment operation with one or two numeric_val inside brackets */
public class Inc extends Stmt {
    private final List<Expr> values; // typically [id, amount]

    public Inc(List<Expr> values, int line, int column) {
        super(line, column);
        this.values = values;
    }

    public List<Expr> getValues() { return values; }

    @Override public <R> R accept(ASTVisitor<R> visitor) { return visitor.visitNode(this); }
}
