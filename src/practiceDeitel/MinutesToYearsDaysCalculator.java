package practiceDeitel;

public class MinutesToYearsDaysCalculator {
   private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String printYearsAndDays(long minutes){
        if (minutes < 0){
            return   INVALID_VALUE_MESSAGE;
        }
        else {
            long years = minutes / 525600;
            long remainingMinutes = (minutes - (years *525600));
            long daysRemaining = remainingMinutes / 1440;



            return  minutes + " min =" + years + " y and " + daysRemaining + " d";
        }
    }
}
