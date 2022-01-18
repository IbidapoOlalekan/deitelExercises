package chapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double populationOfTheWorld = 7.900000000;
        double growthRate = 1.8;
        int year = 1;
        double futurePopulation = 0;
        double increase = 0;
        System.out.printf("Year \t  World Population \t Increase\n");
        for (int i = 0; i < 75; i++){
            futurePopulation = populationOfTheWorld *Math.pow(1 + growthRate,year);
            year++;
           increase =  futurePopulation - populationOfTheWorld;

            System.out.printf("%d \t\t\t %8.2f \t\t\t \t%.2f\n", year, futurePopulation, increase);
        }

    }
}
