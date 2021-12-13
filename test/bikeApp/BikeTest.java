package bikeApp;

import org.junit.jupiter.api.Test;

import java.net.PortUnreachableException;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void bikeCanBeTurnedOff(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOff();
        assertFalse(bike.isOn());
    }
    @Test
    public void bikeCanBeTurnedOn(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
    }
    @Test
    public void bikeCanBeAcceleratedByGearOneTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());

        for (int i = 1 ; i < 5; i++){
             bike.accelerate(1);
        }
        assertEquals(4,bike.getSpeed());
    }
    @Test
    public void bikeCanBeAcceleratedByGearTwoTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());

        for (int i=1; i < 5; i++){
            bike.accelerate(2);
        }
        assertEquals(8,bike.getSpeed());
    }
    @Test
    public void bikeCanBeAcceleratedByGearThree(){
        Bike bike= new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());

        for (int i = 1; i < 5; i++) {
            bike.accelerate(3);
        }
        assertEquals(12,bike.getSpeed());
    }
    @Test
    public void bikeCanBeAcceleratedByGearFour(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());

        for (int i = 1; i < 5; i++){
            bike.accelerate(4);
        }
        assertEquals(16,bike.getSpeed());
    }
    @Test
    public void bikeCanBeDeceleratedByGearOneTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1 ; i < 5; i++){
            bike.accelerate(1);
        }

        bike.decelerate(1);
        assertEquals(3,bike.getSpeed());
    }
    @Test
    public void bikeCanBeDeceleratedByGearTwoTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 0; i < 5; i++){
            bike.accelerate(1);
        }

        bike.decelerate(2);
        assertEquals(3,bike.getSpeed());
    }
    @Test
    public void bikeCanBeDeceleratedByGearThreeTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 5; i++){
            bike.accelerate(3);
        }

        bike.decelerate(3);
        assertEquals(9,bike.getSpeed());
    }
    @Test
    public void bikeCanBeDeceleratedByGearFourTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 5; i++){
            bike.accelerate(4);
        }

        bike.decelerate(4);
        assertEquals(12,bike.getSpeed());
    }

    @Test
    public void bikeSpeedCannotBeNegative(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 5; i++){
            bike.accelerate(1);
        }
        for (int i = 1; i < 6; i++){
            bike.decelerate(1);
        }
        assertEquals(0,bike.getSpeed());

    }

    @Test
    public void bikeGearIs1(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
       bike.accelerate(4);

        assertEquals(4,bike.getSpeed());
        bike.setGear();
        assertEquals(1,bike.getGear());
    }

    @Test
    public void bikeGearIs2(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 7; i++)bike.accelerate(4);
        assertEquals(24,bike.getSpeed());
        bike.setGear();
        assertEquals(2,bike.getGear());
    }
    @Test
    public void bikeGearIs3(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 11; i++)bike.accelerate(4);
        assertEquals(40,bike.getSpeed());
        bike.setGear();
        assertEquals(3,bike.getGear());
    }
    @Test
    public void bikeGearIs4(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        for (int i = 1; i < 12; i ++)bike.accelerate(4);
        assertEquals(44,bike.getSpeed());
        bike.setGear();
        assertEquals(4,bike.getGear());
    }

    @Test
    public void checkGearWhenOffTest(){
        Bike bike  = new Bike("Honda Bike");
        bike.turnOff();
        assertFalse(bike.isOn());
        bike.setGear();
        assertEquals(0,bike.getGear());
    }

    @Test
    public void checkToStringTest(){
        Bike bike = new Bike("Honda Bike");
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.accelerate(2);
        assertEquals(2,bike.getSpeed());
        bike.setGear();
        assertEquals(1,bike.getGear());
        bike.toString();
        System.out.println(bike);
    }





}
