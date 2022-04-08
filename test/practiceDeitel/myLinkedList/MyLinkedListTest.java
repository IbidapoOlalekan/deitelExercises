package practiceDeitel.myLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList linkedList;
    @BeforeEach
    public void setUp(){
        linkedList = new MyLinkedList();
    }
    @Test void linkedListExist(){
        assertNotNull(linkedList);
    }

    @Test void nodeExist(){
        Node node = new Node();
        assertNotNull(node);
    }

    @Test void testToAddElementToLastList(){
        linkedList.addLast(5);
        Node node = new Node();
        node.setValue(5);
    }
}