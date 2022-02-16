package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ticTacToe.exception.InvalidGridSizeException;
import ticTacToe.exception.SpotUnavailableException;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.Result.NO_WINNER;
import static ticTacToe.Result.WINNER;

@DisplayName("Tic Tac Toe")
public class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    public void setUp() throws Exception {
        ticTacToe = new TicTacToe(3);
    }
    @DisplayName("Would have a board size")
    @Test
    public void ticTacToeWouldHaveABoard() throws Exception {
        Board board = new Board(3);
        assertEquals(3,board.getSize());
    }
    @DisplayName("Board Can Be SetUp")
    @Test
    public void  boardCanBeSetUp() throws Exception {
        Board board = new Board(3);
        board.getSize();
        assertEquals(3,board.getSize());
    }
    @DisplayName("Board grid can be set up ")
    @Test
    public void boardGridCanBeSetUp() throws Exception {
        Board board = new Board(3);
        assertEquals(3,board.getGrid().length);
    }
    @DisplayName("Board Grid Size Cannot Be Less Than Three")
    @Test
    public void ticTacToeBoardGridSizeCannotHaveLesserThanThreeSize() throws InvalidGridSizeException {
        Board board = null;
        try {
            board = new Board(2);
        } catch (InvalidGridSizeException e) {
            assertThrows(InvalidGridSizeException.class, board::getSize);
        }
    }
    @DisplayName("Board Can Show")
    @Test
    public void boardCanShow() throws Exception {
        Board board = new Board(3);
        String actualBoard = board.show();
        String expectedBoard = """
                   |   |  \s
                ---|---|---
                   |   |  \s
                ---|---|---
                   |   |  \s""";

        assertEquals(actualBoard,expectedBoard);
    }

    @DisplayName("Cannot Be Played At wrong position")
    @Test
    public void ticTacToeCannotBePlayedAtInvalidPosition() throws InvalidPositionException {

        try {
            ticTacToe.play(10,10);
        }
        catch (InvalidPositionException e){
            assertThrows(InvalidPositionException.class,()->ticTacToe.play(10,10));
        }
    }

    @DisplayName("Cannot be played at an occupied space")
    @Test
    public void ticTacToeCannotBePlayedAtAnOccupiedSpace() throws SpotUnavailableException {
        try {
            ticTacToe.play(2,2);
            ticTacToe.play(2,2);
        }
        catch(SpotUnavailableException e){
            assertThrows(SpotUnavailableException.class,()->ticTacToe.play(2,2));
        }

    }
    @DisplayName("First Turn First player play is X")
    @Test
    public void firstPlayerPlayXTest() throws Exception{
        ticTacToe.nextPlayer();
        assertEquals('X',ticTacToe.nextPlayer());
    }

    @DisplayName("First Turn Second Player play is O")
    @Test
    public void secondPlayerPlayOTest() throws Exception{
        ticTacToe.play(2,2);
        assertEquals('O',ticTacToe.nextPlayer());
    }

    @DisplayName("After First Round Of Play It should Be Player One Turn To Play X ")
    @Test
    public void afterFirstRoundOfPlayItShouldBePlayerOneTurnToPlayX() throws Exception{
        ticTacToe.play(1,1);
        ticTacToe.play(2,2);
        assertEquals('X',ticTacToe.nextPlayer());
    }

    @DisplayName("Game after some moves there are no winner")
    @Test
    public void afterCertainMove_NoWinner() throws Exception{
        ticTacToe.play(1,1);
        getPlayResult();
        ticTacToe.play(1,2);
        getPlayResult();
        ticTacToe.play(2,1);
        getPlayResult();
        ticTacToe.play(2,2);
        getPlayResult();
        ticTacToe.play(3,1);
        getPlayResult();
        ticTacToe.play(3,3);
        getPlayResult();

    }

    @DisplayName("Game where the first player is the winner by Playing X Horizontally" )
    @Test
    public void x_Is_Played_Horizontally_By_Player_One() throws Exception{
        ticTacToe.play(2,1);
        ticTacToe.play(1,2);
        ticTacToe.play(2,2);
        ticTacToe.play(3,1);
        ticTacToe.play(2,3);

        ticTacToe.getPlayResult();
        assertEquals(ticTacToe.getPlayResult(), Result.WINNER);
    }
    @DisplayName("Game where the second player is the winner by playing Y Horizontally")
    @Test
    public void y_Is_Played_Horizontally_By_Player_Two() throws Exception {
        ticTacToe.play(1, 2);
        ticTacToe.play(2, 1);
        ticTacToe.play(3,1 );
        ticTacToe.play(2, 2);
        ticTacToe.play(3, 3);
        ticTacToe.play(2,3);
        ticTacToe.getPlayResult();
        assertEquals( ticTacToe.getPlayResult(),(Result.WINNER));
    }

    @DisplayName("Game where player one plays X Vertically")
    @Test
    public void x_Is_Played_Vertically_By_Player_One()throws Exception {
        ticTacToe.play(1, 1);
        ticTacToe.play(1, 3);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 3);
        ticTacToe.play(3,1);
        assertEquals(ticTacToe.getPlayResult(), WINNER);
    }
    @DisplayName("Game where player Two plays O Vertically")
    @Test
    public void y_Is_Played_Vertically_By_Player_Two()throws Exception {
        ticTacToe.play(1, 1);
        ticTacToe.play(1, 3);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 3);
        ticTacToe.play(2,2);
        ticTacToe.play(3,3);
        assertEquals(ticTacToe.getPlayResult(),WINNER);
    }
    @DisplayName("Game where player one plays X From Bottom left To Top Right")
    @Test
    public void gameWherePlayerOnePlayXFromBottomLeftToTopRight() throws Exception{
        ticTacToe.play(1, 3);
        ticTacToe.play(1, 1);
        ticTacToe.play(2, 2);
        ticTacToe.play(2, 1);
        ticTacToe.play(3,1);
        assertEquals(ticTacToe.getPlayResult(),WINNER);
    }
    @DisplayName("Game where player two plays O From Bottom left To Top Right")
    @Test
    public void gameWherePlayerTwoPlayYFromBottomLeftToTopRight() throws Exception{
        ticTacToe.play(1, 3);
        ticTacToe.play(1, 1);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 2);
        ticTacToe.play(3,1);
        ticTacToe.play(3,3);
        assertEquals(ticTacToe.getPlayResult(),WINNER);
    }
    @DisplayName("Game where player one plays X From Top left To Bottom Right")
    @Test
    public void gameWherePlayerOnePlaysXFromTopLeftToBottomRight() throws Exception {
        ticTacToe.play(1,1);
        ticTacToe.play(1,2);
        ticTacToe.play(2,2);
        ticTacToe.play(1,3);
        ticTacToe.play(3,3);

        assertEquals(ticTacToe.getPlayResult(),WINNER);
    }
    @DisplayName("Game where player two plays O From Top left To Bottom Right")
    @Test
    public void gameWherePlayerTwoPlaysOFromTopLeftToBottomRight() throws Exception {
        ticTacToe.play(1,2);
        ticTacToe.play(1,1);
        ticTacToe.play(2,1);
        ticTacToe.play(2,2);
        ticTacToe.play(3,2);
        ticTacToe.play(3,3);

        assertEquals(ticTacToe.getPlayResult(),WINNER);
    }
    @DisplayName("Game Given all spot is filled It is Draw")
    @Test
    public void givenAllSpotsAreFilled_TheResultIsDraw() throws Exception {

    }




    private void getPlayResult() {
        ticTacToe.getPlayResult();
        assertEquals(NO_WINNER, Result.NO_WINNER);
    }
}
