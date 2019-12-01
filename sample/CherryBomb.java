package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;

public class CherryBomb extends BombPlants{
    private double positionX;
    private double positionY;
    private Image cherrybombimage;
    public Pane pane;
    public ImageView imgview(){
        ImageView imgv=new ImageView(cherrybombimage);
        return imgv;
    }
    public CherryBomb() {
        File cherrybombfile = new File("C:\\approject\\src\\sample\\images\\zombie_moving_gif.gif");
        cherrybombimage = new Image(cherrybombfile.toURI().toString());
    }
    @Override
    public void explode(){

    }

    @Override
    public double getPositionX() {
        return positionX;
    }

    @Override
    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    @Override
    public double getPositionY() {
        return positionY;
    }

    @Override
    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public Image getCherrybombimage() {
        return cherrybombimage;
    }

    public void setCherrybombimage(Image cherrybombimage) {
        this.cherrybombimage = cherrybombimage;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }
}
