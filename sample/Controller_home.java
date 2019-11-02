package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_home {

    @FXML
    private Pane homepane;
    private javafx.scene.control.Button closeButton;

    public void loadgameplay(ActionEvent event) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        homepane.getChildren().setAll(p);
    }
    public void chooselevel(ActionEvent event) throws IOException{
        Pane p=FXMLLoader.load(getClass().getResource("chooselevel.fxml"));
        homepane.getChildren().setAll(p);
    }
//    public void chooselevel(ActionEvent event) throws IOException{
//        Pane p=FXMLLoader.load(getClass().getResource("chooselevel.fxml"));
//        homepane.getChildren().setAll(p);
//    }
    @FXML
    public void exit(ActionEvent e) {
    final Node source = (Node) e.getSource();
    final Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
}

}