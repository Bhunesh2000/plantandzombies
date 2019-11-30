package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Dialog;

import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import java.io.*;
import java.util.Optional;
import java.util.Random;
import javafx.animation.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;
import javafx.util.Duration;


public class Controller_gameplay {
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
    private javafx.scene.control.TextField countersuntoken;
    @FXML
    private javafx.scene.control.TextField timer;
    private Image peaimage;
    private Image sunflowerimage;
    private Image zombieimage;
    private boolean ifpeashooterselected=false;
    private boolean ifsunflowershooterselected=false;

    private boolean pause=false;

    public void initialize() throws InterruptedException {
        suntokens();
        timecounter();
        zombiemove(zombie1);
        zombiemove(zombie2);
        zombiemove(zombie3);
        zombiemove(zombie4);
        zombiemove(zombie5);
        peafiring(pea1);
        peafiring(pea2);
        peafiring(pea3);
        File peafile = new File("C:\\approject\\src\\sample\\images\\pea_gif.gif");
        peaimage = new Image(peafile.toURI().toString());
        File sunflowerfile = new File("C:\\approject\\src\\sample\\images\\sunflower_gif.gif");
        sunflowerimage = new Image(sunflowerfile.toURI().toString());
        File zombiefile = new File("C:\\approject\\src\\sample\\images\\Zombie_gif.gif");
        zombieimage = new Image(zombiefile.toURI().toString());
    }
    public void peafiring(ImageView pea){
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
        countersuntoken.setText(Integer.toString(tokens+1));
        suntokens();
    }
    public int zombiemove(ImageView zombie){
        TranslateTransition tr=new TranslateTransition();
        tr.setDuration(Duration.seconds(25));
        tr.setToX(-440);
        tr.setNode(zombie);
        System.out.println("running zombie");
        tr.play();
        return 1;
    }

    public void ingamemenu(javafx.scene.input.MouseEvent mouseEvent) throws IOException {

pause=true;
/*        Alert alert = new Alert(AlertType.CONFIRMATION);



        alert.setTitle("In-game menu");
        alert.setHeaderText("");
        alert.setContentText("What do you wish to do?");



        ButtonType buttonTypeOne = new ButtonType("Restart Level");
        ButtonType buttonTypeTwo = new ButtonType("Back to Main Menu");
        ButtonType buttonTypeThree = new ButtonType("Save game");
        ButtonType buttonTypeFour = new ButtonType("Exit game");
        ButtonType buttonTypeCancel = new ButtonType("Back to game", ButtonData.CANCEL_CLOSE);



        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeFour, buttonTypeCancel);

       *//* Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Emojione_1F62D.svg/64px-Emojione_1F62D.svg.png");

       // Image image = new Image(getClass().getResource("/images/menu_screen.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);
*//*
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne){
            Pane p = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "One"
        } else if (result.get() == buttonTypeTwo) {
            Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "Two"
        } else if (result.get() == buttonTypeThree) {
            Pane p = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            gamepane.getChildren().setAll(p);
            // ... user chose "Three"
        } else if(result.get() == buttonTypeFour){
            System.exit(0);

        } else{
        }*/

    Parent root = FXMLLoader.load(getClass().getResource("ingamemenu.fxml"));
    Scene scene = new Scene(root);
    Stage stage=new Stage();
    stage.setTitle("In game menu");
    stage.setScene(scene);
    stage.show();

        ((Node) (mouseEvent.getSource())).getScene().getWindow().hide();
    }

    public void newpeashooter(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Peashoooter pressed");
        ifpeashooterselected=true;
    }

    public void newsunflower(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sunflower pressed");
        ifsunflowershooterselected=true;
    }
    @FXML
    private void mouseEntered(MouseEvent e) {
        Node source = (Node)e.getSource() ;
        Integer colIndex = GridPane.getColumnIndex(source);
        Integer rowIndex = GridPane.getRowIndex(source);
        System.out.println("Mouse entered cell , x="+rowIndex+ " ,y="+colIndex);
    }

    public void addplant(javafx.scene.input.MouseEvent mouseEvent) throws FileNotFoundException {
        ImageView imgpressed=(ImageView) mouseEvent.getSource();
        System.out.println(imgpressed.getClass());
//        int id=Integer.valueOf(imgpressed.getId());
//        int x=id/10;
//        int y=id%10;
//        System.out.println("x= "+x+ " y="+y);
        System.out.println(" ifpeashooterselecte= "+ifpeashooterselected);
        System.out.println("ifsunflowershooterselected="+ifsunflowershooterselected);
        if(ifpeashooterselected){
//            grid.set
//            ImageView img=new ImageView(new Image(new FileReader("Peashooter.png"));
//            grid.add(img,x,y);
            imgpressed.setImage(peaimage);
            System.out.println("Added peashooter");
            ifpeashooterselected=false;
        }
        else if(ifsunflowershooterselected){
//            ImageView img=new ImageView(String.valueOf(sunflower));
//            grid.add(img,x,y);
            imgpressed.setImage(sunflowerimage);
            System.out.println("Added sunflower");
            ifsunflowershooterselected=false;
        }
    }
}