package practiceDeitel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SumOddRangeTest {
    @Test
    public void displayOddWhenTested(){
        int number = 1;
       boolean odd =  SumOddRange.isOdd(number);
        assertTrue(odd);
    }
    @Test
    public void oddWouldReturnFalseWhenLessThanZero(){
        int number = -1;
        boolean odd = SumOddRange.isOdd(number);
        assertFalse(odd);
    }
    @Test
    public void oddNumbersWithinARangeCanBeAdded() {
        int start = 1;
        int end  = 10;
        int total = SumOddRange.sumOdd(start,end);
        assertEquals(25,total);
    }
    @Test
    public void oddNumberWouldReturnNegativeOneIfNumberLessThanZero(){
        int start= -1;
        int end  = 10;
        int total = SumOddRange.sumOdd(start,end);
        assertEquals(-1,total);
    }
    @Test
    public void oddNumberWouldReturnNegativeOneIfEndIsGreaterThanStart(){
        int start = 10;
        int end  = 2;
        int total = SumOddRange.sumOdd(start,end);
        assertEquals(-1,total);
    }


}
