package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import java.io.IOException;

public class Controller_home {

    @FXML
    private Pane homepane;
    private Scene scene;

    public void loadgameplay(ActionEvent event) throws IOException {
        Pane p= FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        homepane.getChildren().setAll();
        homepane=p;
        if (p==null){
            System.out.println("p is Null ");
        }
        System.out.println(p.getClass());
//        scene.setRoot(p);
    }
}