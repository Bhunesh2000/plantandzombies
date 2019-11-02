package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class Controller_chooselevel {
    @FXML
    private Pane choose_level;

    public void loadgameplay(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        choose_level.getChildren().setAll(p);
    }
    public void mainmenu(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        choose_level.getChildren().setAll(p);
    }
}
