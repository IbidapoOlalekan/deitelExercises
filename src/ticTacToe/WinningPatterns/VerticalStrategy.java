package ticTacToe.WinningPatterns;

import ticTacToe.TicTacToe;

public class VerticalStrategy implements PlayPattern{
    @Override
    public boolean matches(TicTacToe game) {
        int numberOfMatches;

        for (int row = 0; row < game.getBoard().getSize(); row++) {
            numberOfMatches = 0;
            for (int column = 0; column < game.getBoard().getSize(); column++) {
                if (game.getBoard().getGrid()[column][row] == game.getLastPlayer()){
                    numberOfMatches++;
                }
            }
            if (numberOfMatches == game.getBoard().getSize()) {
                return true;
            }
        }


    return false;
    }
}
