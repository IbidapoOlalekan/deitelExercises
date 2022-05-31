package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaTest {
    @Test
    public void circleAreaCanBeCalculatedTest(){
        double radius = 20;
       double area =  CircleArea.circleArea(radius);
       assertEquals(1257,area);
    }
    @Test void circleRadiusCannotBeNegativeTest(){
        double radius = -20;
        double area = CircleArea.circleArea(radius);
        assertEquals(0,area);
    }
}
