package practiceDeitel;

import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter initial velocity: ");
        double initialVelocity = scan.nextDouble();

        System.out.println("Enter the final velocity: ");
        double finalVelocity = scan.nextDouble();

        System.out.println("Enter the time: ");
        double time = scan.nextDouble();

        double velocity = (finalVelocity - initialVelocity ) / time;

        System.out.println("The final velocity is "  + velocity);
    }
}
