package chapterFive;

public class CompoundInterest {
    public static void main(String[] args) {
        double amount = 0;
        double principal = 1000.0;
        double rate;

        System.out.printf("%s %n", "Year", "Amount on deposit");
        int count = 0;
        for (rate = 0.05; count <= 5  ; rate+=0.01 ){
            System.out.printf("At Interest Rate Of %.2f\n",  rate);
            count++;
            for (int year = 1; year <= 10; ++year) {
//
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);


            }
        }


    }
}
