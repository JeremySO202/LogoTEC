package myapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.scene.control.TextArea;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.control.ScrollPane;


public class HelloController implements Initializable {

    FileChooser fileChooser = new FileChooser();
    private File currentFile = null;

    //ELEMENTS AND FUCTIONALITY
    @FXML
    private TextArea codeArea;

    @FXML
    private Canvas canvas;

    @FXML
    private ScrollPane errorPanel;

    //if button "File" clicked scanner scans the file and adds ir to the text area("codeArea")
    public void openFile(ActionEvent actionEvent) {
        File file = fileChooser.showOpenDialog(new Stage());
        currentFile = file;
        codeArea.clear();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                codeArea.appendText(scanner.nextLine() + "\n");
                if (codeArea != null){
                    draw();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //actions for compiling buttons
    public void compile(ActionEvent actionEvent) {
        System.out.println("Compile");
    }
    //actions for execute button
    public void execute(ActionEvent actionEvent) {
        System.out.println("Execute");
    }

    //actions for reseting file that was uploaded
    public void erase(ActionEvent actionEvent) {
        codeArea.clear();
        currentFile = null;
        clearCanvas();
    }

    //actions for button "done" - it saves the code that was written
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
        System.out.println("edit done");
    }


    //INITIALIZE
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fileChooser.setInitialDirectory(new File("C:\\MPointer\\LogoTEC\\src\\test"));
    }

    //method to save the file in the same file it opened instead of saving it as a new file
    public void saveSystem(File file, String code){
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(code);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //this draw method is only a draft
    private void draw() {
        if (canvas == null) return;

        GraphicsContext gc = canvas.getGraphicsContext2D();
        clearCanvas();

        gc.setStroke(Color.RED);
        gc.setLineWidth(2);

        double centerX = canvas.getWidth() / 2;
        double centerY = canvas.getHeight() / 2;

        gc.strokeLine(0, centerY, canvas.getWidth(), centerY);

        gc.strokeLine(centerX, 0, centerX, canvas.getHeight());
    }

    private void clearCanvas() {
        if (canvas != null) {
            canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        }
    }
}
