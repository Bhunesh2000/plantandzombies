package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.*;
import javafx.scene.shape.*;
import java.awt.*;
import javafx.util.Duration;


public class Controller_gameplay implements Initializable {

/*    @FXML
    private Button startbutton;*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

    public void suntokens() {
        System.out.println(" works");

        Line path = new Line();
        Random randoms = new Random();
        double randx = 50 + (450 - 50) * randoms.nextDouble();
        path.setStartX(randx);
        path.setStartY(10);
        path.setStartX(randx);
        path.setEndY(375);


        Circle sun = new Circle(100);

        PathTransition fall = new PathTransition();
        fall.setDuration(Duration.seconds(3));
        fall.setNode(sun);
        fall.setPath(path);
        fall.setCycleCount(PathTransition.INDEFINITE);
        fall.play();

    }
}
