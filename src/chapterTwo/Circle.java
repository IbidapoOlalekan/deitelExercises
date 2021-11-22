package chapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scan.nextInt();
        System.out.printf("The diameter is %d%n",2 * radius);
        System.out.printf("The circumference of the circle is %.2f%n", 2*Math.PI * radius);
        System.out.printf("The area of the circle is %.2f", Math.PI *(radius * radius));

    }
}
