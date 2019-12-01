package sample;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Collision implements Runnable{
    public ArrayList<Plants> plants;
    public ArrayList<Zombies> zombie_list;
    private ArrayList<thrown> objects;
    private ArrayList<ImageView> imgs;
    private ArrayList<ImageView> zombieimgv;

    public Collision(ArrayList<Plants> pl,ArrayList<Zombies> zm, ArrayList<thrown> im,ArrayList<ImageView> imgs,ArrayList<ImageView> zombieimgv) {
        plants=pl;
        zombie_list=zm;
        objects=im;
        this.imgs=imgs;
        this.zombieimgv=zombieimgv;
    }
    @Override
    public void run() {
//        System.out.println("Thread started");
        try{
            System.out.println("zombie list size= " +zombie_list.size() );
            System.out.println("imgs size"+ imgs.size());
            for (int v=0;v<zombieimgv.size();v++){
                for (int g=0;g<imgs.size();g++){
                    System.out.print("x diff=");
                    System.out.println(zombieimgv.get(v).getX() - imgs.get(g).getX());
                    System.out.print("y diff=");
                    System.out.println(zombieimgv.get(v).getY() - imgs.get(g).getY());
                    if (Math.abs(zombieimgv.get(v).getX() - imgs.get(g).getX())<10 && Math.abs(zombieimgv.get(v).getY() - imgs.get(g).getY())<10){
                        System.out.println("Zombie hits something");
                    }
                }



//                for(int u=0;u<plants.size();u++){
//                    System.out.print("x diff=");
//                    System.out.println(plants.get(u).getPositionX() - zombie_list.get(v).getPositionX());
//                    System.out.print("y diff=");
//                    System.out.println(plants.get(u).getPositionY() - zombie_list.get(v).getPositionY());
//                    if (Math.abs(plants.get(u).getPositionX() - zombie_list.get(v).getPositionX())<10 && Math.abs(plants.get(u).getPositionY() - zombie_list.get(v).getPositionY())<10){
//                        System.out.println("Zombie hits a plant");
//                    }
//                }
//                for (int r=0;r<objects.size();r++){
//                    System.out.print("x diff=");
//                    System.out.println(plants.get(r).getPositionX() - zombie_list.get(v).getPositionX());
//                    System.out.print("y diff=");
//                    System.out.println(plants.get(r).getPositionY() - zombie_list.get(v).getPositionY());
//                    if (Math.abs(objects.get(r).getX()-zombie_list.get(v).getPositionX())<10 && Math.abs(plants.get(r).getPositionY() - zombie_list.get(v).getPositionY())<10){
//                        System.out.println("Zombie hits an object");
//                    }
//                }
            }
        }
        catch (NullPointerException nlp){
            nlp.printStackTrace();
        }
//        System.out.println("All checked");
    }
}
