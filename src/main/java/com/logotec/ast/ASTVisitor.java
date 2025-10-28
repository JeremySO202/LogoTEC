package com.logotec.ast;

/**
 * Visitor interface for AST nodes.
 */
public interface ASTVisitor<R> {
    R visitProgram(Program node);

    // Expressions
    R visitBinaryExpr(BinaryExpr node);
    R visitLiteralExpr(LiteralExpr node);
    R visitVariableExpr(VariableExpr node);

    // Statements
    R visitExpressionStmt(ExpressionStmt node);
    R visitVarDeclStmt(VarDeclStmt node);
    R visitProcDeclStmt(ProcDeclStmt node);

    // Generic node visit (fallback for grammar-named nodes)
    R visitNode(Node node);
}
