package chapterFourteen;

import java.util.Scanner;

public class DateFormat {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String date = input("Enter the date");

        System.out.println(convertToFormat(date));
    }

    private static String convertToFormat(String date) {
        String[] months ={"","January","February","March","April","May","June",
        "July","August","September","October","November","December"};

        String[]datesToken = date.split("/");
        return String.format("%s %s %s",months[Integer.parseInt(datesToken[0])],datesToken[1],datesToken[2]);
    }

    private static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

}
