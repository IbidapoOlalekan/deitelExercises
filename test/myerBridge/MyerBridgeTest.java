package myerBridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyerBridgeTest {
    MyerBridge myerBridge;
   @BeforeEach
   public void setUp() {
       myerBridge = new MyerBridge();
   }

    @Test
    public void questionsCanBeSet(){
        myerBridge.setQuestion();
    }
}
