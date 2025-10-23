package com.logotec.ir;

import com.logotec.ast.ASTBuilder;
import com.logotec.ast.Node;
import com.logotec.parser.LogoTECLexer;
import com.logotec.parser.LogoTECParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Files;
import java.nio.file.Path;

public class IRTestMain {
    public static void main(String[] args) throws Exception {
        String source;
        if (args.length > 0) {
            source = Files.readString(Path.of(args[0]));
        } else {
            // Programa de prueba inline (puedes cambiarlo)
            source = "INIC contador = 7;\nAVANZA 10;\nHAZ contador 5;\n";
        }

        // Parse
        LogoTECLexer lexer = new LogoTECLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogoTECParser parser = new LogoTECParser(tokens);
        LogoTECParser.ProgramContext tree = parser.program();

        // AST
        ASTBuilder builder = new ASTBuilder();
        Node ast = builder.visitProgram(tree); // devuelve Program

        // IR
        ASTToIRVisitor irgen = new ASTToIRVisitor();
        ast.accept(irgen);
        IRProgram ir = irgen.getProgram();

        // Imprime la IR
        System.out.println("=== IR ===");
                System.out.println(ir.toString());
    }
}
