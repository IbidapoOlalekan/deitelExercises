package practiceDeitel;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        int a = (int)numOne * 1000;
        int b = (int)numTwo * 1000;

        return a == b;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || ((inches < 0) && (inches > 12))){
            System.out.println("Invalid feet or inches Parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " +  centimeters + " cm");
        return centimeters;
}
}
