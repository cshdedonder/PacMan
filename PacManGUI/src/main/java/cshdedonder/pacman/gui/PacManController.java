package cshdedonder.pacman.gui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

public class PacManController {

    private Scene scene;

    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {

    }

    public void setScene(Scene scene) {
        this.scene = scene;
        //TODO set key event handlers
    }

    @FXML
    private void openGame() {

    }

    @FXML
    private void saveGame() {

    }

    @FXML
    private void newGame() {

    }

    @FXML
    private void exitGame() {
        //TODO confirm leaving without saving
        Platform.exit();
    }

    @FXML
    private void displayHelp() {

    }

    @FXML
    private void displayAbout() {

    }


}
