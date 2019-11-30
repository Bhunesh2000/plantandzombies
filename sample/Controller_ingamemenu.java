package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;



public class Controller_ingamemenu {
    @FXML
    private Pane ingame;

    public void mainmenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException{
        /*Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        ingame.getChildren().setAll(p);*/

            Parent root;
            try{
            root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Homepage");
            stage.setScene(scene);

            stage.show();
            ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
        }
        catch(IOException e){
                e.printStackTrace();
        }
}
    public void resume(javafx.scene.input.MouseEvent mouseEvent) throws IOException{
        Parent root;

            root = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Game");
            stage.setScene(scene);

            stage.show();
            ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
    }
    public void restartlevel(javafx.scene.input.MouseEvent mouseEvent) throws IOException{
        Parent root;

        root = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Game");
        stage.setScene(scene);

        stage.show();
        ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
    }

}
