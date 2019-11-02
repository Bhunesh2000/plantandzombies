package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import javafx.scene.Scene;

import java.io.IOException;

public class Controller {

    @FXML
    private Pane homepane;
    private Scene scene;

    public void loadgameplay(ActionEvent event) throws IOException {
        homepane.getChildren().setAll();

        Pane p= FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        System.out.println(p.getClass());
        scene.setRoot(p);
    }
}
