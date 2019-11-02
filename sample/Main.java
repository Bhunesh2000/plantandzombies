 package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        primaryStage.setTitle("Plant V/S Zombies");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        Stage s2=new Stage();
//        start2(s2);
    }
    public void start2(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        primaryStage.setTitle("Plant V/S Zombies");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}