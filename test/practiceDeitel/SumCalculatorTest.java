package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SumCalculatorTest {

    private SumCalculator sumCalculator = new SumCalculator();
    @Test
    public void firstNumberCanBeSet(){
        sumCalculator.setFirstNumber(10);
        assertEquals(10,sumCalculator.getFirstNumber());
    }
    @Test
    public void secondNumberCanBeSet(){
        sumCalculator.setSecondNumber(12);
        assertEquals(12,sumCalculator.getSecondNumber());
    }
    @Test
    public void firstNumberCanBeAddedToSecondNumber(){
        sumCalculator.setFirstNumber(10);
        assertEquals(10,sumCalculator.getFirstNumber());
        sumCalculator.setSecondNumber(20);
        assertEquals(20,sumCalculator.getSecondNumber());
        double result = sumCalculator.getAdditionResult();
        assertEquals(30,result);
    }
    @Test
    public void firstNumberCanBeSubtractedFromSecondNumber(){
        sumCalculator.setFirstNumber(30);
        assertEquals(30,sumCalculator.getFirstNumber());
        sumCalculator.setSecondNumber(20);
        assertEquals(20,sumCalculator.getSecondNumber());
        double result = sumCalculator.getSubtractionResult();
        assertEquals(10,result);
    }
    @Test
    public void firstNumberCanBeMultipliedBySecondNumber(){
        sumCalculator.setFirstNumber(30);
        assertEquals(30,sumCalculator.getFirstNumber());
        sumCalculator.setSecondNumber(20);
        assertEquals(20,sumCalculator.getSecondNumber());
        double result = sumCalculator.getMultiplicationResult();
        assertEquals(600,result);
    }
    @Test
    public void firstNumberCanBeDividedBySecondNumber(){
        sumCalculator.setFirstNumber(40);
        assertEquals(40,sumCalculator.getFirstNumber());
        sumCalculator.setSecondNumber(20);
        assertEquals(20,sumCalculator.getSecondNumber());
        double result = sumCalculator.getDivisionResult();
        assertEquals(2,result);
    }
    @Test
    public void firstNumberCannotBeDividedByZero(){
        sumCalculator.setFirstNumber(30);
        assertEquals(30,sumCalculator.getFirstNumber());
        sumCalculator.setSecondNumber(0);
        assertEquals(0,sumCalculator.getSecondNumber());
        double result = sumCalculator.getDivisionResult();
        assertEquals(0,result);
    }
}
