package chapterThree;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(23,50,1);
        clock.displayTime();
        System.out.println();

        try {
            clock = new Clock(23,50,89);
            clock.displayTime();
            System.out.println();
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n ", e.getMessage());
        }
    }
}
