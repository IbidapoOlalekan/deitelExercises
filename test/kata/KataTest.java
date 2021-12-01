package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void aGradeCanBeCalculatedTest(){
        Cata cata = new Cata();
        char result = cata.calculateGradeFor(98);
        assertEquals('A',result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
        Cata gradeSomething = new Cata();
        char result = gradeSomething.calculateGradeFor(89);
        assertEquals('B',result);

    }
    @Test
    public  void cGradeCalculatorTest(){
    Cata gradeSomething = new Cata();
    char myResult = gradeSomething.calculateGradeFor(79);
    assertEquals('C',myResult);
    }
    @Test
    public  void dGradeCalculatorTest(){
        Cata gradeSomething = new Cata();
        char myResult = gradeSomething.calculateGradeFor(65);
        assertEquals('D',myResult);
    }
    @Test
    public  void fGradeCalculatorTest(){
        Cata gradeSomething = new Cata();
        char myResult = gradeSomething.calculateGradeFor(59);
        assertEquals('F',myResult);
    }
    @Test
    public void checkQuantitiesBetweenOneAndFour(){
        Cata prices = new Cata();
        int numberOfQuantities  = 2;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(2000 * numberOfQuantities,price);
    }
}
