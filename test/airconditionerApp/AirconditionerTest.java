package airconditionerApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionerTest {

    @Test
    public void acCanBeTurnedOn(){
        //given we have AC we can turn it on
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());
    }
    @Test
    public void acCanBeTurnedOffTest(){
        //given we have AC and it is On
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());
        //when ac is off
        lg.turnOff();
        //check if ac is off
        assertFalse(lg.isOn());

    }

    @Test
    public void acTempCanBeIncreased(){
        //given that I have an AC and ac is on check temperature is 16
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());

        int currentTemperature =  lg.getTemperature();

        assertEquals(16,currentTemperature);
        // when I Increase the temperature

        lg.increaseTemperature();
        assertEquals(17,lg.getTemperature());
    }

    @Test
    public void acTemperatureCanBeReduced(){

        //given that we have an AC and it is on and temperature is above 16
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(18,lg.getTemperature());
        //when  decrease Temperature

        lg.decreaseTemperature();
        assertEquals(17,lg.getTemperature());

    }

    @Test
    public void acTemperatureCantIncreaseBeyond30(){
        //given that we have AC, ac is on and Ac Temperature is 30
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());
        for (int i = 0; i < 14; i++){
            lg.increaseTemperature();
        }
        assertEquals(30,lg.getTemperature());
    }

    @Test
    public void acTemperatureCantReduceBeyond16(){
        //given that we have AC, ac is on and AC temperature is 16
        AirConditioner lg =new AirConditioner("Lg Ac");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.decreaseTemperature();
        lg.decreaseTemperature();

        assertEquals(16,lg.getTemperature());

    }

    @Test

    public void acTemperatureIsZeroWhenOffTest(){
        //given that we have AC and it is turned off
        AirConditioner lg = new AirConditioner("Lg Ac");
        lg.turnOff();
        assertFalse(lg.isOn());
        //when check temperature
        int temperature = lg.getTemperature();
        //check if temperature is 0 when off
        assertEquals(0,temperature);

    }

}
