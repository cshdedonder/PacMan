package cshdedonder.pacman.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Properties;

public class Main extends Application {

    private static final String RES_FXML = "/main.fxml";
    private static final String RES_PROPERTIES = "/main.properties";

    private static final Properties properties = new Properties();

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(properties.getProperty("title"));
        stage.setResizable(Boolean.getBoolean(properties.getProperty("resizable")));
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(RES_FXML))));
        stage.show();
    }

    public static void main(String[] args) throws Exception{
        properties.load(Main.class.getResourceAsStream(RES_PROPERTIES));
        launch();
    }
}
