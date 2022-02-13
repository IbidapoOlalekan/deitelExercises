package ticTacToe;

import ticTacToe.exception.InvalidGridSizeException;

public class Board {
    private final int size;

    public Board(int size) {
        this.size = size;
        if(size > 2){

        }else{
            throw new InvalidGridSizeException("In order for the game to work, grid sizes should be at least 3 x 3");
        }

    }


    public int getSize() {
        return size;
    }
}
