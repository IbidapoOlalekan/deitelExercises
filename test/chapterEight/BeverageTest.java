package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageTest {
    @Test
    public void noArgs(){
        Beverage beverage = new Beverage();

        assertEquals(0,beverage.getCocoaQty());
        assertEquals(0, beverage.getMilkQty());
        assertEquals(5, beverage.getMilkQty());
    }

    @Test
    public void defaultArgsTest(){

    }
}
