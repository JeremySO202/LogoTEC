package com.logotec;

import com.logotec.parser.LogoTECLexer;
import com.logotec.parser.LogoTECParser;
import com.logotec.semantics.ErrorReporter;
import com.logotec.semantics.SemanticAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Clase principal para ejecutar el análisis semántico de LogoTEC
 */
public class SemanticTestMain {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║          LogoTEC - Analizador Semántico                    ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝\n");
            System.out.println("No se proporcionaron archivos. Ejecutando archivos de prueba...\n");
            runBuiltInSamples();
            System.out.println("\nSugerencia: Ejecute con archivos personalizados:");
            System.out.println("   mvn exec:java -Dexec.mainClass=\"com.logotec.SemanticTestMain\" -Dexec.args=\"ruta/archivo.jabf\"");
            return;
        }

        for (String arg : args) {
            Path p = Paths.get(arg);
            if (!Files.exists(p)) {
                System.err.println("[ERROR] Archivo no encontrado: " + arg);
                continue;
            }
            String source = new String(Files.readAllBytes(p));
            analyzeSource(source, p.toString());
        }
    }

    private static void runBuiltInSamples() {
        List<String> candidates = Arrays.asList(
                "src/test/prueba_basica.jabf",
                "src/test/prueba_avanzada.jabf",
                "src/test/prueba_completa.jabf"
        );

        boolean foundAny = false;
        for (String c : candidates) {
            Path p = Paths.get(c);
            if (Files.exists(p)) {
                foundAny = true;
                try {
                    String source = new String(Files.readAllBytes(p));
                    analyzeSource(source, p.toString());
                } catch (IOException e) {
                    System.err.println("⚠[WARN] No se pudo leer: " + p + " -> " + e.getMessage());
                }
            }
        }

        if (!foundAny) {
            System.out.println("⚠No se encontraron archivos de prueba en src/test/");
        }
    }

    private static void analyzeSource(String source, String label) {
        try {
            CharStream input = CharStreams.fromString(source);
            LogoTECLexer lexer = new LogoTECLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogoTECParser parser = new LogoTECParser(tokens);
            ParseTree tree = parser.program();

            ErrorReporter reporter = new ErrorReporter();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(reporter);
            analyzer.visit(tree);

            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║ Análisis semántico: " + truncate(label, 39) + "║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");

            if (reporter.hasErrors()) {
                reporter.printAll();
            } else {
                System.out.println("Sin errores semánticos.");
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println("❌ [FALLO] Error procesando " + label + ": " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    private static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return String.format("%-" + maxLength + "s", str);
        }
        return str.substring(0, maxLength - 3) + "...";
    }
}

