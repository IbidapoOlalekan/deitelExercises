package chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        double weightInKilograms = input("Enter the user weight in Kilograms: ");

        try {
            validate(weightInKilograms);
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
        }
        double heightInMeters = input("Enter the user height in meters");
        if (validate(heightInMeters));

        double BMI = weightInKilograms / (heightInMeters * heightInMeters);

        boolean bmiIsUnderWeight = BMI < 18.5;
        boolean bmiIsNormal = BMI >= 18.5 & BMI <=24.9;
        boolean bmiIsOverWeight = BMI >= 25 & BMI <= 29.9;
        if (bmiIsUnderWeight){
            display("Underweight");
        }
        else if(bmiIsNormal){
           display("Normal!!!!!");
        }
        else if(bmiIsOverWeight){
            display("Overweight!!!!!");
        }
        else{
            display("Obese!!!!!!!!");
        }
    }

    private static boolean validate(double weightInKilograms) {
        if (weightInKilograms > 0){
            return true;
        }
        else {

            throw new IllegalArgumentException("Weight Cannot Be Negative");

        }

    }

    public static double input(String message){
        System.out.println(message);
        return scan.nextDouble();
    }


    public static String display(String message){
        System.out.println(message);
        return message;
    }

}
