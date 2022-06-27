//package myArrayList;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class myArrayListTest {
//    private MyArrayList array;
//    @BeforeEach
//    public void setUp() throws Exception {
//        array = new MyArrayList();
//    }
//
//    @Test
//    public void emptyArrayIsEmpty() throws Exception {
//        assertTrue(array.isEmpty());
//    }
//    @Test
//    public void afterAddingElement_IsNotEmpty() throws Exception {
//        array.add("Book");
//        assertFalse(array.isEmpty());
//    }
//    @Test
//    public void afterAddingMoreThanFiveElements_IsNotEmpty() throws Exception {
//        array.add("Book");
//        array.add("Trade");
//        array.add("BookStore");
//        array.add("Book Shop");
//        array.add("Crane");
//        array.add("Bry");
//        assertFalse(array.isEmpty());
//        assertEquals(array.getSize(),6);
//    }
//
//    @Test
//    public void arrayListCanBePrinted() throws Exception {
//       array.add("Book");
//      //  System.out.println(Arrays.toString(array.getList()));
//       assertArrayEquals(new String[]{"Book",null,null,null,null},array.getList());
//
//    }
//    @Test
//    public void sizeOfListTest() throws Exception {
//        array.add("Book");
//        array.add("Pen");
//        array.add("Eraser");
//        assertEquals(3,array.getSize());
//    }
//    @Test
//    public void expandCapacityOfArray() throws Exception {
//        array.add("Book");
//        array.add("Trade");
//        array.add("BookStore");
//        array.add("Book Shop");
//        array.add("Crane");
//        array.add("Bry");
//        assertArrayEquals(new String[]{"Book","Trade","BookStore","Book Shop","Crane","Bry",null,null,null,null},array.getList());
//    }
//    @Test
//    public void whenCapacityExpandedSizeOfArrayIncrease() throws Exception {
//        array.add("Book");
//        array.add("Pen");
//        array.add("Eraser");
//        array.add("Tippex");
//        array.add("Color");
//        array.add("Painting Brush");
//        array.add("WaterColour");
//        assertFalse(array.isEmpty());
//        assertEquals(7,array.getSize());
//    }
//    @Test
//    public void addToArrayListWithIndex() throws Exception {
//        array.add("Paint");
//        array.add("Foundation");
//        array.add("Bread");
//        array.add("Jam");
//        assertFalse(array.isEmpty());
//        assertArrayEquals(new String[]{"Paint","Foundation","Bread","Jam",null},array.getList());
//        array.addListByIndex("Water Colour",0);
//        assertEquals(5,array.getSize());
//        assertArrayEquals(new String[]{"Water Colour","Paint","Foundation","Bread","Jam"},array.getList());
//
//    }
//
//    @Test
//    public void whenElementIsRemovedFromList_IsSizeReduced() throws Exception {
//        array.add("Biro");
//        array.add("Fenty");
//        array.add("Prada");
//        assertEquals(array.getSize(),3);
//        array.removeListByIndex(2);
//        assertEquals(2,array.getSize());
//    }
//    @Test
//    public void whenElementIsRemovedFromList()throws Exception {
//        array.add("Biro");
//        array.add("Fenty");
//        array.add("Prada");
//        array.add("pencil");
//        array.add("eraser");
//        assertEquals(array.getSize(),5);
//        array.removeListByIndex(2);
//        assertArrayEquals(new String[]{"Biro","Fenty","pencil","eraser",null},array.getList());
//    }
//    @Test
//    public void listCanBeGottenByIndex() throws Exception {
//        array.add("Perfume");
//        array.add("Dress");
//        array.add("Body Cream");
//        array.add("FoodStuff");
//        array.getElementAtIndex(2);
//        assertEquals("Body Cream",array.getTemp());
//    }
//
//}
