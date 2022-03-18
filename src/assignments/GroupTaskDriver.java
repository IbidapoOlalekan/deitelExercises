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
            display("Invalid");
        }

    }

    private static void calculatePriceOf() {
        String userInput;
        do {
            display("What do you want to buy");
            String productName = scanner.nextLine();

            if(productName == null || productName.equals("")){
                throw new IllegalArgumentException("invalid product name");
            }

            double amount = input("How much is it");

            throwError(amount,"Invalid Amount");

            int quantity = input("Total Quantity: ");

            throwError(quantity,"Invalid Quantity");

            double total = amount * quantity;

            GroupTask group = new GroupTask(productName, amount, quantity,total);
            catalogs.add(group);
            display("What Else????");
            scanner.nextLine();
             userInput = scanner.nextLine();
        }
        while(userInput.charAt(0)=='y');
    }



    public static void displayCatalog(){
        display("""
                        MALL MART!
                        10, Sabo, Yaba
                Product Name\tQuantity\tPrice\tTotal""");
        for (GroupTask catalog: catalogs) {
            display(catalog.toString());
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static int input(String message){
        display(message);
        return scanner.nextInt();
    }
    public static void throwError(double userInput, String message){
        if (userInput <= 0.0){
            throw new IllegalArgumentException(message);
        }
    }
    public static void throwError(int userInput, String message){
        if (userInput <= 0.0){
            throw new IllegalArgumentException(message);
        }
    }

}
