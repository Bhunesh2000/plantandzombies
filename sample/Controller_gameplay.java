package sample;

import javafx.event.ActionEvent;
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
@FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {


}

public void suntokens(ActionEvent event){
    System.out.println(" works");

    Line path = new Line();
    Random randoms = new Random();
    double randx = 50 + (450 - 50) * randoms.nextDouble();
    path.setStartX(randx);
    path.setStartY(10);
    path.setStartX(randx);
    path.setEndY(375);
    System.out.println(" works till 2");

    Circle sun = new Circle(100);

    PathTransition fall = new PathTransition();
    System.out.println(" works till 3");
    fall.setDuration(Duration.seconds(3));
    System.out.println(" works till 4");
    fall.setNode(sun);

    System.out.println(" works till 5");
    fall.setPath(path);
    System.out.println(" works till 6");
    fall.setCycleCount(PathTransition.INDEFINITE);
    System.out.println(" works till 7");
    fall.play();
    System.out.println(" works till 8");
}
}

