//package practiceDeitel.MyArrayList;
//
//import myArrayList.MyArrayList;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MyArrayListTest {
//    MyNewArrayList myList;
//    @BeforeEach
//    public void setUp(){
//        myList = new MyNewArrayList();
//    }
//    @Test
//    public void myArrayListCanBeCreated() {
//        Assertions.assertNotNull(myList);
//       assertTrue(myList.isEmpty()) ;
//    }
//    @Test
//    public void myArrayListIsEmptyAtCreation() {
//        assertTrue(myList.isEmpty());
//    }
//    @Test
//    public void addItem_ListNotEmpty(){
//        myList.add("Food");
//        assertFalse(myList.isEmpty());
//    }
//
//
//    @Test
//    public void addOneItems_removeItems_ListIsEmpty(){
//        myList.add("Item");
//        myList.remove("Item");
//        assertTrue(myList.isEmpty());
//    }
//
//
//    @Test
//    public void addTwoItems_removeItems_ListIsNotEmpty(){
//        myList.add("Ball");
//        myList.add("Toy");
//        myList.remove("Ball");
//        assertFalse(myList.isEmpty());
//    }
//
//
//    @Test
//    public void addItem_SizeIsOne(){
//        myList.add("Items");
//        assertEquals(1,myList.size());
//    }
//
//
//    @Test
//    public void addTwoItems_SizeIsTwo(){
//        myList.add("Items");
//        myList.add("Items");
//        assertEquals(2,myList.size());
//
//    }
//
//    @Test
//    public void addItem_GetItemAtIndex_ReturnsItemTest(){
//        myList.add("Items");
//        myList.add("Book");
//        assertEquals("Book",myList.get(1));
//    }
//
//    @Test
//    public void addTwoItem_GetItemAtBothIndex_ReturnsItemTest(){
//        myList.add("Items");
//        myList.add("Gin");
//        assertEquals("Items",myList.get(0));
//        assertEquals("Gin",myList.get(1));
//    }
//
//    @Test
//    public void addSixItems_CapacityIsTen(){
//        assertEquals(5,myList.capacity());
//        myList.add("Items");
//        myList.add("Gin");
//        myList.add("Gin");
//        myList.add("Gin");
//        myList.add("Gin");
//        myList.add("Gin");
//        assertEquals(10,myList.capacity());
//
//    }
//
//    @Test
//    public void addThreeItems_removeItemByIndex_elementAtTwoIsNullTest() {
//        myList.add("Bin");
//        myList.add("Bread");
//        myList.add("Book");
//        myList.remove(1);
//        assertEquals("Book",myList.get(1));
//    }
//    @Test
//    public void addThreeItems_removeItemByName_elementAtTwoIsNullTest() {
//        myList.add("Bin");
//        myList.add("Bread");
//        myList.add("Book");
//        myList.remove("Bread");
//        //assertNull(myList.get(2));
//        assertEquals(null, myList.get(2));
//    }
//    @Test
//    public void removeItemsThatDoesNotExist() {
//        assertThrows(IllegalArgumentException.class,()->myList.remove("Boxers"));
////        try {
////            myList.remove("Boxers");
////        }
////        catch (IllegalArgumentException e){
////            assertEquals("Element not found",e.getMessage());
////        }
//    }
//
//
//
//}
