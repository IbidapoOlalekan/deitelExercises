package chapterSeven;

import java.security.SecureRandom;
import java.util.Scanner;

public class CopyingArray {
    public static void main(String[] args) {
        String[] copyFrom = {"Affogato","Americano","Cappuccino","Corretto","Cortado",
                "Doppio","Espresso","Frappucino","Freddo","Lungo","Macchiato",
                "Marocchino","Ristretto"
        };

        String[]copyTo = java.util.Arrays.copyOfRange(copyFrom,2,9);
       // System.arraycopy(copyFrom,2,copyTo,0,7);
        for (String coffee : copyTo) System.out.println(coffee + " ");
    }
}
