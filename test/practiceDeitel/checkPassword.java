package practiceDeitel;

import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        System.out.print("What is the password? ");
        Scanner keyboard = new Scanner(System.in);
        String password= keyboard.nextLine();

        System.out.println("You typed >>>>>" + password + "<<<<<");
        System.out.println("");

        if (password.equals("SwordFish")){
            System.out.println("The word you typed is stored ");
            System.out.println("in the same place as the real");
            System.out.println("Password.You must be a ");
            System.out.println("hACkeR");
        }
        else {
            System.out.println("The word you typed is not stored");
            System.out.println("In the same place");
            System.out.println("as the real password, but that is ");
            System.out.println("not a big problem");
        }
        System.out.println("");

        if (password.equals("Swordfish")){
            System.out.println("The password is correct!!!!");
            System.out.println("You can use our system");
        }
        else {
            System.out.println("The password is incorrect!!!!!");
            System.out.println("Access Denied!!!!!!!!!");
        }

        keyboard.close();
    }
}
