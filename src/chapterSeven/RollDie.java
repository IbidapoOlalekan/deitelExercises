package chapterSeven;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 1; i <= 6000000; i++){
            ++frequency[randomNumber.nextInt(6)+1];
        }

        System.out.printf("%s%10s%n","Face","Frequency");

        for (int face = 1; face < frequency.length;face++){
            System.out.printf("%4d%10d%n",face,frequency[face]);
        }
    }
}
