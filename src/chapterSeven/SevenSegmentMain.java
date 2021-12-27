package chapterSeven;

import java.util.Scanner;

public class SevenSegmentMain {
    public static void main(String[] args) {
        System.out.println("Enter binary Digits Only: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        SevenSegmentDisplay segmentDisplay = new SevenSegmentDisplay();
        segmentDisplay.setSevenSegments(userInput);
        segmentDisplay.display();
    }
}
