package airconditionerApp;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;
    public AirConditioner(String acName) {
    }

    public boolean isOn(){
        return isOn;
    }
    public void turnOn() {
        isOn = true;
    }


    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
       if (!isOn){
           return 0;
       }
       return temperature;
    }

    public int increaseTemperature() {
        if (isOn() == true) {
            if (temperature < 30)
                temperature++;
        }
        return 0;
    }

    public int decreaseTemperature() {
        int temp = 0 ;
        if (isOn() == true){
            if (temperature > 16){
                temperature--;
            }
        }
        return temp ;


    }
}
