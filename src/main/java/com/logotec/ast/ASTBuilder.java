package com.logotec.ast;

import com.logotec.parser.LogoTECBaseVisitor;
import com.logotec.parser.LogoTECParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * AST builder: visits the ANTLR parse tree and constructs the AST nodes whose
 * class names correspond to grammar names (e.g., `Si`, `Repite`, `Avanza`, ...).
 *
 * This implementation covers the common constructs: program, procedimientos,
 * ordenes, instrucciones importantes y expresiones aritméticas/booleanas.
 */
public class ASTBuilder extends LogoTECBaseVisitor<Node> {

    // ---------------------- Program / top-level ----------------------
    @Override
    public Node visitProgram(LogoTECParser.ProgramContext ctx) {
        List<Node> entries = new ArrayList<>();
        for (LogoTECParser.ProcedimientosContext pctx : ctx.procedimientos()) {
            Node n = visit(pctx);
            if (n != null) entries.add(n);
        }
        for (LogoTECParser.OrdenesContext octx : ctx.ordenes()) {
            Node n = visit(octx);
            if (n != null) entries.add(n);
        }
        Token start = ctx.getStart();
        return new Program(entries, start.getLine(), start.getCharPositionInLine());
    }

    @Override
    public Node visitProcedimientos(LogoTECParser.ProcedimientosContext ctx) {
        List<Node> list = new ArrayList<>();
        for (var child : ctx.procedimiento()) {
            Node n = visit(child);
            if (n != null) list.add(n);
        }
        // If there's only one procedimiento, return it; otherwise wrap in Program-style list node
        Token t = ctx.getStart();
        return new Program(list, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitProcedimiento(LogoTECParser.ProcedimientoContext ctx) {
        String name = ctx.ID().getText();
        List<String> params = new ArrayList<>();
        LogoTECParser.ParametrosContext pctx = ctx.parametros();
        if (pctx != null && pctx.ID() != null) {
            for (var id : pctx.ID()) params.add(id.getText());
        }
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Token t = ctx.getStart();
        return new ProcDeclStmt(name, params, body, t.getLine(), t.getCharPositionInLine());
    }

    // ---------------------- Orders / instructions ----------------------
    @Override
    public Node visitOrdenes(LogoTECParser.OrdenesContext ctx) {
        List<Node> list = new ArrayList<>();
        for (var ord : ctx.orden()) {
            Node n = visit(ord);
            if (n != null) list.add(n);
        }
        // wrap as a Program-like block node
        Token t = ctx.getStart();
        return new ProcDeclStmt("<block>", List.of(), list, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitOrden(LogoTECParser.OrdenContext ctx) {
        return visit(ctx.instruccion());
    }

    // ---------------------- instruccion-specific ----------------------
    @Override
    public Node visitInic(LogoTECParser.InicContext ctx) {
        String id = ctx.ID().getText();
        Expr init = exprFromRightHand(ctx);
        Token t = ctx.getStart();
        return new VarDeclStmt(id, init, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitHaz(LogoTECParser.HazContext ctx) {
        String id = ctx.ID().getText();
        Expr value = null;
        if (ctx.numeric_val() != null) value = (Expr) visit(ctx.numeric_val());
        else if (ctx.boolean_val() != null) value = (Expr) visit(ctx.boolean_val());
        else if (ctx.STRING() != null) {
            Token s = ctx.STRING().getSymbol();
            value = new LiteralExpr(stripQuotes(s.getText()), s.getLine(), s.getCharPositionInLine());
        }
        Token t = ctx.getStart();
        return new Haz(id, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitHaz_hasta(LogoTECParser.Haz_hastaContext ctx) {
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Expr cond = (Expr) visit(ctx.boolean_val());
        Token t = ctx.getStart();
        return new Haz_hasta(body, cond, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitHasta(LogoTECParser.HastaContext ctx) {
        Expr cond = (Expr) visit(ctx.boolean_val());
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Token t = ctx.getStart();
        return new Hasta(cond, body, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitAvanza(LogoTECParser.AvanzaContext ctx) {
        Expr d = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Avanza(d, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitRetrocede(LogoTECParser.RetrocedeContext ctx) {
        Expr d = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Retrocede(d, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitGiraderecha(LogoTECParser.GiraderechaContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Giraderecha(a, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitGiraizquierda(LogoTECParser.GiraizquierdaContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Giraizquierda(a, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPonpos(LogoTECParser.PonposContext ctx) {
        Expr x = (Expr) visit(ctx.numeric_val(0));
        Expr y = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new Ponpos(x, y, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPonxy(LogoTECParser.PonxyContext ctx) {
        Expr x = (Expr) visit(ctx.numeric_val(0));
        Expr y = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new Ponxy(x, y, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPonrumbo(LogoTECParser.PonrumboContext ctx) {
        Expr r = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Ponrumbo(r, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPonx(LogoTECParser.PonxContext ctx) {
        Expr x = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Ponx(x, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPony(LogoTECParser.PonyContext ctx) {
        Expr y = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Pony(y, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitCentro(LogoTECParser.CentroContext ctx) {
        Token t = ctx.getStart();
        return new Centro(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitBajalapiz(LogoTECParser.BajalapizContext ctx) {
        Token t = ctx.getStart();
        return new Bajalapiz(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitSubelapiz(LogoTECParser.SubelapizContext ctx) {
        Token t = ctx.getStart();
        return new Subelapiz(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPoncolor(LogoTECParser.PoncolorContext ctx) {
        // PONCOLORLAPIZ recibe un COLOR (token)
        String colorText = ctx.COLOR().getText();
        Token t = ctx.getStart();
        
        // Convertir el nombre del color a su valor numérico
        int colorValue = convertirColorANumero(colorText);
        
        // Crear un LiteralExpr con el NÚMERO, no el texto
        Expr color = new LiteralExpr((double)colorValue, t.getLine(), t.getCharPositionInLine());
        return new Poncolorlapiz(color, t.getLine(), t.getCharPositionInLine());
    }

    private int convertirColorANumero(String colorText) {
        switch (colorText.toUpperCase()) {
            case "NEGRO":
                return 0;
            case "AZUL":
                return 1;
            case "ROJO":
                return 2;
            default:
                System.err.println("Color desconocido: " + colorText + ", usando NEGRO por defecto");
                return 0;
        }
    }

    @Override
    public Node visitOcultatortuga(LogoTECParser.OcultatortugaContext ctx) {
        Token t = ctx.getStart();
        return new Ocultatortuga(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitEspera(LogoTECParser.EsperaContext ctx) {
        Expr tiempo = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new Espera(t.getLine(), t.getCharPositionInLine(), tiempo);
    }

    @Override
    public Node visitEjecuta(LogoTECParser.EjecutaContext ctx) {
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Token t = ctx.getStart();
        return new Ejecuta(body, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitInc(LogoTECParser.IncContext ctx) {
        List<Expr> vals = new ArrayList<>();
        if (ctx.numeric_val() != null) {
            vals.add((Expr) visit(ctx.numeric_val(0)));
            if (ctx.numeric_val().size() > 1) vals.add((Expr) visit(ctx.numeric_val(1)));
        }
        Token t = ctx.getStart();
        return new Inc(vals, t.getLine(), t.getCharPositionInLine());
    }

    // ---------------------- Control flow ----------------------
    @Override
    public Node visitRepite(LogoTECParser.RepiteContext ctx) {
        Expr count = (Expr) visit(ctx.numeric_val());
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Token t = ctx.getStart();
        return new Repite(count, body, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitSi(LogoTECParser.SiContext ctx) {
        Expr cond = (Expr) visit(ctx.boolean_val());
        List<Node> thenBlock = extractNodesFromOrdenes(ctx.ordenes(0));
        List<Node> elseBlock = null;
        if (ctx.ordenes().size() > 1) elseBlock = extractNodesFromOrdenes(ctx.ordenes(1));
        Token t = ctx.getStart();
        return new Si(cond, thenBlock, elseBlock, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitHaz_mientras(LogoTECParser.Haz_mientrasContext ctx) {
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Expr cond = (Expr) visit(ctx.boolean_val());
        Token t = ctx.getStart();
        return new Haz_mientras(body, cond, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitMientras(LogoTECParser.MientrasContext ctx) {
        Expr cond = (Expr) visit(ctx.boolean_val());
        List<Node> body = extractNodesFromOrdenes(ctx.ordenes());
        Token t = ctx.getStart();
        return new Mientras(cond, body, t.getLine(), t.getCharPositionInLine());
    }

    // ---------------------- Expressions ----------------------
    @Override
    public Node visitNumeric_val(LogoTECParser.Numeric_valContext ctx) {
        Token t = ctx.getStart();

        // Obtener el texto completo para detectar números negativos
        String fullText = ctx.getText();

        if (ctx.NUMERO() != null) {
            String txt = fullText;  // Usa el texto completo que incluye el signo -
            try {
                double v = Double.parseDouble(txt);
                return new LiteralExpr(v, t.getLine(), t.getCharPositionInLine());
            }
            catch (NumberFormatException ex) {
                return new LiteralExpr(txt, t.getLine(), t.getCharPositionInLine());
            }
        }
        if (ctx.DIGITO() != null) {
            String txt = fullText;  // Usa el texto completo que incluye el signo -
            try {
                double v = Double.parseDouble(txt);
                return new LiteralExpr(v, t.getLine(), t.getCharPositionInLine());
            }
            catch (NumberFormatException ex) {
                return new LiteralExpr(txt, t.getLine(), t.getCharPositionInLine());
            }
        }
        if (ctx.ID() != null) return new VariableExpr(ctx.ID().getText(), t.getLine(), t.getCharPositionInLine());
        if (ctx.operacion() != null) return visit(ctx.operacion());
        if (ctx.rumbo() != null) return new VariableExpr(ctx.rumbo().getText(), t.getLine(), t.getCharPositionInLine());
        if (ctx.PAR_OPEN() != null && ctx.operacion() != null) return visit(ctx.operacion());
        return null;
    }

    @Override
    public Node visitOperacion(LogoTECParser.OperacionContext ctx) {
        return visit(ctx.op_algebraicas());
    }

    @Override
    public Node visitOp_algebraicas(LogoTECParser.Op_algebraicasContext ctx) {
        if (ctx.diferencia() != null) return visit(ctx.diferencia());
        if (ctx.azar() != null) return visit(ctx.azar());
        if (ctx.producto() != null) return visit(ctx.producto());
        if (ctx.potencia() != null) return visit(ctx.potencia());
        if (ctx.division() != null) return visit(ctx.division());
        if (ctx.suma() != null) return visit(ctx.suma());
        return null;
    }

    @Override
    public Node visitSuma(LogoTECParser.SumaContext ctx) {
        List<Expr> ops = new ArrayList<>();
        for (var nv : ctx.numeric_val()) ops.add((Expr) visit(nv));
        return leftAssoc(ops, BinaryExpr.Op.ADD, ctx.getStart());
    }

    @Override
    public Node visitProducto(LogoTECParser.ProductoContext ctx) {
        List<Expr> ops = new ArrayList<>();
        for (var nv : ctx.numeric_val()) ops.add((Expr) visit(nv));
        return leftAssoc(ops, BinaryExpr.Op.MUL, ctx.getStart());
    }

    @Override
    public Node visitDiferencia(LogoTECParser.DiferenciaContext ctx) {
        List<Expr> ops = new ArrayList<>();
        for (var nv : ctx.numeric_val()) ops.add((Expr) visit(nv));
        return leftAssoc(ops, BinaryExpr.Op.SUB, ctx.getStart());
    }

    @Override
    public Node visitDivision(LogoTECParser.DivisionContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val(0));
        Expr b = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.DIV, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitPotencia(LogoTECParser.PotenciaContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val(0));
        Expr b = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.POW, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitAzar(LogoTECParser.AzarContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val());
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.RANDOM, a, null, t.getLine(), t.getCharPositionInLine());
    }

    // ---------------------- Boolean / logical / comparative ----------------------
    @Override
    public Node visitBoolean_val(LogoTECParser.Boolean_valContext ctx) {
        Token t = ctx.getStart();
        if (ctx.BOOLEAN() != null) {
            boolean v = ctx.BOOLEAN().getText().equalsIgnoreCase("TRUE");
            return new LiteralExpr(v, t.getLine(), t.getCharPositionInLine());
        }
        if (ctx.ID() != null) return new VariableExpr(ctx.ID().getText(), t.getLine(), t.getCharPositionInLine());
        if (ctx.op_logica() != null) return visit(ctx.op_logica());
        if (ctx.op_comparativa() != null) return visit(ctx.op_comparativa());
        return new LiteralExpr(false, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitY(LogoTECParser.YContext ctx) {
        Expr a = (Expr) visit(ctx.boolean_val(0));
        Expr b = (Expr) visit(ctx.boolean_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.AND, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitO(LogoTECParser.OContext ctx) {
        Expr a = (Expr) visit(ctx.boolean_val(0));
        Expr b = (Expr) visit(ctx.boolean_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.OR, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitIguales(LogoTECParser.IgualesContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val(0));
        Expr b = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.EQ, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitMayorque(LogoTECParser.MayorqueContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val(0));
        Expr b = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.GT, a, b, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public Node visitMenorque(LogoTECParser.MenorqueContext ctx) {
        Expr a = (Expr) visit(ctx.numeric_val(0));
        Expr b = (Expr) visit(ctx.numeric_val(1));
        Token t = ctx.getStart();
        return new BinaryExpr(BinaryExpr.Op.LT, a, b, t.getLine(), t.getCharPositionInLine());
    }

    // ---------------------- Helpers ----------------------
    private Expr exprFromRightHand(LogoTECParser.InicContext ctx) {
        if (ctx.numeric_val() != null) return (Expr) visit(ctx.numeric_val());
        if (ctx.boolean_val() != null) return (Expr) visit(ctx.boolean_val());
        if (ctx.STRING() != null) {
            Token s = ctx.STRING().getSymbol();
            return new LiteralExpr(stripQuotes(s.getText()), s.getLine(), s.getCharPositionInLine());
        }
        if (ctx.operacion() != null) return (Expr) visit(ctx.operacion());
        return null;
    }

    private List<Node> extractNodesFromOrdenes(LogoTECParser.OrdenesContext ctx) {
        if (ctx == null) return List.of();
        List<Node> nodes = new ArrayList<>();
        for (var ord : ctx.orden()) {
            Node n = visit(ord);
            if (n != null) nodes.add(n);
        }
        return nodes;
    }

    private String stripQuotes(String s) {
        if (s == null) return null;
        if (s.startsWith("\"") && s.endsWith("\"") && s.length() >= 2) return s.substring(1, s.length()-1);
        return s;
    }

    private Expr leftAssoc(List<Expr> ops, BinaryExpr.Op op, Token t) {
        if (ops.isEmpty()) return null;
        if (ops.size() == 1) return ops.get(0);
        Expr current = ops.get(0);
        for (int i = 1; i < ops.size(); i++) {
            current = new BinaryExpr(op, current, ops.get(i), t.getLine(), t.getCharPositionInLine());
        }
        return current;
    }

}
