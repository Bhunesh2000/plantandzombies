package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.net.MalformedURLException;

public class Zombies implements Runnable{
    private double health = 100;
    private int defencepower=10;
    private int attackpower=20;
    private double positionX;
    private double positionY;
    private Image zombieimage;
    public Pane pane;

    public Zombies( Pane pane) throws MalformedURLException {
        File zombiefile = new File("C:\\approject\\src\\sample\\images\\zombie_moving_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());

       /* imgv.setImage(zombieimage);*/
     /*   positionX=imgv.getX();
        positionY=imgv.getY();*/
        pane=this.pane;

    }
    @Override
    public void run(){

    }
    public Image getZombieimage() {
        return zombieimage;
    }

    public void setZombieimage(Image zombieimage) {
        this.zombieimage = zombieimage;
    }

    public int getDefencepower() {
        return defencepower;
    }

    public void setDefencepower(int defencepower) {
        this.defencepower = defencepower;
    }

    public int getAttackpower() {
        return attackpower;
    }

    public void setAttackpower(int attackpower) {
        this.attackpower = attackpower;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        positionY = positionY;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }
    public ImageView imgview(){
        ImageView imgv=new ImageView(zombieimage);
        return imgv;
    }
}
