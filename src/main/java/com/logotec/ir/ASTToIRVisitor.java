package com.logotec.ir;

import com.logotec.ast.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Simple AST -> IR translator. Produces a flat list of IR instructions.
 * It is intentionally small and covers core statements and expressions.
 */
public class ASTToIRVisitor implements ASTVisitor<IROperand> {
    private final IRProgram program = new IRProgram();
    private final AtomicInteger tempId = new AtomicInteger(0);
    private final AtomicInteger labelId = new AtomicInteger(0);

    public IRProgram getProgram() { return program; }

    private IRTemp newTemp() { return new IRTemp(tempId.incrementAndGet()); }
    private String newLabel() { return "L" + labelId.incrementAndGet(); }

    // ---------- expressions ----------
    @Override public IROperand visitBinaryExpr(BinaryExpr node) {
        IROperand left = node.getLeft().accept(this);
        IROperand right = node.getRight() == null ? null : node.getRight().accept(this);
        IRTemp t = newTemp();
        program.add(new IRInstr(node.getOp().name(), t, left, right));
        return t;
    }

    @Override public IROperand visitLiteralExpr(LiteralExpr node) {
        return new IRConst(node.getValue());
    }

    @Override public IROperand visitVariableExpr(VariableExpr node) {
        return new IRVar(node.getName());
    }

    @Override
    public IROperand visitProgram(Program node) {
        for (Node n : node.getEntries()) n.accept(this);
        return null;
    }



    // ---------- statements (emit ops and return null) ----------
    @Override public IROperand visitExpressionStmt(ExpressionStmt node) {
        node.getExpr().accept(this);
        return null;
    }

    @Override public IROperand visitVarDeclStmt(VarDeclStmt node) {
        if (node.getInitializer() != null) {
            IROperand v = node.getInitializer().accept(this);
            program.add(new IRInstr("STORE", new IRVar(node.getName()), v));
        } else {
            program.add(new IRInstr("STORE", new IRVar(node.getName()), new IRConst(null)));
        }
        return null;
    }

    @Override public IROperand visitProcDeclStmt(ProcDeclStmt node) {
        // procedures: emit a label and then body
        String lbl = node.getName();
        program.add(new IRInstr("LABEL", new IRConst(lbl)));
        for (Node n : node.getBody()) n.accept(this);
        program.add(new IRInstr("ENDPROC", new IRConst(lbl)));
        return null;
    }

    @Override public IROperand visitNode(Node node) {
        // fallback handler for many Stmt nodes
        if (node instanceof Haz) return visitHaz((Haz) node);
        if (node instanceof Avanza) return visitAvanza((Avanza) node);
        if (node instanceof Retrocede) return visitRetrocede((Retrocede) node);
        if (node instanceof Giraderecha) return visitGiraderecha((Giraderecha) node);
        if (node instanceof Giraizquierda) return visitGiraizquierda((Giraizquierda) node);
        if (node instanceof Ponpos) return visitPonpos((Ponpos) node);
        if (node instanceof Ponxy) return visitPonxy((Ponxy) node);
        if (node instanceof Ponx) return visitPonx((Ponx) node);
        if (node instanceof Pony) return visitPony((Pony) node);
        if (node instanceof Ponrumbo) return visitPonrumbo((Ponrumbo) node);
        if (node instanceof Centro) return visitCentro((Centro) node);
        if (node instanceof Repite) return visitRepite((Repite) node);
        if (node instanceof Si) return visitSi((Si) node);
        if (node instanceof Ejecuta) return visitEjecuta((Ejecuta) node);
        if (node instanceof Inc) return visitInc((Inc) node);
        if (node instanceof Haz_hasta) return visitHaz_hasta((Haz_hasta) node);
        if (node instanceof Hasta) return visitHasta((Hasta) node);
        if (node instanceof Haz_mientras) return visitHaz_mientras((Haz_mientras) node);
        if (node instanceof Mientras) return visitMientras((Mientras) node);
        // unknown node: no-op
        return null;
    }

    // ---------- specific visitors for statements ----------
    public IROperand visitHaz(Haz node) {
        IROperand val = node.getValue() == null ? new IRConst(null) : node.getValue().accept(this);
        program.add(new IRInstr("STORE", new IRVar(node.getName()), val));
        return null;
    }

    public IROperand visitAvanza(Avanza node) {
        IROperand v = node.getDistancia().accept(this);
        program.add(new IRInstr("AVANZA", v));
        return null;
    }

    public IROperand visitRetrocede(Retrocede node) {
        IROperand v = node.getDistancia().accept(this);
        program.add(new IRInstr("RETROCEDE", v));
        return null;
    }

    public IROperand visitGiraderecha(Giraderecha node) {
        IROperand v = node.getAngulo().accept(this);
        program.add(new IRInstr("GIRADERECHA", v));
        return null;
    }

    public IROperand visitGiraizquierda(Giraizquierda node) {
        IROperand v = node.getAngulo().accept(this);
        program.add(new IRInstr("GIRAIZQUIERDA", v));
        return null;
    }

    public IROperand visitPonpos(Ponpos node) {
        IROperand x = node.getX().accept(this);
        IROperand y = node.getY().accept(this);
        program.add(new IRInstr("PONPOS", x, y));
        return null;
    }

    public IROperand visitPonxy(Ponxy node) {
        IROperand x = node.getX().accept(this);
        IROperand y = node.getY().accept(this);
        program.add(new IRInstr("PONXY", x, y));
        return null;
    }

    public IROperand visitPonx(Ponx node) { program.add(new IRInstr("PONX", node.getX().accept(this))); return null; }
    public IROperand visitPony(Pony node) { program.add(new IRInstr("PONY", node.getY().accept(this))); return null; }
    public IROperand visitPonrumbo(Ponrumbo node) { program.add(new IRInstr("PONRUMBO", node.getRumbo().accept(this))); return null; }
    public IROperand visitCentro(Centro node) { program.add(new IRInstr("CENTRO")); return null; }

    public IROperand visitRepite(Repite node) {
        IROperand count = node.getCount().accept(this);
        String start = newLabel();
        String end = newLabel();
        program.add(new IRInstr("LABEL", new IRConst(start)));
        // decrement count and check
        IRTemp ctemp = newTemp();
        program.add(new IRInstr("STORE", ctemp, count));
        for (Node n : node.getBody()) n.accept(this);
        program.add(new IRInstr("DEC", ctemp));
        program.add(new IRInstr("CJMP_GT", ctemp, new IRConst(0), new IRConst(start)));
        program.add(new IRInstr("LABEL", new IRConst(end)));
        return null;
    }

    public IROperand visitSi(Si node) {
        IROperand cond = node.getCondicion().accept(this);
        String Ltrue = newLabel();
        String Lend = newLabel();
        program.add(new IRInstr("CJMP", cond, new IRConst(Ltrue)));
        // else
        if (node.getSino() != null) for (Node n : node.getSino()) n.accept(this);
        program.add(new IRInstr("JMP", new IRConst(Lend)));
        program.add(new IRInstr("LABEL", new IRConst(Ltrue)));
        for (Node n : node.getEntonces()) n.accept(this);
        program.add(new IRInstr("LABEL", new IRConst(Lend)));
        return null;
    }

    public IROperand visitEjecuta(Ejecuta node) { for (Node n : node.getBody()) n.accept(this); return null; }

    public IROperand visitInc(Inc node) {
        // expected: [var, amount]
        if (node.getValues().size() >= 2) {
            Expr var = node.getValues().get(0);
            Expr amt = node.getValues().get(1);
            IROperand v = var.accept(this);
            IROperand a = amt.accept(this);
            program.add(new IRInstr("INC", v, a));
        }
        return null;
    }

    public IROperand visitHaz_hasta(Haz_hasta node) {
        // do { body } while (!cond)
        String start = newLabel();
        program.add(new IRInstr("LABEL", new IRConst(start)));
        for (Node n : node.getBody()) n.accept(this);
        IROperand cond = node.getCondicion().accept(this);
        program.add(new IRInstr("CJMP_FALSE", cond, new IRConst(start)));
        return null;
    }

    public IROperand visitHasta(Hasta node) {
        // while (!cond) { body } with condition first? Grammar: HASTA (cond) [body]; implement as while cond false
        String start = newLabel();
        program.add(new IRInstr("LABEL", new IRConst(start)));
        for (Node n : node.getBody()) n.accept(this);
        IROperand cond = node.getCondicion().accept(this);
        program.add(new IRInstr("CJMP_FALSE", cond, new IRConst(start)));
        return null;
    }

    public IROperand visitHaz_mientras(Haz_mientras node) { return visitHaz_hasta(new Haz_hasta(node.getBody(), node.getCondicion(), node.getLine(), node.getColumn())); }
    public IROperand visitMientras(Mientras node) { return visitHasta(new Hasta(node.getCondicion(), node.getBody(), node.getLine(), node.getColumn())); }

}
