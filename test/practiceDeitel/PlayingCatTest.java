package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayingCatTest {
    @Test
    public void catIsPlayingIfTemperatureIsGreaterThanTwentyFiveAndLesserThanThirtyFive(){
        int temperature = 30;
        boolean cat = PlayingCat.isCatPlaying(false,temperature);
        assertTrue(cat);
        temperature =50;
        cat = PlayingCat.isCatPlaying(false,temperature);
        assertFalse(cat);
    }
    @Test
    public void catIsPlayingInSummerWhenTemperatureIsBetweenTwentyFiveAndFortyFive(){
            int temperature = 30;
            boolean cat = PlayingCat.isCatPlaying(true,temperature);
            assertTrue(cat);
            temperature = 45;
            cat = PlayingCat.isCatPlaying(true,temperature);
            assertTrue(cat);
    }

}
