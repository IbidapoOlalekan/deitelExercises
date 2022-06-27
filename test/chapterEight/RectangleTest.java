package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    public void setUp(){
        rectangle = new Rectangle();
    }


    @DisplayName("Rectangle Length Can Be Set")
    @Test
    public void rectangleLengthCanBeSet() throws Exception {
        float length = 10;
        rectangle.setLength(length);
        assertEquals(length,rectangle.getLength());
    }

    @DisplayName("Rectangle length Cannot Be Less Than Zero")
    @Test
    public void rectangleLengthCannotBeLessThanZero() throws IllegalArgumentException {
        try {
            rectangle.setLength(-10);
        }
        catch(IllegalArgumentException e){
            assertEquals("Length Is Invalid",e.getMessage());
        }
    }

    @DisplayName("Rectangle length Cannot Be Greater Than Twenty")
    @Test
    public void rectangleLengthCannotBeGreaterThanTwenty() throws IllegalArgumentException{
        try {
            rectangle.setLength(20);
        }
        catch (IllegalArgumentException e) {
            assertEquals("Length Is Invalid",e.getMessage());
        }
    }

    @DisplayName("Rectangle Width Can Be Set")
    @Test
    public void rectangleWidthCanBeSet() throws Exception {
        float width = 12;
        rectangle.setWidth(width);
        assertEquals(width,rectangle.getWidth());
    }

    @DisplayName("Rectangle Width Cannot Be Less Than Zero")
    @Test
    public void rectangleWidthCannotBeLessThanZero() throws IllegalArgumentException {
        try {
            rectangle.setWidth(-10);
        }
        catch (IllegalArgumentException e) {
            assertEquals("Width Is Invalid",e.getMessage());
        }
    }
    @DisplayName("Rectangle Width Cannot Be Greater Than Or Equal to Twenty")
    @Test
    public void rectangleWidthCannotBeGreaterThanOrEqualToTwenty()throws IllegalArgumentException{
        try {
            rectangle.setWidth(20);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Width Is Invalid", e.getMessage());
        }
    }

    @DisplayName("Rectangle Perimeter Can Be Calculated")
    @Test
    public void rectanglePerimeterCanBeCalculated(){
        float width = 10;
        float length = 5;
        rectangle.setLength(length);
        rectangle.setWidth(width);
        assertEquals(30,rectangle.perimeter());
    }

    @DisplayName("Rectangle Area Can Be Calculated")
    @Test
    public void rectangleAreaCanBeCalculated(){
        float width = 10;
        float length = 5;
        rectangle.setLength(length);
        rectangle.setWidth(width);
        assertEquals(50,rectangle.area());
    }
}