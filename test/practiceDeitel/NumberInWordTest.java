package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberInWordTest {
    @Test
    public void zeroCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(0);
        assertEquals("ZERO",number);
    }
    @Test
    public void oneCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(1);
        assertEquals("ONE",number);
    }
    @Test
    public void twoCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(2);
        assertEquals("TWO",number);
    }
    @Test
    public void threeCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(3);
        assertEquals("THREE",number);
    }
    @Test
    public void fourCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(4);
        assertEquals("FOUR",number);
    }
    @Test
    public void fiveCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(5);
        assertEquals("FIVE",number);
    }
    @Test
    public void sixCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(6);
        assertEquals("SIX",number);
    }
    @Test
    public void sevenCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(7);
        assertEquals("SEVEN",number);
    }
    @Test
    public void eightCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(8);
        assertEquals("EIGHT",number);
    }
    @Test
    public void nineCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(9);
        assertEquals("NINE",number);
    }
    @Test
    public void otherCanBePrintedInWord(){
        String number =   NumberInWord.printNumberInWord(10);
        assertEquals("OTHER",number);
    }

}
