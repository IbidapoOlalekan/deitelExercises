package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalReceipts = 0.0;
        double fee;
        int hours;

        System.out.println("Enter the number of hours or -1 to quit: ");
        hours = scan.nextInt();

        do {
            fee = calculateCharges(hours);
            totalReceipts +=fee;
            System.out.printf("Current charge : $ %.2f, Total Receipts: $ %.2f\n", fee,totalReceipts);
            System.out.println("Enter the number of hours or -1 to quit: ");
            hours = scan.nextInt();
        }
        while (hours != -1);
    }

    public static double calculateCharges(int hours){
      int minPark = 2;
      int maxPark  =10;
      int maxHours = 24;
      int minHours = 3;
      double hourExtra = 0.5;

      double fee;
      fee = minPark;

      if (hours <= minHours){
          fee = minPark;
      }
      if (hours > minHours && hours < maxHours) {
          fee = hourExtra * (hours - minHours) + minPark;
      }
          if (hours == maxHours){
              fee = maxPark;
          }
        return fee;
    }
}
