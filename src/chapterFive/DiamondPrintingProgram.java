package chapterFive;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j<= 6-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >0 ;i--){
            for (int j = 1; j <= 6 -i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
