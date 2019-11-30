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


public class Controller_Level2 {

    boolean peashooterclicked_var=false;

    @FXML
    private ImageView imageView0_0;
    @FXML
    private void peashooterclicked(){
        System.out.println("pea shooter clicked");
        peashooterclicked_var=true;
    }
    @FXML
    private void place(javafx.scene.input.MouseEvent mouseEvent){
        System.out.println(peashooterclicked_var+" peashooterclicked_var");
        if(peashooterclicked_var==true){
            File peashooterfile = new File("images/pea_gif.gif");
            Image peashooterImage= new Image(peashooterfile.toURI().toString());
            imageView0_0.setImage(peashooterImage);
            imageView0_0.minHeight(50);
            imageView0_0.minWidth(50);
            imageView0_0.setTranslateX(50);
            imageView0_0.setTranslateY(50);
            System.out.println("Peashooter placed");
        }
    }

}
