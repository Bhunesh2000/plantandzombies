package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Pea {

    private double PositionX;
    private double PositionY;
    private Image peaimage;

    public Pea(double positionX, double positionY) {
        PositionX = positionX;
        PositionY = positionY;
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peaimage = new Image(peafile.toURI().toString());
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
