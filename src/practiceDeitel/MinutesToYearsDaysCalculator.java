package practiceDeitel;

public class MinutesToYearsDaysCalculator {
   private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else {
            long years = minutes / 525600;
            long remainingMinutes = (minutes - (years *525600));
            long daysRemaining = remainingMinutes / 1440;



            System.out.println(minutes + " min =" + years + " y and " + daysRemaining + " d");
        }
    }
}
