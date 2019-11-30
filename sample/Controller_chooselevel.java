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
    public void loadgameplay_level2(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("Level2.fxml"));
        choose_level.getChildren().setAll(p);
    }
    public void loadgameplay_level3(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("Level3.fxml"));
        choose_level.getChildren().setAll(p);
    }
    public void loadgameplay_level4(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("Level4.fxml"));
        choose_level.getChildren().setAll(p);
    }
    public void loadgameplay_level5(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("Level5.fxml"));
        choose_level.getChildren().setAll(p);
    }

    public void mainmenu(javafx.scene.input.MouseEvent mouseEvent ) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        choose_level.getChildren().setAll(p);
    }
}
