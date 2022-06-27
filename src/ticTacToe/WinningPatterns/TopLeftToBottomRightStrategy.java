package ticTacToe.WinningPatterns;

import ticTacToe.TicTacToe;

public class TopLeftToBottomRightStrategy implements PlayPattern{
    @Override
    public boolean matches(TicTacToe game) {
        int numberOfMatches = 0;

        for (int i = 0 ; i < game.getBoard().getSize(); i++){
            if (game.getBoard().getGrid()[i][i] == game.getLastPlayer()){
                numberOfMatches++;
            }
        }
        return numberOfMatches == game.getBoard().getSize();
    }
}
