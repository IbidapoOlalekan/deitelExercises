package turtleGrapics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGrapics.PenState.*;


class TurtleTest {
        Turtle ijapa;
    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
    }
    @Test
    public void turtleExist(){
        assertNotNull(ijapa);
    }

    @Test
    public void turtleHasAPenTest(){
        Pen pen = ijapa.getPen();
        assertNotNull(pen);
    }
    @Test
    public void penIsUpByDefaultTest(){
        Pen pen = ijapa.getPen();
        assertEquals(pen.getState(), UP);
    }
    @Test
    public void turtleCanMovePenDownTest(){
        assertSame(ijapa.getPen().getState(), UP);
        ijapa.penDown();
        //assert
        assertSame(ijapa.getPen().getState(), DOWN);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        //given
        ijapa.penDown();
        assertSame(ijapa.getPen().getState(),DOWN);

        //WHEN
        ijapa.penUp();
        //ASSERT
        assertSame(ijapa.getPen().getState(),UP);
    }


}