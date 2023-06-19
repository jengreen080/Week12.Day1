public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void  reduceVolume(){
         this.volume = this.volume - 10;
    }

    public void clearBottle(){
        this.volume = 0;
    }
    public void fillToFull(){
        this.volume = 100;
    }
}
