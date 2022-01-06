package chapterEight;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After the time object is created", time);
        System.out.println();

        time.setTine(13,27,6);
        displayTime("After setting the time",time);
        System.out.println();

        try{
            time.setTine(99,99,99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime with invalid values",time);

    }
    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%n Standard Time: %s%n",
                header,t.toUniversalString(), t);
    }
}
