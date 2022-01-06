package chapterSix;

import java.security.SecureRandom;
//import static java.lang.Math.*;
import java.util.Scanner;

public class CoinTossing {
    private static Scanner scanner = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();
    private enum  Side{HEAD, TAIL};

    public static void main(String[] args) {
        int userMenu;
        do {
            String menuOption = """
                1. Toss Coin
                2. Exit
                """;
            System.out.println(menuOption);
            userMenu = scanner.nextInt();
            switch (userMenu){
                case 1:

                    //todo
                    break;

                case 2:
                    System.out.println("Exit!!!!!");
                    System.exit(0);
            }
        }
        while (true);
    }

}
