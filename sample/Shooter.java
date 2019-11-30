 package sample;

 import javafx.scene.image.ImageView;

 public abstract class Shooter extends Plants implements Runnable{
    public abstract void attack();
    public abstract ImageView imgview();
}
