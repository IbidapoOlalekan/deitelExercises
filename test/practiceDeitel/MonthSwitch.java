package practiceDeitel;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        display("What Month?");
        String month = scan.next();

        switch (month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("It have 31 days");
                break;
            case "February":
                System.out.println("It have 28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November" :
                System.out.println("It have 30 days");
                break;
        }
    }

    public static void display(String message){
        System.out.println(message);
    }
}
