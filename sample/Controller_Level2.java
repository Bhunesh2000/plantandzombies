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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;
import javafx.util.Duration;


public class Controller_Level2 {

    public Button countersuntoken;
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
    public Pane gamepane;
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
    private Button timer;
    private Image peaimage;
    private Image sun;
    private Image sunflowerimage;
    private Image zombieimage;
    private Image cherrybombimage;
    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;
    private ArrayList<ImageView> thobjects0;
    private ArrayList<ImageView> thobjects1;
    private ArrayList<ImageView> thobjects2;
    private ArrayList<ImageView> thobjects3;
    private ArrayList<ImageView> thobjects4;
    private ArrayList<Plants> plants0;
    private ArrayList<Plants> plants1;
    private ArrayList<Plants> plants2;
    private ArrayList<Plants> plants3;
    private ArrayList<Plants> plants4;
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
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peaimage = new Image(peafile.toURI().toString());
        File sunflowerfile = new File("C:\\approject\\src\\sample\\images\\sunflower_gif.gif");
        sunflowerimage = new Image(sunflowerfile.toURI().toString());
        File zombiefile = new File("C:\\approject\\src\\sample\\images\\Zombie_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());
        File fsun=new File("C:\\approject\\src\\sample\\images\\sun.png");
        sun=new Image(fsun.toURI().toString());
        peafiring();

        Timer t=new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    try {
                        suntokens();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        },0,10*1000);
        File cherrybombfile = new File("C:\\approject\\src\\sample\\images\\cherrybomb.gif");
        cherrybombimage = new Image(cherrybombfile.toURI().toString());
    }
    public void peafiring(){
        File f=new File("C:\\approject\\src\\sample\\images\\pea.png");
        Image p=new Image(f.toURI().toString());
        ImageView pea=new ImageView(p);
        gamepane.getChildren().add(pea);
        pea.setX(200);
        pea.setY(200);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(15));
        tr.setToX(550);
        tr.setNode(pea);
        tr.play();
    }
    public void timecounter(){
        int time=Integer.parseInt(timer.getText()) ;
        timer.setText(Integer.toString(time+1));
    }
    public void suntokens() throws InterruptedException{
        ImageView sn=new ImageView(sun);
        sn.setOnMouseClicked(MouseEvent -> {
            int tokens=Integer.parseInt(countersuntoken.getText());
            countersuntoken.setText(Integer.toString(tokens+1));
            ImageView img=(ImageView) MouseEvent.getSource();
            gamepane.getChildren().remove(img);
        });
        gamepane.getChildren().add(sn);
        Random randoms = new Random();
        double randx = 400 + (1000) * randoms.nextDouble();
        sn.relocate(randx,10);
//        sun.setLayoutX(randx);
//        sun.setLayoutY((double)10);
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(45));
        tr.setToY(750);
        tr.setNode(sn);
        tr.play();
        System.out.println(" sun created");
    }

    public void suntokenclicked(MouseEvent msevent) throws InterruptedException {
        int tokens=Integer.parseInt(countersuntoken.getText());
        countersuntoken.setText(Integer.toString(tokens+1));
//        ImageView img=(ImageView) MouseEvent.getSource();
//        gamepane.getChildren().remove(img);
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
//            addtoplantarray();
            Shooter p=new Peashooter(imgpressed); //polymorphism
            ifpeashooterselected=false;
            Timer t=new Timer();
            t.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    Platform.runLater(() -> {
                        ImageView imgv=p.imgview();
//                        addtoimgarray();
                        gamepane.getChildren().add(imgv);
                        System.out.println("peafiring called");
                        System.out.println("x= "+mx+" y="+my);
                        imgv.relocate(mx+50,my-45);
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
    public void addtoplantarray(Plants plnt,double y){
//        if (double y>)
    }
    public void addtoimgarray(ImageView imgv,double y) {
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