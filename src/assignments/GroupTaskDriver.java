package assignments;

import java.util.ArrayList;
import java.util.Scanner;


public class GroupTaskDriver {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<GroupTask> catalogs = new ArrayList<GroupTask>();

    public static void main(String[] args) {
        try {
            calculatePriceOf();
            displayCatalog();
        }catch (IllegalArgumentException e){
            System.out.println("Invalid");
        }




    }

    private static void calculatePriceOf() {
        String userInput;
        do {
            System.out.println("What do you want to buy");
            String productName = scanner.nextLine();

            if(productName == null || productName.equals("")){
                throw new IllegalArgumentException("invalid product name");
            }

            System.out.println("How much is it ");
            double amount = scanner.nextDouble();
            if(amount <= 0.0){
                throw new IllegalArgumentException("invalid amount");
            }
            System.out.println("Total Quantity: ");
            int quantity = scanner.nextInt();

            if(quantity <= 0){
                throw new IllegalArgumentException("invalid quantity");
            }
            double total = amount * quantity;

            GroupTask group = new GroupTask(productName, amount, quantity,total);
            catalogs.add(group);
            System.out.println("What Else????");
            scanner.nextLine();
             userInput = scanner.nextLine();
        }
        while(userInput.charAt(0)=='y');
    }

    public static void displayCatalog(){
        System.out.println("""
                        MALL MART!
                        10, Sabo, Yaba
                Product Name\tQuantity\tPrice\tTotal""");
        for (GroupTask catalog: catalogs) {
            System.out.println(catalog.toString());
        }
    }


}
