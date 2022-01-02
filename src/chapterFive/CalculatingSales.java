package chapterFive;

import java.util.Scanner;

public class CalculatingSales {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double retailPrice = 0;
        double sum = 0;
        int userInput;
        int quantity;
        String product = """
                1. Product 1 : $2.98
                2. Product 2: $4.50
                3. Product 3: $9.98
                4. Product 4: $4.49
                5. Product 5: $6.87
                """;
        System.out.println(product);
        do {
            System.out.println("Enter the Product Number: ");
            userInput = scanner.nextInt();
            System.out.println();
            System.out.println("Enter the quantity Sold: ");
            quantity = scanner.nextInt();
            switch (userInput) {
                case 1 -> {
                    retailPrice = (quantity * 2.98);
                    System.out.println("Retail Price Of Product One is " + retailPrice);
                }
                case 2 -> {
                    retailPrice = quantity * 4.50;
                    System.out.println("The retail price of Product Two Is " + retailPrice);
                }
                case 3 -> {
                    retailPrice = quantity * 9.98;
                    System.out.println("The retail price of Product Three Is " + retailPrice);
                }
                case 4 -> {
                    retailPrice = quantity * 4.49;
                    System.out.println("The retail price of Product Four Is " + retailPrice);
                }
                case 5 -> {
                    retailPrice = quantity * 6.87;
                    System.out.println("The retail price of Product Five is " + retailPrice);
                }
            }

        }
        while (userInput != -1 || quantity != -1);
        sum+= retailPrice;
        System.out.println("The total retail Price is " + sum);

    }
}
