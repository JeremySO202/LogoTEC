package com.logotec.ui;

import com.logotec.parser.LogoTECLexer;
import com.logotec.parser.LogoTECParser;
import com.logotec.semantics.ErrorReporter;
import com.logotec.semantics.SemanticAnalyzer;
import com.logotec.semantics.SemanticError;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.ScrollPane;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Controlador principal de la interfaz gráfica de LogoTEC
 */
public class IDLE_Controller implements Initializable {

    private FileChooser fileChooser = new FileChooser();
    private File currentFile = null;

    @FXML
    private TextArea codeArea;

    @FXML
    private Canvas canvas;

    @FXML
    private ScrollPane errorPanel;

    /**
     * Abre un archivo y carga su contenido en el área de código
     */
    @FXML
    public void openFile(ActionEvent actionEvent) {
        File file = fileChooser.showOpenDialog(new Stage());
        if (file == null) {
            return; // Usuario canceló
        }
        currentFile = file;
        codeArea.clear();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                codeArea.appendText(scanner.nextLine() + "\n");
            }
            scanner.close();
            draw();
            System.out.println("Archivo cargado: " + file.getName());
        } catch (FileNotFoundException e) {
            System.err.println("Error al abrir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Compila el código actual y genera el ejecutable
     */
    @FXML
    public void compile(ActionEvent actionEvent) {
        System.out.println("Iniciando compilación...");

        String sourceCode = codeArea.getText().trim();
        if (sourceCode.isEmpty()) {
            System.err.println("No hay código para compilar");
            return;
        }

        try {
            // Fase 1: Análisis léxico y sintáctico
            System.out.println("Fase 1: Análisis léxico y sintáctico");
            CharStream input = CharStreams.fromString(sourceCode);
            LogoTECLexer lexer = new LogoTECLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogoTECParser parser = new LogoTECParser(tokens);
            ParseTree tree = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Errores de sintaxis encontrados");
                return;
            }

            // Fase 2: Análisis semántico
            System.out.println("Fase 2: Análisis semántico");
            ErrorReporter reporter = new ErrorReporter();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(reporter);
            analyzer.visit(tree);

            if (reporter.hasErrors()) {
                System.err.println("Errores semánticos encontrados:");
                for (SemanticError error : reporter.getErrors()) {
                    System.err.println("  • " + error.toString());
                }
                return;
            }

            // Fase 3: Generación de código
            System.out.println("Fase 3: Generación de código intermedio");
            compileToExecutable(sourceCode);

            System.out.println("Compilación completada exitosamente");
            System.out.println("Ejecutable generado: program");

        } catch (Exception e) {
            System.err.println("Error durante la compilación: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Compila el código fuente a un ejecutable
     */
    private void compileToExecutable(String sourceCode) {
        try {
            String workingDir = System.getProperty("user.dir");
            String srcDir = workingDir + "/src/main/java";

            // Verificar que exista el runtime compilado
            File runtimeObj = new File(srcDir, "logo_runtime.o");
            if (!runtimeObj.exists()) {
                System.err.println("⚠️ Runtime no compilado, compilando logo_runtime.cpp...");
                compileRuntime(srcDir);
            }

            // Escribir el código fuente a un archivo temporal
            File tempSource = new File(workingDir, "temp_source.logo");
            try (PrintWriter writer = new PrintWriter(tempSource)) {
                writer.write(sourceCode);
            }

            // Usar el pipeline de compilación directamente desde Java
            // en lugar de ejecutar IRTestMain como proceso externo
            System.out.println("Generando código intermedio (IR)...");
            generateIRFromSource(tempSource.getAbsolutePath(), srcDir);

            // Compilar LLVM IR a nativo
            System.out.println("Compilando a código nativo...");
            compileToNative(srcDir);

            // Limpiar archivo temporal
            tempSource.delete();

        } catch (Exception e) {
            throw new RuntimeException("Error en compilación: " + e.getMessage(), e);
        }
    }

    /**
     * Genera el IR desde el código fuente usando las clases del compilador
     */
    private void generateIRFromSource(String sourceFilePath, String outputDir) throws Exception {
        // Leer el código fuente
        String source = new String(java.nio.file.Files.readAllBytes(Paths.get(sourceFilePath)));

        // Fase 1: Parse (léxico y sintáctico)
        CharStream input = CharStreams.fromString(source);
        LogoTECLexer lexer = new LogoTECLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogoTECParser parser = new LogoTECParser(tokens);
        LogoTECParser.ProgramContext tree = parser.program();

        // Fase 2: Construir AST
        com.logotec.ast.ASTBuilder builder = new com.logotec.ast.ASTBuilder();
        com.logotec.ast.Node ast = builder.visitProgram(tree);

        // Fase 3: Generar IR desde el AST
        com.logotec.ir.ASTToIRVisitor irgen = new com.logotec.ir.ASTToIRVisitor();
        ast.accept(irgen);
        com.logotec.ir.IRProgram ir = irgen.getProgram();

        // Fase 4: Optimizar IR
        com.logotec.ir.IROptimizer optimizer = new com.logotec.ir.IROptimizer();
        com.logotec.ir.IRProgram optimized = optimizer.optimize(ir);

        // Fase 5: Emitir LLVM IR
        com.logotec.ir.IRToLLVMEmitter emitter = new com.logotec.ir.IRToLLVMEmitter();
        Path llvmOutput = Paths.get(outputDir, "programa.ll");
        emitter.emit(optimized, llvmOutput);

        System.out.println("IR generado: " + llvmOutput);
    }

    /**
     * Compila el runtime de C++ a .o
     */
    private void compileRuntime(String srcDir) throws Exception {
        System.out.println("Compilando runtime C++...");

        ProcessBuilder pb = new ProcessBuilder(
                "clang++", "-c", "logo_runtime.cpp", "-o", "logo_runtime.o", "-std=c++11"
        );
        pb.directory(new File(srcDir));
        pb.redirectErrorStream(true);

        Process process = pb.start();

        Scanner scanner = new Scanner(process.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("Error compilando runtime C++");
        }

        System.out.println("Runtime compilado exitosamente");
    }

    /**
     * Compila el archivo LLVM IR a código nativo
     */
    private void compileToNative(String srcDir) throws Exception {
        // Paso 1: Compilar LLVM IR a código objeto
        System.out.println("Compilando LLVM IR a código objeto...");
        ProcessBuilder pb1 = new ProcessBuilder("llc", "-filetype=obj", "programa.ll", "-o", "programa.o");
        pb1.directory(new File(srcDir));
        pb1.redirectErrorStream(true);

        Process process1 = pb1.start();

        Scanner scanner1 = new Scanner(process1.getInputStream());
        StringBuilder output1 = new StringBuilder();
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            output1.append(line).append("\n");
            System.out.println(line);
        }
        scanner1.close();

        int exitCode1 = process1.waitFor();
        if (exitCode1 != 0) {
            throw new RuntimeException("Error compilando LLVM IR: " + output1.toString());
        }

        // Paso 2: Enlazar con el runtime y crear ejecutable final
        System.out.println("Enlazando con runtime...");
        ProcessBuilder pb2 = new ProcessBuilder(
                "clang++", "programa.o", "logo_runtime.o", "-o", "program", "-lm"
        );
        pb2.directory(new File(srcDir));
        pb2.redirectErrorStream(true);

        Process process2 = pb2.start();

        Scanner scanner2 = new Scanner(process2.getInputStream());
        StringBuilder output2 = new StringBuilder();
        while (scanner2.hasNextLine()) {
            String line = scanner2.nextLine();
            output2.append(line).append("\n");
            System.out.println(line);
        }
        scanner2.close();

        int exitCode2 = process2.waitFor();
        if (exitCode2 != 0) {
            throw new RuntimeException("Error en enlazado: " + output2.toString());
        }

        System.out.println("Ejecutable 'program' creado exitosamente en: " + srcDir + "/program");
    }

    /**
     * Ejecuta el programa compilado y dibuja en el canvas
     */
    @FXML
    public void execute(ActionEvent actionEvent) {
        System.out.println("Ejecutando programa compilado...");

        try {
            String workingDir = System.getProperty("user.dir");
            String srcDir = workingDir + "/src/main/java";
            File executable = new File(srcDir, "program");

            if (!executable.exists()) {
                System.err.println("❌ No se encontró el ejecutable. Debe compilar primero.");
                System.err.println("Buscando en: " + executable.getAbsolutePath());
                return;
            }

            if (!executable.canExecute()) {
                System.err.println("El archivo no tiene permisos de ejecución, otorgando...");
                ProcessBuilder chmodPb = new ProcessBuilder("chmod", "+x", executable.getAbsolutePath());
                chmodPb.start().waitFor();
            }

            // Limpiar canvas antes de ejecutar
            clearCanvas();

            // Ejecutar el programa y capturar su salida
            ProcessBuilder pb = new ProcessBuilder(executable.getAbsolutePath());
            pb.directory(new File(srcDir));
            pb.redirectErrorStream(true);

            System.out.println("Ejecutando: " + executable.getAbsolutePath());
            Process process = pb.start();

            // Leer e interpretar la salida del programa
            Scanner scanner = new Scanner(process.getInputStream());
            System.out.println("Procesando comandos de dibujo:");
            System.out.println("=" .repeat(40));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                processDrawCommand(line);
            }
            scanner.close();

            int exitCode = process.waitFor();
            System.out.println("=" .repeat(40));
            if (exitCode == 0) {
                System.out.println("Programa ejecutado exitosamente");
            } else {
                System.err.println("Programa terminó con código de error: " + exitCode);
            }

        } catch (Exception e) {
            System.err.println("Error ejecutando el programa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Procesa un comando de dibujo del programa compilado
     */
    private void processDrawCommand(String command) {
        if (canvas == null) return;

        GraphicsContext gc = canvas.getGraphicsContext2D();
        String[] parts = command.trim().split("\\s+");

        // Obtener centro del canvas para transformación de coordenadas
        double centerX = canvas.getWidth() / 2;
        double centerY = canvas.getHeight() / 2;

        try {
            switch (parts[0]) {
                case "RESET":
                    clearCanvas();
                    // Configurar estilo inicial
                    gc.setStroke(Color.BLACK);
                    gc.setLineWidth(2.0);
                    break;

                case "LINE":
                    if (parts.length >= 5) {
                        // Coordenadas Logo (origen en centro, Y+ hacia arriba)
                        double logoX1 = Double.parseDouble(parts[1]);
                        double logoY1 = Double.parseDouble(parts[2]);
                        double logoX2 = Double.parseDouble(parts[3]);
                        double logoY2 = Double.parseDouble(parts[4]);

                        // Transformar a coordenadas Canvas (origen arriba-izquierda, Y+ hacia abajo)
                        double canvasX1 = centerX + logoX1;
                        double canvasY1 = centerY - logoY1;  // Invertir Y
                        double canvasX2 = centerX + logoX2;
                        double canvasY2 = centerY - logoY2;  // Invertir Y

                        gc.strokeLine(canvasX1, canvasY1, canvasX2, canvasY2);
                    }
                    break;

                case "POSITION":
                    // Actualizar posición (no dibuja)
                    break;

                case "ANGLE":
                    // Actualizar ángulo (no dibuja)
                    break;

                case "PENDOWN":
                    gc.setStroke(Color.BLACK);
                    break;

                case "PENUP":
                    // No hacer nada
                    break;

                case "COLOR":
                    if (parts.length >= 2) {
                        switch (parts[1]) {
                            case "NEGRO":
                                gc.setStroke(Color.BLACK);
                                break;
                            case "AZUL":
                                gc.setStroke(Color.BLUE);
                                break;
                            case "ROJO":
                                gc.setStroke(Color.RED);
                                break;
                            case "VERDE":
                                gc.setStroke(Color.GREEN);
                                break;
                            case "AMARILLO":
                                gc.setStroke(Color.YELLOW);
                                break;
                        }
                    }
                    break;

                case "OCULTATORTUGA":
                    // No hacer nada visible
                    break;

                case "ESPERA":
                    // Por ahora no implementamos delays en la GUI
                    break;
            }
        } catch (Exception e) {
            System.err.println("⚠️ Error procesando comando: " + command);
        }
    }

    private static ParseTree getAST_Tree(String source) {
        try {
            CharStream input = CharStreams.fromString(source);
            LogoTECLexer lexer = new LogoTECLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogoTECParser parser = new LogoTECParser(tokens);
            ParseTree tree = parser.program();

            ErrorReporter reporter = new ErrorReporter();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(reporter);
            analyzer.visit(tree);

            if (reporter.hasErrors()) {
                for (SemanticError error : reporter.getErrors()) {
                    System.out.println(error.toString());
                }
            } else {
                System.out.println("Sin errores semánticos.");
                return tree;
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println("[FALLO] Error procesando: " + e.getMessage());
            e.printStackTrace(System.err);
        }
        return null;
    }

    /**
     * Borra el contenido del área de código y limpia el canvas
     */
    @FXML
    public void erase(ActionEvent actionEvent) {
        codeArea.clear();
        currentFile = null;
        clearCanvas();
        System.out.println("🗑️  Contenido borrado");
    }

    /**
     * Guarda el código editado en el archivo actual o en uno nuevo
     */
    @FXML
    public void editDone(ActionEvent actionEvent) {
        if (currentFile != null) {
            saveSystem(currentFile, codeArea.getText());
        } else {
            File file = fileChooser.showSaveDialog(new Stage());
            if (file != null) {
                currentFile = file;
                saveSystem(file, codeArea.getText());
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File testDir = new File("src/test");
        if (testDir.exists() && testDir.isDirectory()) {
            fileChooser.setInitialDirectory(testDir);
        } else {
            fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        }

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Archivos LogoTEC (*.jabf)", "*.jabf"),
                new FileChooser.ExtensionFilter("Todos los archivos", "*.*")
        );

        System.out.println("Interfaz LogoTEC inicializada");
    }

    /**
     * Guarda el código en el archivo especificado
     */
    private void saveSystem(File file, String code) {
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(code);
            printWriter.close();
            System.out.println("Archivo guardado: " + file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Dibuja en el canvas
     */
    private void draw() {
        if (canvas == null) return;

        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        // Dibujar ejes de referencia
        gc.setStroke(Color.LIGHTGRAY);
        gc.setLineWidth(1);

        double centerX = canvas.getWidth() / 2;
        double centerY = canvas.getHeight() / 2;

        gc.strokeLine(0, centerY, canvas.getWidth(), centerY);
        gc.strokeLine(centerX, 0, centerX, canvas.getHeight());
    }

    /**
     * Limpia el contenido del canvas
     */
    private void clearCanvas() {
        if (canvas != null) {
            canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        }
    }
}