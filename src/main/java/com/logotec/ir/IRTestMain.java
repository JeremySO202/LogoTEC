package com.logotec.ir;

import com.logotec.ast.ASTBuilder;
import com.logotec.ast.Node;
import com.logotec.parser.LogoTECLexer;
import com.logotec.parser.LogoTECParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IRTestMain {
    public static void main(String[] args) throws Exception {
        String source;
        if (args.length > 0) {
            source = Files.readString(Path.of(args[0]));
        } else {
            // ----------- Programas de prueba

            //por la gramatica definida se debe colocar un comentario al inicio
            //source = "// {Prueba - IR}\nINIC contador = 7;\nAVANZA 10;\nHAZ contador 5;\n";

            //------Pruebas para la optimizacion----------

            //Prueba para la Fusion de movimientos
            /*source = "// {Prueba - Fusion de movimientos}\n" +
                    "INIC contador = 7;\n" +
                    "AVANZA 10;\n" +
                    "AVANZA 15;\n" +
                    "AVANZA 5;\n" +
                    "HAZ contador 5;\n";*/

            //Prueba para la Eliminacion de Stores
            /*source = "// {Prueba - Eliminacion de stores}\n" +
                    "HAZ x 10;\n" +
                    "HAZ x 20;\n" +
                    "AVANZA 5;\n";*/



            //Prueba Combinada
            source = "// {Prueba - Combinada}\n" +
                    "HAZ contador 1;\n" +
                    "HAZ contador 2;\n" +
                    "AVANZA 5;\n" +
                    "AVANZA 10;\n" +
                    "HAZ contador 3;\n";

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

        // Optimización
        IROptimizer optimizer = new IROptimizer();
        IRProgram optimized = optimizer.optimize(ir);

        //Impresiones del IR y el IR optimizado
        System.out.println("=== IR ORIGINAL ===");
        System.out.println(ir);

        System.out.println("=== IR OPTIMIZADO ===");
        System.out.println(optimized);

        IRToLLVMEmitter llvm = new IRToLLVMEmitter();
        Path out = Paths.get("generated_code.ll");
        llvm.emit(ir, out);
        System.out.println("Generado LLVM IR en: " + out.toAbsolutePath());

    }
}
