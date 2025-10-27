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
            //Prueba Combinada
            source = "// {Pruebas basicas - LogoTEC}\n" +
                    "\n" +
                    "// Procedimiento simple\n" +
                    "INIC x = 10;\n" +
                    "INIC y = 20;\n" +
                    "PARA test_basico1 [x y]\n" +
                    "    AVANZA 60;\n" +
                    "    GIRADERECHA 90;\n" +
                    "FIN\n" +
                    "\n" +
                    "// Variables y operaciones basicas\n" +
                    "INIC suma_total = SUMA x y;\n" +
                    "\n" +
                    "// Instrucciones basicas\n" +
                    "CENTRO;\n" +
                    "BAJALAPIZ;\n" +
                    "HAZ test_basico 10;\n" +
                    "PONCOLORLAPIZ AZUL;\n" +
                    "\n" +
                    "// Condicional\n" +
                    "SI (IGUALES? x 10) [\n" +
                    "    AVANZA 100;\n" +
                    "];\n" +
                    "\n" +
                    "// Repeticion\n" +
                    "REPITE 3 [\n" +
                    "    GIRADERECHA 120;\n" +
                    "    AVANZA 80;\n" +
                    "];";

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
        Path out = Paths.get("src/main/java/programa.ll");
        llvm.emit(optimized, out);
        System.out.println("Generado LLVM IR en: " + out.toAbsolutePath());

    }
}
