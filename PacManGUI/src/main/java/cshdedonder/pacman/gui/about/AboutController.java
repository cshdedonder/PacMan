package cshdedonder.pacman.gui.about;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AboutController {

    @FXML
    private WebView webview;

    @FXML
    private void initialize() {
        try {
            webview.getEngine().loadContent(Files.readString(Paths.get(getClass().getResource("/about/about.html").toURI())));
        } catch (IOException | URISyntaxException ignored) {
        }
    }
}
