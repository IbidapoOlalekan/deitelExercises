package practiceDeitel;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the radius of the Cylinder: ");
        double radius = scan.nextDouble();
        System.out.println("Enter the length of the Cylinder: ");
        double length = scan.nextDouble();
        double area = radius * radius  * Math.PI;
        double volume = area * length;
        System.out.print("The area is " + area);
        System.out.printf("The area is %.3f\n",area);
        System.out.printf("The volume is %.3f",volume);
    }
}
