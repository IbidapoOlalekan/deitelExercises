package practiceDeitel;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the year of birth: ");

        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scan.nextInt();

            scan.nextLine();
            System.out.println("Enter the user name: ");
            String userName = scan.nextLine();

            int age  = 2021  - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + userName + " and you are " + age +" years old.");
            }
            else {
                System.out.println("Invalid year of birth");
            }
        }
        else {
            System.out.println("Unable to parse year of birth. ");
        }


        scan.close();

    }
}
