package ticTacToe;

import ticTacToe.exception.InvalidGridSizeException;



public class Board {
    private static final char EMPTY = ' ';
    private final int size;
    private char[][] grid;

    public Board(int size) {
        this.size = size;
    try {
        if (size > 2) {
            setup();
        }
    }catch (InvalidGridSizeException e){
                throw new InvalidGridSizeException("In order for the game to work, grid sizes should be at least 3 x 3");
            }
        }

    private void setup() {
        grid = new char[size][size];
        for(int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                grid[row][col] = EMPTY;
            }
        }
    }
    
    


    public int getSize() {
        return size;
    }

    public char[][] getGrid() {
        return grid;
    }

    public String show() {
        StringBuilder board = new StringBuilder();
        for (int row = 0; row < size; row++){
            StringBuilder columnSeparator = new StringBuilder();
            addRow(board, grid[row], columnSeparator);
            addRowSeparator(board, columnSeparator);
        }

        removeLastRowSeparator(board);
        return board.toString();
    }

    private void removeLastRowSeparator(StringBuilder board) {
        board.delete((board.deleteCharAt(board.length() - 1).lastIndexOf("\n")), board.length());
    }

    private void addRowSeparator(StringBuilder board, StringBuilder columnSeparator) {
        board.deleteCharAt(board.length() - 1);
        board.append("\n");
        columnSeparator.deleteCharAt(columnSeparator.length() - 1);
        board.append(columnSeparator);
        board.append("\n");
    }

    private void addRow(StringBuilder board, char[] chars, StringBuilder columnSeparator) {
        for (int column = 0; column < size;column++){
            board.append(" ");
            board.append(chars[column]);
            board.append(" |");
            columnSeparator.append("---|");
        }
    }


}
