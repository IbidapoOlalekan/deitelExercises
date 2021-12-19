package practiceDeitel;

import java.util.Locale;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        char var = 'C';
        switch (var) {
            case 'A' -> System.out.println("A is Found");
            case 'B', 'C', 'D', 'E' -> System.out.println("Any Of these is found");
            default -> System.out.println("Not found!!");
        }
        String month = "JaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("JAN");
                break;
            case "august":
                System.out.println("AUG");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
