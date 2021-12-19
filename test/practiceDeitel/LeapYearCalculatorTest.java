package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCalculatorTest {
    @Test
    public void checkIfYearIsLeapYear(){
       boolean leapYear =  LeapYearCalculator.isLeapYear(2024);
        assertTrue(leapYear);
    }
    @Test
    public void checkIfYearIsNotLeapYearTest(){
        boolean leapYear = LeapYearCalculator.isLeapYear(2021);
        assertFalse(leapYear);
    }

}
