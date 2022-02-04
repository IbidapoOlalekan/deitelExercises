package practiceDeitel.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZebraTest {
    Zebra zebra;
    @BeforeEach
    public void setUp() throws Exception{
        zebra = new Zebra();
    }
    @Test
    public void zebraIsWild()throws Exception {
        zebra.setWild(true);
        assertTrue(zebra.isWild());
    }
    @Test
    public void zebraCanRun() throws Exception {
        zebra.run();
        assertEquals("Running Like A Zebra",zebra.run());
    }
    @Test
    public void zebraHasAge() throws Exception {
        zebra.setAge(27);
        assertEquals(27,zebra.getAge());
    }

}