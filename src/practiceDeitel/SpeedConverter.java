package practiceDeitel;

public class SpeedConverter {
   public static long toMilesPerHour(double kilometerPerHour){
        if (kilometerPerHour < 0) return -1;
       return Math.round(kilometerPerHour/1.609);

   }

   public static void printConversion(double kilometerPerHour){
       if (kilometerPerHour < 0)display("Invalid Value");
       else {
           long milesPerHour = toMilesPerHour(kilometerPerHour);
           display(kilometerPerHour + "Km/h = " + milesPerHour + "mi/h");
       }

   }

   public static void display(String message){
       System.out.println(message);
   }

   public static void display(long message){
       System.out.println(message);
   }
}
