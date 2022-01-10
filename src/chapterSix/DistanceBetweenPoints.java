package chapterSix;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       print("Enter the coordinates: ");
       double coordinateOne = scan.nextDouble();
       print("Enter the coordinates: ");
       double coordinateTwo = scan.nextDouble();

      double distance =  distance(coordinateOne,coordinateTwo);

      print("The distance between the two coordinates is " + distance);

    }

    public static double distance(double pointOne, double pointTwo){
        double distance  = pointTwo - pointOne;
        return distance;
    }

    public static void print(String message){
        System.out.println(message);
    }
    public static void print(double message){
        System.out.println(message);
    }
}
