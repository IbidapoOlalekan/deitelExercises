package televisionApp;



public class Television {

   private final String televisionName ;
    private boolean isOn;
    private int channel = 0;
    private int volume ;

    public Television(String televisionName) {
        this.televisionName = televisionName;
    }

    public String getName() {
        return televisionName;
    }

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseVolumeTest() {
        if (volume <= 100){
            volume++;
        }
        else {
            volume = 100;
        }

    }
    public int getVolume(){
        if (volume >= 0 && volume <= 100){
            return volume;
        }
        else {
            return 0;
        }
    }

    public void decreaseVolume() {
        if (volume >= 0){
            volume--;
        }
        else {
            volume = 0;
        }
    }

    public void setChannel(int channel) {
        if (isOn & channel>0){
            this.channel = channel;
        }

    }

    public int getChannel() {
        if (channel < 0 && !isOn ){
            return 0;
        }
        return channel;
    }

    public void changeChannel() {

        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void mute() {
        volume = 0;
    }


}
