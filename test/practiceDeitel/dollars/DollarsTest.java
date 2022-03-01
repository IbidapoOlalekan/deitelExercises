package practiceDeitel.dollars;

import org.junit.jupiter.api.Test;
import practiceDeitel.dollars.Dollar;
import practiceDeitel.dollars.Franc;

import static org.junit.jupiter.api.Assertions.*;

public class DollarsTest {
    @Test
    void multiplicationTest(){
        Dollar five  = (Dollar) Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }
    @Test
    void testFrancMultiplicationTest(){
        Franc five  = (Franc) Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }
    @Test void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test void testCurrency(){
        assertEquals("USD",Money.dollar(2).currency());
        assertEquals("CHF",Money.franc(2).currency());
    }

}
