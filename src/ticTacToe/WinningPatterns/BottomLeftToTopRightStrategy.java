package ticTacToe.WinningPatterns;

import ticTacToe.TicTacToe;

public class BottomLeftToTopRightStrategy implements PlayPattern{

    @Override
    public boolean matches(TicTacToe game) {
        int numberOfMatches = 0;
        int column = 0;

        for (int row = (game.getBoard().getSize() - 1); row >= 0 ; row--){
            if (game.getBoard().getGrid()[row][column] == game.getLastPlayer()){
                numberOfMatches++;
            }
            column++;
        }
        return numberOfMatches == game.getBoard().getSize();
    }
}
