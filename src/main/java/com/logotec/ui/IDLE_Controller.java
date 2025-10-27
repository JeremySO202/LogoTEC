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
     * Compila el código actual
     */
    @FXML
    public void compile(ActionEvent actionEvent) {
        System.out.println("Compilando código...");
        // TODO: Implementar compilación
    }

    /**
     * Ejecuta el código compilado
     */
    @FXML
    public void execute(ActionEvent actionEvent) {
        System.out.println("Ejecutando código...");
        ParseTree tree = getAST_Tree(codeArea.getText());
        for (int i = 0; i < tree.getChildCount(); i++) {
            System.out.println(tree.getChild(i).getText());
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
                    // Replace with error panel display logic
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
        // Configurar el directorio inicial del FileChooser
        File testDir = new File("src/test");
        if (testDir.exists() && testDir.isDirectory()) {
            fileChooser.setInitialDirectory(testDir);
        } else {
            // Si no existe, usar el directorio home del usuario
            fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        }

        // Configurar filtros de archivo para LogoTEC
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
            System.out.println("💾 Archivo guardado: " + file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.err.println("❌ Error al guardar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Dibuja en el canvas (borrador - se implementará con el intérprete)
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

        // Eje horizontal
        gc.strokeLine(0, centerY, canvas.getWidth(), centerY);
        // Eje vertical
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
