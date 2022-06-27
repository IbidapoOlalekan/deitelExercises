package practiceDeitel.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    Duck duck;
    @BeforeEach
    public void setUp() throws Exception {
        duck = new Duck();
    }

    @Test
    public void duckHaveBeakColor()throws Exception {
     duck.getBeakColor();
     assertEquals("yellow",duck.getBeakColor());
    }

    @Test
    public void duckCanSwim()throws Exception {
        duck.swim();
        assertEquals("I am swimming like a Duck",duck.swim());
    }

    @Test
    public void duckCanQuack()throws Exception {
        duck.quack();
    }
    @Test
    public void duckHaveAnAge_FromAnimalClass()throws Exception {
        duck.setAge(23);
        assertEquals(23,duck.getAge());
    }
    @Test
    public void duckCanHaveAGender_FromAnimalClass()throws Exception {
        duck.setGender("Male");
        assertEquals("Male",duck.getGender());
    }
    @Test
    public void duckIsNotAMammal_FromAnimalClass()throws Exception {
        duck.isMammal();
        assertTrue(duck.isMammal());
    }

}