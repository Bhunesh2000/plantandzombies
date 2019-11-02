package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import java.io.IOException;

public class Controller_home {

    @FXML
    private Pane homepane;
    private Scene scene;

    public void loadgameplay(ActionEvent event) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        homepane.getChildren().setAll(p);
    }
}