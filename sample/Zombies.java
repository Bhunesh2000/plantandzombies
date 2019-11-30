package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Zombies {
    private int defencepower=10;
    private int attackpower=20;
    private double positionX=0;
    private double PositionY=0;
    private Image zombieimage;

    public Zombies() {
        File zombiefile = new File("images/zombie_moving_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());
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
        return PositionY;
    }

    public void setPositionY(double positionY) {
        PositionY = positionY;
    }
}
