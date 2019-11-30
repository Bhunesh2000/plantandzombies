package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;

public class Pea {

    private double PositionX;
    private double PositionY;
    private ImageView pea;
    private Image peaimage;
    public Pea(Pane pane, double positionX, double positionY) {
        PositionX = positionX;
        PositionY = positionY;
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea.png");
        peaimage = new Image(peafile.toURI().toString());
        pea=new ImageView(peaimage);
        pane.getChildren().add(pea);
    }

    public Image getPeaimage() {
        return peaimage;
    }

    public void setPeaimage(Image peaimage) {
        this.peaimage = peaimage;
    }

    public double getPositionX() {
        return PositionX;
    }

    public void setPositionX(double positionX) {
        PositionX = positionX;
    }

    public double getPositionY() {
        return PositionY;
    }

    public void setPositionY(double positionY) {
        PositionY = positionY;
    }
}
