package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'X','O','O'},{'X','X','X','F'},{'O','X','O'}};
//
//        System.out.print(ticTacToe[0][0] + " ");
//        System.out.print(ticTacToe[0][1] + " ");
//        System.out.println(ticTacToe[0][2] + " ");
//        System.out.print(ticTacToe[1][0] + " ");
//        System.out.print(ticTacToe[1][1] + " ");
//        System.out.println(ticTacToe[1][2] + " ");
//        System.out.print(ticTacToe[2][0] + " ");
//        System.out.print(ticTacToe[2][1] + " ");
//        System.out.println(ticTacToe[2][2] + " ");
        for (int i = 0 ; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++){
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
    }
}
