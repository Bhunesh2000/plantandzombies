package sample;

public abstract class Plants {
    private double health=100;
    private int waiting_time;
    private double X;
    private double Y;

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }

    public double getPositionX() {
        return X;
    }

    public void setPositionX(double positionX) {
        this.X = positionX;
    }

    public double getPositionY() {
        return Y;
    }

    public void setPositionY(double positionY) {
        this.Y = positionY;
    }
}

