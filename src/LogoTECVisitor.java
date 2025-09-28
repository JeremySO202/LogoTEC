import Parser.LogoTECBaseVisitor;
import Parser.LogoTECParser;

public class LogoTECVisitor extends LogoTECBaseVisitor {


    @Override public Object visitProg(LogoTECParser.ProgContext ctx) {
        System.out.println("Se inicio el programa");
        return visitChildren(ctx);
    }

    @Override public Object visitStat(LogoTECParser.StatContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpr(LogoTECParser.ExprContext ctx) { return visitChildren(ctx); }

}
