package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;

public class Pea extends thrown {
    private Image peaimage;
    public Pea(double positionX, double positionY) {
        this.setX(positionX);
        this.setY(positionY);
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea.png");
        peaimage = new Image(peafile.toURI().toString());
        this.setObj(new ImageView(peaimage));
    }

    public ImageView getPeaimage() {
        ImageView imgv=new ImageView(peaimage);
        return imgv;
    }

    public void setPeaimage(Image peaimage) {
        this.peaimage = peaimage;
    }

}
