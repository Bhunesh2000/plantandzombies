package sample;

import javafx.scene.image.ImageView;

public class thrown {
    private ImageView obj;
    private double X;
    private double Y;
    public void setObj(ImageView imgv){
           obj=imgv;
    }
    public ImageView getObj(){
        return obj;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public void setX(double X){
        this.X=X;
    }
    public void setY(double Y){
        this.Y=Y;
    }
}
