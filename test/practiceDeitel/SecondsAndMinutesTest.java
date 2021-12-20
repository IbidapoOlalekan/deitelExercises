package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondsAndMinutesTest {
    @Test
    public void ifMinutesIsNegativeItWouldReturnInvalidValue(){
        long minutes = -1;
        long seconds = -2;
       String value = SecondsAndMinutes.getDurationString(minutes,seconds);
       assertEquals("Invalid Value",value);
    }
    @Test
    public void getDurationString(){
        long minutes = 61;
        long seconds = 00;
        String value = SecondsAndMinutes.getDurationString(minutes,seconds);
        assertEquals("01 h 01 m 00 s ",value );
    }
    @Test
    public void getDurationStringWithOneParameterOfSecondsLesserThanZero(){
        long seconds = -1;
        String value = SecondsAndMinutes.getDurationString(seconds);
        assertEquals("Invalid Value",value);
    }
    @Test
    public void getDurationStringWithParameterOfSecondsAlone(){
        long seconds  = 3945L;
        String value = SecondsAndMinutes.getDurationString(seconds);
        assertEquals("01 h 05 m 45 s ",value);
    }
}
