package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class play extends Application {
    public void start(Stage stageone) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("entry.fxml"));
        stageone.setTitle("Plant and Zombies");
        stageone.setScene(new Scene(root,300,275) );
        stageone.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
