package chapterSeven;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        String[] noisemaker = new String[4];
        noisemaker[0] = "Chibuzor";
        //System.out.println(noisemaker[0]);
        noisemaker[1] = "Olalekan";
        //System.out.println(noisemaker[1]);
        noisemaker[2]= "Tolu";
        //System.out.println(noisemaker[2]);
        noisemaker[3] = "Tunji";
        //System.out.println(noisemaker[3]);
        for (int counter = 0; counter< noisemaker.length;counter++ ){
            System.out.println(noisemaker[counter]);
        }

        ArrayList<String> noisemakers = new ArrayList<>();
        noisemakers.add("Chibuzor");
        noisemakers.add("Olalekan");
        noisemakers.add("Tolu");
        noisemakers.add("Bayo");

        for (int i = 0; i < noisemaker.length; i++){
            System.out.println(noisemakers.get(i));
        }

        String[][] noise ={{"Banana", "Orange", "Mangoes"},{"Bread", "Egg","Tomatoes"},{"Rice","Beans","Yam"}};
        int serialNumber = 0;

        System.out.println("s/n Position\t Objects");
        for (int column = 0; column < noise.length; column++){
            for (int row =0; row < 3; row++){
                serialNumber+= 1;

                System.out.printf("%d\t\t",serialNumber);
                System.out.printf("%d-%d\t\t", column , row);
                System.out.print(noise[column][row]+"\n");
            }
            System.out.print("\n");
        }

        serialNumber = 0;
        System.out.println("s/n Position\t Objects");
        for (int ro = 2; ro >= 0; ro--){
            for (int col = 2; col >= 0 ;col--){
                serialNumber+= 1;

                System.out.printf("%d\t\t",serialNumber);
                System.out.printf("%d-%d\t\t", ro , col);
                System.out.print(noise[ro][col]+"\n");
            }
        }

        serialNumber = 0;
        System.out.println("s/n Position\t Objects");
        for (int ro = 2; ro >= 0; ro--){
            for (int col = 2; col >= 0 ;col--){
                serialNumber+= 1;

                System.out.printf("%d\t\t",serialNumber);
                System.out.printf("%d-%d\t\t", col , ro);
                System.out.print(noise[col][ro]+"\n");
            }
        }


    }
}
