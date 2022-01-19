package chapterTwo;


import java.util.Scanner;

public class WorldPopulationCalculator {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double currentPopulation;
        double futurePopulation;
        double growthRate;
        double annualPopulationIncrease;

        currentPopulation = input("Enter the current population of the world: ");

        growthRate = input("Enter the Current growth rate: ");
;
        annualPopulationIncrease = (growthRate / 100) * currentPopulation;
        futurePopulation = annualPopulationIncrease + currentPopulation;

        System.out.println();

        for (int i = 1; i < 6; i++){
            System.out.println("Estimated Population after " + i + " years  is" + (futurePopulation * i));
        }
    }

    public static double input(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }




}
