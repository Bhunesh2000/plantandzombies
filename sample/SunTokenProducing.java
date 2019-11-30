package sample;

public abstract class SunTokenProducing extends Plants{
    private int sunTokenCount=0;
    public abstract void produce();

    public void incrementSunTokenCount(){

    }

    public int getSunTokenCount() {
        return sunTokenCount;
    }

    public void setSunTokenCount(int sunTokenCount) {
        this.sunTokenCount = sunTokenCount;
    }
}

