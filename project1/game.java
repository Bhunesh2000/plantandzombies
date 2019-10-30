package project1;
// during play game there is option to earn objects by viewing video ?? // I guess we shouldn't implement that

public class game {
    public static void main(String[] args) {
        // there is a loading screen // Do we have to implement it??
        // a bonus game option on start ??
        home hm = new home();
        hm.displayhomepage();
    }
}
class option{

}
class home{
    private play pl;
    public void displayhomepage(){
        pl=new play();
        System.out.println("Display homepage ");
        diplayprofile();
        displaycurrentstate();
    }
    private void diplayprofile(){
        System.out.println("Display profile name");
        boolean clicked=true;
        if (clicked){
            System.out.println("Display Achievements button");
            System.out.println("Display Leaderboards button");
            System.out.println("Display Change profile button");
        }
    }
    private void displaycurrentstate(){
        System.out.println(" Displays current state eg: DAY Level 7 or FOG Level 2");
    }
}

class play{
    // coins pop-up during gameplay to earn money ??
    private void createzombies(){}
    public void clickmenubutton(){
        System.out.println(" Options");
        volumeslider();
        soundslider();
        promotionscheckbox();
        notificationcheckbox();
        displaysplayerid();
        backtohome();
        restartlevel();
        mainmenu();
    }
    private void volumeslider(){
        System.out.println("Displays volume slider");
    }
    private void soundslider(){
        System.out.println("Displays soundfx slider");
    }
    private void promotionscheckbox(){
        System.out.println("Displays promotion checkbox");
    }
    private void notificationcheckbox(){
        System.out.println("Displays notification checkbox");
    }
    private void displaysplayerid(){
        System.out.println("Displays player id");
    }
    private void backtohome(){
        System.out.println("Displays back to home button");
    }
    private void restartlevel(){
        System.out.println("Displays restart level button");
    }
    private void mainmenu(){
        System.out.println("Displays main menu button");
    }
}
