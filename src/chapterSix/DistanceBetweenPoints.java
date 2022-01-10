package chapterSix;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       print("Enter the X coordinates: ");
       double xOne = scan.nextDouble();
       print("Enter the X coordinates: ");
       double xTwo = scan.nextDouble();
       print("Enter the Y coordinates: ");
       double yOne = scan.nextDouble();
       print("Enter the Y Coordinates: ");
       double yTwo = scan.nextDouble();

      double distance =  distance(xOne,yOne,xTwo,yTwo);
      print("The distance between the two coordinates is " + distance);

    }

    public static double distance(double xOne, double yOne, double xTwo, double yTwo ){
         return  Math.sqrt(Math.pow((xTwo - xOne),2) + Math.pow((yTwo - yOne),2)) ;


    }

    public static void print(String message){
        System.out.println(message);
    }
    public static void print(double message){
        System.out.println(message);
    }
}
