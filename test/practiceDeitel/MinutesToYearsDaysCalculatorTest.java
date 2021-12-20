package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesToYearsDaysCalculatorTest {
    @Test
    public void minutesToYearsWhenMinutesIsLessThan0(){
        long minutes = -1;
       String min =  MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertEquals("Invalid Value", min);
    }
    @Test
    public void printYearsAndDaysTest(){
        long minutes = 525600;
        String minute = MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertEquals("525600 min =1 y and 0 d",minute);
    }
}
