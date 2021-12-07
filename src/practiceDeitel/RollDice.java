package practiceDeitel;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomnumbers = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1 + randomnumbers.nextInt(6);

            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Fce\tFrequency");
        System.out.printf("1\t%d%n",frequency1);
        System.out.printf("2\t%d%n",frequency2);
        System.out.printf("3\t%d%n",frequency3);
        System.out.printf("4\t%d%n",frequency4);
        System.out.printf("5\t%d%n",frequency5);
        System.out.printf("6\t%d%n",frequency6);
    }
}
