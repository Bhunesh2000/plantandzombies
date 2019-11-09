package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

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


public class Controller_gameplay {
    @FXML
    public ImageView wallnut;
    @FXML
    public ImageView cherry_bomb;
    @FXML
    public ImageView potatomine;
    public ImageView pea1;
    public ImageView pea2;
    public ImageView pea3;
    @FXML
    private Pane gamepane;
    @FXML
    private ImageView sun;
    @FXML
    private ImageView peashooter;
    @FXML
    private ImageView sunflower;
    @FXML
    private GridPane grid;
    @FXML
    private ImageView zombie1;
    @FXML
    private ImageView zombie2;
    @FXML
    private ImageView zombie3;
    @FXML
    private ImageView zombie4;
    @FXML
    private ImageView zombie5;
    @FXML
    private javafx.scene.control.TextField countersuntoken;
    @FXML
    private javafx.scene.control.TextField timer;
    private Image peaimage;
    private Image sunflowerimage;
    private Image zombieimage;
    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;

    public void initialize() throws InterruptedException {
        suntokens();
        timecounter();
        zombiemove(zombie1);
        zombiemove(zombie2);
        zombiemove(zombie3);
        zombiemove(zombie4);
        zombiemove(zombie5);
        peafiring(pea1);
        peafiring(pea2);
        peafiring(pea3);
        File peafile = new File("images/pea_gif.gif");
        peaimage = new Image(peafile.toURI().toString());
        File sunflowerfile = new File("images/sunflower_gif.gif");
        sunflowerimage = new Image(sunflowerfile.toURI().toString());
        File zombiefile = new File("images/zombie_moving_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());
    }
    public void peafiring(ImageView pea){
        pea.setX(200);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(15));
        tr.setToX(550);
        tr.setNode(pea);
        tr.play();
    }
    public void timecounter(){
        int time=Integer.valueOf(timer.getText()) ;
        timer.setText(Integer.toString(time+1));
    }
    public void suntokens() throws InterruptedException {
        Random randoms = new Random();
        int x=0;
        while (x<500){
            double randx = 50 + (450 - 50) * randoms.nextDouble();
            sun.setLayoutX(randx);
            sun.setLayoutY(10);
            TranslateTransition tr=new TranslateTransition();
            tr.setDuration(Duration.seconds(30));
            tr.setToY(350);
            tr.setNode(sun);
            tr.play();
            System.out.println("running sun");
//            tr.stop();
            x++;
        }
    }

    public void suntokenclicked() throws InterruptedException {
        int tokens=Integer.valueOf(countersuntoken.getText());
        countersuntoken.setText(Integer.toString(tokens+1));
        suntokens();
    }
    public int zombiemove(ImageView zombie){
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(25));
        tr.setToX(-440);
        tr.setNode(zombie);
        System.out.println("running zombie");
        tr.play();
        return 1;
    }

    public void ingamemenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
    /*    Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        gamepane.getChildren().setAll(p);
    */


        Alert alert = new Alert(AlertType.CONFIRMATION);



        alert.setTitle("In-game menu");
        alert.setHeaderText("");
        alert.setContentText("What do you wish to do?");

        //alert.setGraphic(new ImageView(this.getClass().getResource("pvz_home_page.png").toString()));
        /*
        Image image = new Image(getClass().getResource("pvsz_home_page.jpeg").toExternalForm());
        ImageView imageView = new ImageView(image);

        alert.setGraphic();*/

/*

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();

        stage.getIcons().add(new Image(this.getClass().getResource("Flag_Zombie.png").toString()));
*/

        ButtonType buttonTypeOne = new ButtonType("Restart Level");
        ButtonType buttonTypeTwo = new ButtonType("Back to Main Menu");
        ButtonType buttonTypeThree = new ButtonType("Save game");
        ButtonType buttonTypeFour = new ButtonType("Exit game");
        ButtonType buttonTypeCancel = new ButtonType("Back to game", ButtonData.CANCEL_CLOSE);



        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeFour, buttonTypeCancel);

/*

        Image image = new Image(getClass().getResource("pvsz_home_page.jpeg").toExternalForm());

        //ImageView imageView = new ImageView(image);
        alert.getDialogPane().setGraphic(image);
        alert.showAndWait();
*/



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
// ... user chose CANCEL or closed the dialog
        }
    }

    public void newpeashooter(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Peashoooter pressed");
        ifpeashooterselected=true;
    }

    public void newsunflower(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sunflower pressed");
        ifsunflowershooterselected=true;
    }

    public void addplant(javafx.scene.input.MouseEvent mouseEvent) throws FileNotFoundException {
        ImageView imgpressed=(ImageView) mouseEvent.getSource();
        int id=Integer.valueOf(imgpressed.getId());
        int x=id/10;
        int y=id%10;
        System.out.println("x= "+x+ " y="+y);
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
    }
}