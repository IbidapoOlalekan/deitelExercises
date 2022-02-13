package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ticTacToe.exception.InvalidGridSizeException;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
        board.getSize();
        assertEquals(3,board.getSize());
    }
    @DisplayName("Board Size Cannot Be less Than Two")
    @Test
    public void ticTacToeBoardCannotHaveLesserThanTwoSize() throws Exception {
        Board board = new Board(1);
//        assertThatThrownBy(InvalidGridSizeException.class,()-> board.getSize());
        try{
            board.getSize();
        }
        catch (InvalidGridSizeException e){
            assertThrows(InvalidGridSizeException.class, e::getMessage);
        }
    }

}
