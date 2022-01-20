package chapterEight;

import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleStateSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageTest {
    @Test
    public void noArgs(){
        Beverage beverage = new Beverage();

        assertEquals(0,beverage.getCocoaQty());
        assertEquals(0, beverage.getMilkQty());
        assertEquals(5, beverage.getSugarQty());
    }

    @Test
    public void allArgsTest(){
        Beverage cowbellChoco = new Beverage(2,4,6);
        assertEquals(6,cowbellChoco.getCocoaQty());
        assertEquals(8,cowbellChoco.getSugarQty());
    }

    @Test
    public void milkOnlyRequiredTest(){
        Beverage cowbellChoco = new Beverage(3);
        assertEquals(3,cowbellChoco.getMilkQty());
        assertEquals(0, cowbellChoco.getCocoaQty());
        assertEquals(0, cowbellChoco.getSugarQty());
    }

    @Test
    public void chocoAndMilkOnlyTest(){
        Beverage cowbellChoco = new Beverage(4,5);
        assertEquals(4,cowbellChoco.getCocoaQty());
        assertEquals(5,cowbellChoco.getMilkQty());
    }
}
