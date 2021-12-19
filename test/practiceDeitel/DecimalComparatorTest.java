package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecimalComparatorTest {
    @Test
    public void areEqualByThreeDecimalPlacesTest(){
        boolean test = DecimalComparator.areEqualByThreeDecimalPlaces(1.136,1.136);
        assertTrue(test);
    }
    @Test
    public void calcFeetAndInchesToCentimetersTest(){
       double rest= DecimalComparator.calcFeetAndInchesToCentimeters(6,2);
       assertEquals(187.96,rest);
    }
    @Test
    public void InchesCannotBeGreaterThanTwelveTest(){
       double test =  DecimalComparator.calcFeetAndInchesToCentimeters(-1,13);
       assertEquals(-1,test);
    }
}
