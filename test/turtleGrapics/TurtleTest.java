package turtleGrapics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import static turtleGrapics.Direction.*;
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

    @Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(),Direction.EAST);

        ijapa.turnRight();

        assertSame(ijapa.getCurrentDirection(),SOUTH);

    }
    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),SOUTH);

        ijapa.turnRight();

        assertSame(WEST,ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRight_WhileFacingWestTest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),SOUTH);

        ijapa.turnRight();

        assertSame(WEST,ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(NORTH,ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRight_WhileFacingNorthTest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),SOUTH);

        ijapa.turnRight();

        assertSame(WEST,ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(NORTH,ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(EAST,ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingNorthTest(){
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_WhileFacingWestTest(){
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest(){
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST,ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMove_WhileFacingEastTest(){
        ijapa.moveWithoutWriting(6);
        ijapa.moveWithoutWriting(5);
        Position expected = new Position(0,9);
        assertEquals(expected,ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMove_WhileFacingSouthTest(){
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(5,0);
        assertEquals(expected,ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMove_WhileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.moveWithoutWriting(6);
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.moveWithoutWriting(6);
        Position expected = new Position(0,0);
        assertEquals(expected,ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_WhileFacingWestTest(){
        ijapa.moveWithoutWriting(6);
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST,ijapa.getCurrentDirection());
        ijapa.moveWithoutWriting(3);
        Position expected = new Position(0,3);
        assertEquals(expected,ijapa.getCurrentPosition());
    }

    @Test void turtleCanWrite_whenPenIsDownTest() {
        ijapa.penDown();
        SketchPad pad = new SketchPad(5,5);
        ijapa.move(5,pad);
        //assert
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        int[][] floor = pad.getFloor();
        assertEquals(1,floor[0][0]);
        assertEquals(1,floor[0][1]);
        assertEquals(1,floor[0][2]);
        assertEquals(1,floor[0][3]);
        assertEquals(1,floor[0][4]);
        pad.display();
    }


}