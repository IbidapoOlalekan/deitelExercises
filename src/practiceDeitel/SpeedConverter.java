package practiceDeitel;

public class SpeedConverter {
   public static long toMilesPerHour(double kilometerPerHour){
        if (kilometerPerHour < 0) return -1;
       return Math.round(kilometerPerHour/1.609);

   }

   public static String printConversion(double kilometerPerHour){
       if (kilometerPerHour < 0) return  "Invalid Value";
       else {
           long milesPerHour = toMilesPerHour(kilometerPerHour);
           return  kilometerPerHour + " Km/h = " + milesPerHour + " mi/h ";
       }

   }

   public static void display(String message){
       System.out.println(message);
   }

}
