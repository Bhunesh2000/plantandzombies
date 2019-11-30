package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Dialog;

import javafx.scene.control.*;

import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Optional;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import javafx.util.Duration;


public class Controller_Level3 {

    boolean peashooterclicked_var=false;

    @FXML
    private GridPane grid;
    @FXML
    private ImageView peashooter;
    @FXML
    private ImageView sunflower;
    @FXML
    private ImageView imageView0_0;
    @FXML
    private void peashooterclicked(){
        System.out.println("pea shooter clicked");
        peashooterclicked_var=true;
    }

    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;
    private boolean ifcherrybombselected=false;

    File peafile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
    private Image peaimage = new Image(peafile.toURI().toString());
    File sunflowerfile = new File("C:\\approject\\src\\sample\\images\\sunflower_gif.gif");
    private Image sunflowerimage = new Image(sunflowerfile.toURI().toString());
    File zombiefile = new File("C:\\approject\\src\\sample\\images\\Zombie_gif.gif");
    private Image zombieimage = new Image(zombiefile.toURI().toString());
    File cherrybombfile = new File("C:\\approject\\src\\sample\\images\\cherry.mp4");
    private Image cherrybombimage = new Image(cherrybombfile.toURI().toString());

    public void newpeashooter(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Peashoooter pressed");
        ifpeashooterselected=true;
    }

    public void newcherrybomb(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Cherrybomb pressed");
        ifcherrybombselected=true;
    }

    public void newsunflower(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sunflower pressed");
        ifsunflowershooterselected=true;
    }
    @FXML
    private void place(javafx.scene.input.MouseEvent mouseEvent){

        imageView0_0=(ImageView) mouseEvent.getSource();
        System.out.println(peashooterclicked_var+" peashooterclicked_var");
        if(peashooterclicked_var==true){
            File peashooterfile = new File("\\images\\pea_gif.gif");
            Image peashooterImage= new Image(peashooterfile.toURI().toString());
            imageView0_0.setImage(peashooterImage);
            imageView0_0.minHeight(50);
            imageView0_0.minWidth(50);
            imageView0_0.setTranslateX(50);
            imageView0_0.setTranslateY(50);

            // for(Node node: grid.getC )

            System.out.println("Peashooter placed");
        }
    }

    public void addplant(javafx.scene.input.MouseEvent mouseEvent) throws FileNotFoundException {
        ImageView imgpressed=(ImageView) mouseEvent.getSource();
        System.out.println(imgpressed.getClass());
//        int id=Integer.valueOf(imgpressed.getId());
//        int x=id/10;
//        int y=id%10;
//        System.out.println("x= "+x+ " y="+y);
        System.out.println(" ifpeashooterselecte= "+ifpeashooterselected);
        System.out.println("ifsunflowershooterselected="+ifsunflowershooterselected);
        if(ifpeashooterselected){
//            grid.set
//            ImageView img=new ImageView(new Image(new FileReader("Peashooter.png"));
//            grid.add(img,x,y);
            imgpressed.setImage(peaimage);
            System.out.println("Added peashooter");
            ifpeashooterselected=false;

        }

        else if(ifsunflowershooterselected){
//            ImageView img=new ImageView(String.valueOf(sunflower));
//            grid.add(img,x,y);
            imgpressed.setImage(sunflowerimage);
            System.out.println("Added sunflower");
            ifsunflowershooterselected=false;
        }

        else if(ifcherrybombselected){
//            ImageView img=new ImageView(String.valueOf(sunflower));
//            grid.add(img,x,y);
            imgpressed.setImage(cherrybombimage);
            System.out.println("Added cherrybomb");
            ifcherrybombselected=false;
        }
    }

    public void ingamemenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException {


/*        Alert alert = new Alert(AlertType.CONFIRMATION);



        alert.setTitle("In-game menu");
        alert.setHeaderText("");
        alert.setContentText("What do you wish to do?");



        ButtonType buttonTypeOne = new ButtonType("Restart Level");
        ButtonType buttonTypeTwo = new ButtonType("Back to Main Menu");
        ButtonType buttonTypeThree = new ButtonType("Save game");
        ButtonType buttonTypeFour = new ButtonType("Exit game");
        ButtonType buttonTypeCancel = new ButtonType("Back to game", ButtonData.CANCEL_CLOSE);



        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeFour, buttonTypeCancel);

       *//* Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Emojione_1F62D.svg/64px-Emojione_1F62D.svg.png");

       // Image image = new Image(getClass().getResource("/images/menu_screen.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);
*//*
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne){
            Pane p = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "One"
        } else if (result.get() == buttonTypeTwo) {
            Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "Two"
        } else if (result.get() == buttonTypeThree) {
            Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "Three"
        } else if(result.get() == buttonTypeFour){
            System.exit(0);

        } else{
        }*/

        Parent root = FXMLLoader.load(getClass().getResource("ingamemenu.fxml"));
        Scene scene = new Scene(root);
        Stage stage=new Stage();
        stage.setTitle("In game menu");
        stage.setScene(scene);
        stage.show();

        ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
    }

}
