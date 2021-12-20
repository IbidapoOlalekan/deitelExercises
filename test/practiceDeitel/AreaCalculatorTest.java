package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AreaCalculatorTest {
    @Test
    public void calculateAreaWhenRadiusIsLessThanZero(){
        int radius = -1;
       double area =  AreaCalculator.area(radius);
        assertEquals(-1,area);
    }

    @Test
    public void calculateAreaTestWithOneParameter(){
        int radius = 10;
        double area = AreaCalculator.area(radius);
        assertEquals(314.0,area);

    }

    @Test
    public void calculateAreaWithTwoParameterWhereOneIsLessThanZero(){
        double x = -10;
        double y = 10;
        double area = AreaCalculator.area(x,y);
        assertEquals(-1,area);

    }

    @Test
    public void calculateAreaWithTwoParameters(){
        double x= 10;
        double y  = 10;
        double area = AreaCalculator.area(x,y);
        assertEquals(100,area);
    }

}
