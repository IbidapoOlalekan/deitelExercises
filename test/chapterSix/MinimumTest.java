package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTest {
    @Test
    public  void minimumTest(){
        float firstNum = 5;
        float secondNum = 4;
        float thirdNum = 10;
        float minimum = Minimum.minimumOfThreeFloatNumbers(firstNum,secondNum,thirdNum);
        assertEquals(secondNum,minimum);
    }

    @Test void minimumIfNegativeNumberTest(){
        float firstNum =-1;
        float secondNum = 2;
        float thirdNum = -3;
        float minimum = Minimum.minimumOfThreeFloatNumbers(firstNum,secondNum,thirdNum);
        assertEquals(thirdNum,minimum);
    }
}
