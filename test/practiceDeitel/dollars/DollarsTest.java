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

    @Test void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10), reduced);
    }


    @Test void testReduceMoney(){
    Bank bank = new Bank();
    Money result = bank.reduce(Money.dollar(1),"USD");
    assertEquals(Money.dollar(1),result);
    }

    @Test void testReduceMoneyWithDifferentCurrencies(){
        Bank bank = new Bank();
        bank.addRate("CHF","USD", 2);
        Money result = bank.reduce(Money.franc(2),"USD");
        assertEquals(Money.dollar(1), result);
    }
    
    @Test void testIdentittyRate() {
        assertEquals(1, new Bank().rate("USD","USD"));
    }
}
