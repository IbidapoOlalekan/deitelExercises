package ticTacToe;

import ticTacToe.WinningPatterns.BottomLeftToTopRightStrategy;
import ticTacToe.WinningPatterns.HorizontalWinningPattern;
import ticTacToe.WinningPatterns.TopLeftToBottomRightStrategy;
import ticTacToe.WinningPatterns.VerticalStrategy;
import ticTacToe.exception.SpotUnavailableException;

public class TicTacToe {
    private final Board board;
    private char lastPlayer;
    private static final char EMPTY = ' ';

    public TicTacToe(int boardSize){
        board = new Board(boardSize);
    }

    public Result play(int row, int column) {
        checkPosition(row);
        checkPosition(column);
        lastPlayer = nextPlayer();
        assignSpots(row, column, lastPlayer);

        return getPlayResult();
    }

    private void assignSpots(int row, int column, char player) {
        if (board.getGrid()[row - 1][column -1] == EMPTY){
            board.getGrid()[row - 1][column -1] = player;
        }
        else{
            throw new SpotUnavailableException("This spot is already taken");
        }
    }

    public char nextPlayer() {
        return lastPlayer == 'X' ? 'O' : 'X';
    }

    private void checkPosition(int position) {
        if (position < 1 || position > board.getSize()){
            throw new InvalidPositionException("This position is Invalid");
        }
    }

    public Result getPlayResult() {
        if (new HorizontalWinningPattern().matches(this)||
        new BottomLeftToTopRightStrategy().matches(this)||
        new TopLeftToBottomRightStrategy().matches(this)||
        new VerticalStrategy().matches(this)){
            return Result.WINNER;
        }
        if (isDraw()){
            return Result.DRAW;
        }

        return Result.NO_WINNER;

    }

    private boolean isDraw() {
        for (int row = 0; row < board.getSize(); row++) {
            for (int column = 0; column < board.getSize(); column++) {
                if (board.getGrid()[row][column] == EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }


    public Board getBoard() {
        return board;
    }

    public char getLastPlayer() {
        return lastPlayer;
    }
}
