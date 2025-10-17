import Parser.LogoTECLexer;
import Parser.LogoTECParser;
import Semantics.ErrorReporter;
import Semantics.SemanticAnalyzer;
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

public class SemanticTestMain {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("No se proporcionaron archivos. Ejecutando ejemplos internos...\n");
            runBuiltInSamples();
            System.out.println("\nSugerencia: también puede ejecutar con archivos, por ejemplo:\n  mvn -q -DskipTests package && java -cp target/logotec-1.0-SNAPSHOT.jar org.antlr.v4.runtime.misc.TestRig");
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
        // Sample 1: válido
        // Optional: try to analyze included test files if present
        List<String> candidates = Arrays.asList(
                "src/test/prueba_basica.jabf"
        );
        for (String c : candidates) {
            Path p = Paths.get(c);
            if (Files.exists(p)) {
                try {
                    String source = new String(Files.readAllBytes(p));
                    analyzeSource(source, p.toString());
                } catch (IOException e) {
                    System.err.println("[WARN] No se pudo leer archivo de prueba: " + p + " -> " + e.getMessage());
                }
            }
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

            System.out.println("==== Análisis semántico: " + label + " ====");
            if (reporter.hasErrors()) {
                reporter.printAll();
            } else {
                System.out.println("Sin errores semánticos.");
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println("[FALLO] Error procesando " + label + ": " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
