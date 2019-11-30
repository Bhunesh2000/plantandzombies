package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;

import javafx.animation.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;
import javafx.util.Duration;


public class Controller_gameplay {

   ArrayList<Zombies> zombie_list=new ArrayList<Zombies>();
    @FXML
    public ImageView wallnut;
    @FXML
    public ImageView cherry_bomb;
    @FXML
    public ImageView potatomine;
    public ImageView pea1;
    public ImageView pea2;
    public ImageView pea3;
    @FXML
    private Pane gamepane;
    @FXML
    private ImageView sun;
    @FXML
    private ImageView peashooter;
    @FXML
    private ImageView sunflower;
    @FXML
    private GridPane grid;


    @FXML
    private ImageView zombie1;
    @FXML
    private ImageView zombie2;
    @FXML
    private ImageView zombie3;
    @FXML
    private ImageView zombie4;
    @FXML
    private ImageView zombie5;
    @FXML
    private ImageView zombie6;
    @FXML
    private ImageView zombie7;
    @FXML
    private ImageView zombie8;
    @FXML
    private ImageView zombie9;
    @FXML
    private ImageView zombie10;



    @FXML
    private javafx.scene.control.TextField countersuntoken;
    @FXML
    private javafx.scene.control.TextField timer;
    private Image peaimage;
    private Image sunflowerimage;
    private Image zombieimage;
    private Image cherrybombimage;
    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;
    private boolean ifcherrybombselected=false;

    private boolean pause=false;

    public void initialize() throws InterruptedException,MalformedURLException {
        suntokens();
        timecounter();
        /*zombiemove(zombie1);
        zombiemove(zombie2);
        zombiemove(zombie3);
        zombiemove(zombie4);
        zombiemove(zombie5);*/
        zombieCreateMove(120,15);
        zombieCreateMove(270,25);
        zombieCreateMove(420,20);
        zombieCreateMove(570,30);
        zombieCreateMove(720,18);

//        peafiring(pea1);
//        peafiring(pea2);
//        peafiring(pea3);
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peaimage = new Image(peafile.toURI().toString());
        File sunflowerfile = new File("C:\\approject\\src\\sample\\images\\sunflower_gif.gif");
        sunflowerimage = new Image(sunflowerfile.toURI().toString());
        File zombiefile = new File("C:\\approject\\src\\sample\\images\\Zombie_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());
        File cherrybombfile = new File("C:\\approject\\src\\sample\\images\\cherrybomb.gif");
         cherrybombimage = new Image(cherrybombfile.toURI().toString());
    }
    public void peafiring(ImageView pa){
        File f=new File("C:\\approject\\src\\sample\\images\\pea.png");
        Image p=new Image(f.toURI().toString());
        ImageView pea=new ImageView(p);
        gamepane.getChildren().add(pea);
        pea.setX(200);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(15));
        tr.setToX(550);
        tr.setNode(pea);
        tr.play();
    }
    public void timecounter(){
        int time=Integer.valueOf(timer.getText()) ;
        timer.setText(Integer.toString(time+1));
    }
    public void suntokens() throws InterruptedException {
        Random randoms = new Random();
        double randx = 120 + (450 - 50) * randoms.nextDouble();
        sun.setLayoutX(randx);
        sun.setLayoutY((double)10);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(30));
        tr.setToY(350);
        tr.setNode(sun);
        tr.play();
        System.out.println("running sun");
//      tr.stop();
    }

    public void suntokenclicked() throws InterruptedException {
        int tokens=Integer.valueOf(countersuntoken.getText());
        countersuntoken.setText(Integer.toString(tokens+25));
        suntokens();
    }
    public int zombiemove(ImageView zombie){
        System.out.println(" imageview "+zombie);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(25));
        tr.setToX(-440);
        tr.setNode(zombie);
        System.out.println("running zombie");
        tr.play();
        return 1;
    }
    public void newpeashooter(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Peashoooter pressed");
        ifpeashooterselected=true;
    }

    public void newsunflower(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sunflower pressed");
        ifsunflowershooterselected=true;
    }
    public void newcherrybomb(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("cherrybomb pressed");
        ifcherrybombselected=true;
    }
    @FXML
    private void mouseEntered(MouseEvent e) throws FileNotFoundException, MalformedURLException {
        System.out.println("x="+e.getX()+" y="+e.getY());
        Node source = (Node)e.getSource() ;
        Integer colIndex = GridPane.getColumnIndex(source);
        Integer rowIndex = GridPane.getRowIndex(source);
        System.out.println("Mouse entered cell , x="+rowIndex+ " ,y="+colIndex);
    }

    public void addplant(javafx.scene.input.MouseEvent mouseEvent) throws FileNotFoundException, MalformedURLException {
        double mx=mouseEvent.getSceneX();
        double my=mouseEvent.getSceneY();
        ImageView imgpressed=(ImageView) mouseEvent.getSource();
        System.out.println(" ifpeashooterselecte= "+ifpeashooterselected);
        System.out.println("ifsunflowershooterselected="+ifsunflowershooterselected);
        if(ifpeashooterselected){
            System.out.println("Added peashooter");
            Shooter p=new Peashooter(imgpressed,gamepane); //polymorphism
            ifpeashooterselected=false;
            int delay = 5;
            Timer t=new Timer();
            t.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    Platform.runLater(() -> {
                        ImageView imgv=p.imgview();
                        gamepane.getChildren().add(imgv);
                        System.out.println("peafiring called");
                        System.out.println("x= "+mx+" y="+my);
                        imgv.relocate(mx+50,my-40);
                        TranslateTransition tr=new TranslateTransition();
                        tr.setDuration(Duration.seconds(15));
                        tr.setToX(1600);
                        tr.setNode(imgv);
                        System.out.println("transition set");
                        tr.play();
                    });
                }
            }, 0, 5*1000);
            ifpeashooterselected=false;
        }
        else if(ifsunflowershooterselected){
            imgpressed.setImage(sunflowerimage);
            System.out.println("Added sunflower");
            ifsunflowershooterselected=false;
        }
        else if (ifcherrybombselected) {
            imgpressed.setImage(cherrybombimage);
            System.out.println("Added cherrybomb");
            ifcherrybombselected = false;
        }
    }

    public void zombieCreateMove(double mycoordinate, int time) throws MalformedURLException{
        Zombies zom=new Zombies(gamepane); //polymorphism
        double mx=1600;

        double mx_final=mx;


    double my=mycoordinate;

      // double my=mycoordinate;

        Timer t=new Timer();
            t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    ImageView imgv=zom.imgview();
                    imgv.setFitHeight(125);
                    imgv.setFitWidth(80);
                    gamepane.getChildren().add(imgv);
                    System.out.println("zombie moving");
                    System.out.println("x= "+mx+" y="+ my);
                    imgv.relocate(mx-50, my);
                    TranslateTransition tr=new TranslateTransition();
                    tr.setDuration(Duration.seconds(25));
                    tr.setToX(mx_final-2900);
                    tr.setNode(imgv);
                    System.out.println("transition set");
                    tr.play();
                });
            }
        }, 0, time*1000);



    }
    public void ingamemenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        pause=true;
        Parent root = FXMLLoader.load(getClass().getResource("ingamemenu.fxml"));
        Scene scene = new Scene(root);
        Stage stage=new Stage();
        stage.setTitle("In game menu");
        stage.setScene(scene);
        stage.show();

        ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
    }
}