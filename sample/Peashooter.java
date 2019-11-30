package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;

public class Peashooter extends Shooter {
    private Image peashooter;
    private Image pea;
    private double x;
    private double y;
    public Pane pane;
    public Peashooter(ImageView imgv, Pane pane) throws MalformedURLException {
        File peashooterfile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peashooter=new Image(peashooterfile.toURI().toString());
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea.png");
        pea = new Image(peafile.toURI().toString());
        imgv.setImage(peashooter);
        x=imgv.getX();
        y=imgv.getY();
        pane=this.pane;
    }
    @Override
    public void run(){

    }
    @Override
    public void attack(){

    }
    public ImageView imgview(){
        ImageView pa=new ImageView(pea);
        return pa;
    }
}
