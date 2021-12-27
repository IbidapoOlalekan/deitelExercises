package chapterSix;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        squareOfAsterisks(5);
    }

    public static void squareOfAsterisks(int sides){
        for (int i = 0; i < sides; i++){
            for (int j = 0; j < sides; j ++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
