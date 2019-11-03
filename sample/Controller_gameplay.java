package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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

/*    @FXML
    private Button startbutton;*/
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

    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;

    public void initialize() throws InterruptedException {
        suntokens();
    }
    public void suntokens() throws InterruptedException {
        System.out.println(" works");

//        Line path = new Line();
        Random randoms = new Random();
//        Circle sun = new Circle(10);
//        gamepane.getChildren().add(sun);
        int x=0;
        while (x<500){
            double randx = 50 + (450 - 50) * randoms.nextDouble();
            sun.setLayoutX(randx);
            sun.setLayoutY(10);
            TranslateTransition tr=new TranslateTransition();
            tr.setDuration(Duration.seconds(15));
            tr.setToY(350);
            tr.setNode(sun);
            tr.play();
//            tr.stop();
            x++;
        }
//        path.setStartX(randx);
//        path.setStartY(10);
//        path.setStartX(randx);
//        path.setEndY(375);
//        System.out.println(" works till 2");
//        PathTransition fall = new PathTransition();
//        System.out.println(" works till 3");
//        fall.setDuration(Duration.seconds(3));
//        System.out.println(" works till 4");
//        fall.setNode(sun);
//
//        System.out.println(" works till 5");
//        fall.setPath(path);
//        System.out.println(" works till 6");
//        fall.setCycleCount(PathTransition.INDEFINITE);
//        System.out.println(" works till 7");
//        gamepane.getChildren().add(fall);
//        fall.play();
//        System.out.println(" works till 8");
    }

    public void newpeashooter(MouseEvent event){
        System.out.println("Peashoooter pressed");
    }
    public void mainmenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        gamepane.getChildren().setAll(p);
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
        Button btn=(Button) mouseEvent.getSource();
        int id=Integer.valueOf(btn.getId());
        int x=id/10;
        int y=id%10;
        System.out.println("x= "+x+ " y="+y);
        if(ifpeashooterselected){
//            grid.set
//            ImageView img=new ImageView(new Image(new FileReader("Peashooter.png"));
//            grid.add(img,x,y);
            System.out.println("Added peashooter");
            ifpeashooterselected=false;
        }
        else if(ifsunflowershooterselected){
//            ImageView img=new ImageView(String.valueOf(sunflower));
//            grid.add(img,x,y);
            System.out.println("Added sunflower");
            ifsunflowershooterselected=false;
        }
    }
}