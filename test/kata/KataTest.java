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
    @Test
    public void checkQuantitiesBetweenFiveAndNine(){
        Cata prices = new Cata();
        int numberOfQuantities  = 6;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1800 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesBetweenTenAndTwentyNine(){
        Cata prices = new Cata();
        int numberOfQuantities  =22;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1600 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesBetweenThirtyAndFourtyNine(){
        Cata prices = new Cata();
        int numberOfQuantities  =42;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1500 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesBetweenFiftyAndNinetyNine(){
        Cata prices = new Cata();
        int numberOfQuantities  =80;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1300 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesBetweenHundredAndOneHundredAndNinetyNine(){
        Cata prices = new Cata();
        int numberOfQuantities  =180;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1200 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesBetweenTwoHundredAndFourHundredAndNinetyNine(){
        Cata prices = new Cata();
        int numberOfQuantities  =299;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1100 * numberOfQuantities,price);
    }
    @Test
    public void checkQuantitiesAboveFiveHundred(){
        Cata prices = new Cata();
        int numberOfQuantities  =590;
        int price = prices.calculatePriceFor(numberOfQuantities);
        assertEquals(1000 * numberOfQuantities,price);
    }
}
