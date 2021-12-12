package practiceDeitel;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {

        display("What Month?");
        month();
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static void month(){
        Scanner scan = new Scanner(System.in);
        String month = scan.next();

        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> System.out.println("It have 31 days");
            case "February" -> System.out.println("It have 28 days");
            case "April", "June", "September", "November" -> System.out.println("It have 30 days");
        }
    }
}
