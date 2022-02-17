package turtleGrapics;

import static turtleGrapics.Direction.*;
import static turtleGrapics.PenState.*;

public class Turtle {

   private Pen biro = new Pen();
   private Direction currentDirection = EAST;
   private Position currentPosition = new Position(0,0);
    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(DOWN);
    }
    public void penUp() {
        biro.setState(UP);
    }


    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
        }
//
//        if (currentDirection == NORTH) face(EAST);
//
//        if (currentDirection == WEST) face(NORTH);
//        if (currentDirection == SOUTH) face(WEST);
//        if (currentDirection == EAST) face(SOUTH);


    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        switch(currentDirection){
            case SOUTH -> face(EAST);
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
        }
//        if (currentDirection ==SOUTH)face(EAST);
//        if (currentDirection == WEST)face(SOUTH);
//        if (currentDirection == NORTH)face(WEST);
//        if (currentDirection == EAST)face(NORTH);



    }

    public void move(int numberOfSteps) {
        if (currentDirection == EAST) increaseColumnBy(numberOfSteps - 1);
        if (currentDirection == SOUTH) increaseRowBy(numberOfSteps - 1);
    }

    private void increaseRowBy(int increase) {
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(currentRow + increase );
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn(currentPosition.getColumn() + increase);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
