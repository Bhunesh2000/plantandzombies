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
    private Pea pea;

    public Peashooter(ImageView imgv) throws MalformedURLException {
        File peashooterfile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peashooter=new Image(peashooterfile.toURI().toString());
        imgv.setImage(peashooter);
        this.setPositionX(imgv.getX());
        this.setPositionY(imgv.getY());
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea.png");
        pea=new Pea(imgv.getX(),imgv.getY());
        obj=pea;
    }
    @Override
    public void run(){

    }
    @Override
    public void attack(){

    }
    public ImageView imgview(){
        return pea.getPeaimage();
    }
}
