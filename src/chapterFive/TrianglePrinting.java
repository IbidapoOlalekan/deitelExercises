package chapterFive;

import java.awt.font.FontRenderContext;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*******************************");
        for (int i = 11; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("**********************************");
        for (int i = 11; i >= 0; i--) {
            for (int j = 0; j < 12 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println("************************************");

        for (int i = 0; i < 11; i++){
            for (int w = 0; w < 11-i;w++){
                System.out.print(" ");
            }
            for (int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
