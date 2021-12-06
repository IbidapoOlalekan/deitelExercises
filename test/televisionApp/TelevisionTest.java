package televisionApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void tvCanBeTurnedOnTest(){
        //Given we have a television and we can turn it on
        Television television = new Television("Samsung TV");
        television.getName();
        assertEquals("Samsung TV",television.getName());
        // when AC is on
        television.turnOn();
        //check if television turn on
        assertTrue(television.isOn());
    }

    @Test
    public void tvCanBeTurnedOffTest(){
        //Given we have a television and it is on
        Television television = new Television("Samsung TV");
        assertEquals("Samsung TV",television.getName());
        television.turnOn();
        assertTrue(television.isOn());

        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test

    public void tvVolumeCanBeIncreased(){
        //Given that we have a Television and it is on
        Television television = new Television("Samsung TV");
        assertEquals("Samsung TV", television.getName());
        television.turnOn();
        assertTrue(television.isOn());
        // when we want to increase Television volume
        television.increaseVolumeTest();
        television.increaseVolumeTest();
        for (int i = 1; i < 10; i++){
            television.increaseVolumeTest();
        }
        assertEquals(11,television.getVolume());

    }
    @Test
    public void tvVolumeCanBeReduced(){
        //Given that TV is on and  we have a television
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());
        //when volume is increased and needs to be decreased
        for (int i = 1; i < 50; i++){
            television.increaseVolumeTest();

        }
        assertEquals(49,television.getVolume());
        // to decrease the temperature
        for (int i = 1; i < 30; i++){
            television.decreaseVolume();
        }
        assertEquals(20,television.getVolume());


    }

    @Test
    public void tvVolumeCannotIncreaseAbove100Test(){
        // Given that we have a television and it must  be turned on
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());
        //when volume is increased
        for (int i =0 ; i <102;i++){
            television.increaseVolumeTest();
        }
        assertEquals(100,television.getVolume());

    }

    @Test
    public void tvVolumeCannotBeNegative(){
        //Given that we have a television and it is on
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());
        //when volume is 0
        for (int i =1; i < 12;i++){
            television.decreaseVolume();
        }

        assertEquals(0,television.getVolume());
    }

    @Test
    public void tvCanPickAChannelTest(){
        //Given that we have a television and the Television is On
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());
        //when we want to pick a channel
        television.setChannel(12);
        //check if the channel changed
        assertEquals(12,television.getChannel());
    }
    @Test
    public void tvChannelCannotPickANegativeChanner(){
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());
        //when we change the channel
        television.setChannel(-15);
        // check if channel doesnt change
        assertEquals(0,television.getChannel());
    }

    @Test
    public void tvCanChangeChannelTest(){
        //Given that we have a television and it is on and the channel is set
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());

        television.setChannel(10);
        // when we want to change channel
        television.changeChannel();
        //check if channel changed
        assertEquals(11,television.getChannel());
    }

    @Test
    public void tvChannelCanBeDecreasedTest(){
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());

        television.setChannel(10);

        television.decreaseChannel();

        assertEquals(9,television.getChannel());
    }

    @Test
    public void tvVolumeCanBeMutedTest(){
        Television television = new Television("Samsung TV");
        television.turnOn();
        assertTrue(television.isOn());

        television.increaseVolumeTest();

        //when we want to mute
        television.mute();
        assertEquals(0 , television.getVolume());
    }

    @Test
    public void tvChannelIs0WhenOff(){
        Television television = new Television("Samsung TV");
        television.turnOff();
        assertFalse(television.isOn());
        television.setChannel(10);
        assertEquals(0,television.getChannel());

    }

}
