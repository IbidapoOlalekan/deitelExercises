package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BarkingDogTest {
    @Test
    public void shouldWakeUpIfDogBarkIfHourLessThanEightAndGreaterThanTwentyTwoTest(){
        boolean wake = BarkingDog.shouldWakeUp(true,7);
        assertTrue(wake);
        boolean wakeT = BarkingDog.shouldWakeUp(true,23);
        assertTrue(wakeT);
    }
    @Test
    public void hourOfDayCannotBeLessThanZeroAndGreaterThanTwentyThree(){
       boolean wake = BarkingDog.shouldWakeUp(true,-1);
       assertFalse(wake);
       boolean test = BarkingDog.shouldWakeUp(true,24);
       assertFalse(test);
    }
    @Test
    public void dontWakeUpWhenBarkingIsFalse(){
        boolean wake = BarkingDog.shouldWakeUp(false,2);
        assertFalse(wake);
    }
}
