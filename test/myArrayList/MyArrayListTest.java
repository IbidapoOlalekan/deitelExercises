package myArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList array;
    @BeforeEach
    public void setUp() throws Exception {
        array = new MyArrayList();
    }
    @Test
    public void newArrayListIsEmpty() throws Exception {
        assertTrue(array.isEmpty());
    }
    @Test
    public void afterAddingToArray_IsNotEmpty() throws Exception {
        array.add("book");
        assertFalse(array.isEmpty());
    }
    @Test
    public void afterAddingAnElement_IsNotEmpty() throws Exception {
        array.add("Physics");
        assertFalse(array.isEmpty());
    }

    @Test
    public void arrayListIsNullWhenEmpty() throws Exception {
       assertTrue(array.isEmpty());
       assertTrue(array.isNull());
    }
    @Test
    public void arraySizeIncreaseWhenFilled(){
            array.add("");
    }



}