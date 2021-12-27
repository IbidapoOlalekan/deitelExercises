package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTest {
    @Test
    public  void minimumTest(){
        float firstNum = 5;
        float secondNum = 4;
        float thirdNum = 10;
        float minimum = Minimum.minimum3(firstNum,secondNum,thirdNum);
        assertEquals(secondNum,minimum);

    }
}
