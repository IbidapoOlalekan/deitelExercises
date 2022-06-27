package practiceDeitel.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    Fish fish;
    @BeforeEach
    public void setUp() throws Exception {
        fish = new Fish();
    }
    @Test
    public void fishHasASize()throws Exception {
         fish.setSize(20);
         assertEquals(20,fish.getSize());
    }

    @Test
    public void fishCanEat() throws Exception {
        fish.setCanEat();
        assertTrue(fish.isCanEat());
    }
    @Test
    public void fishCanSwimInASpecialWays() throws Exception {
        fish.swim();
        assertTrue(fish.getCanSwim());
    }

}