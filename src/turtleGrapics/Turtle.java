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

    public void moveWithoutWriting(int numberOfSteps) {
        if (currentDirection == EAST) increaseColumnBy(numberOfSteps - 1);
        if (currentDirection == SOUTH) increaseRowBy(numberOfSteps - 1);
        if (currentDirection == NORTH) decreaseRowBy(numberOfSteps - 1);
        if (currentDirection == WEST) decreaseColumnBy(numberOfSteps - 1);
    }

    private void decreaseColumnBy(int decrease) {
        currentPosition.setColumn(currentPosition.getColumn() - decrease);
    }

    private void decreaseRowBy(int decrease) {
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(currentRow - decrease);
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

    public void move(int noOfSteps, SketchPad pad) {
        validateMove(noOfSteps,pad);
        if (biro.getState().equals(DOWN)){
         write(noOfSteps, pad);
           //write
        }
            moveWithoutWriting(noOfSteps);

    }

    private void validateMove(int noOfSteps, SketchPad pad) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                int newMove =column + noOfSteps;
                int sketchPadColumnLength = pad.getFloor()[row].length;
                if (newMove > sketchPadColumnLength) throw new InvalidMoveException("Ijapa don fall");
            }
            case SOUTH ->{
                int newMove = row + noOfSteps;
                int sketchPadRowLength = pad.getFloor()[column].length;
                if (newMove > sketchPadRowLength) throw new InvalidMoveException("Ijapa don fall");
            }
        }
    }

    private void write(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row  = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch(currentDirection){
            case EAST ->  {
                for (int i = column; i < column+noOfSteps; i++) {
                    floor[row][i] = 1;
                }
            }
            case SOUTH -> {
                for (int i = row; i < row+noOfSteps; i++){
                    floor[i][column] = 1;
                }
            }

            case NORTH->{
                for(int i = row; i > row-noOfSteps; i--){
                    floor[i][column] = 1;
                }
            }

            case WEST ->{
                for(int i = column; i > column-noOfSteps; i--){
                    floor[row][i] = 1;
                }
            }


        }
    }
}
