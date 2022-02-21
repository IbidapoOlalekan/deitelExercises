package chapterEight;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double interest =  (getSavingsBalance() * annualInterestRate)/12;
        return interest + savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double interest){
        annualInterestRate = interest;
    }

    public static void main(String[] args) {
        SavingsAccount save1 = new SavingsAccount(2000);
        SavingsAccount save2 = new SavingsAccount(3000);
        modifyInterestRate(0.04);
        save1.calculateMonthlyInterest();
        save2.calculateMonthlyInterest();
        System.out.printf("saver two new balance is %.2f\n",save2.calculateMonthlyInterest());
        System.out.printf("saver one new balance is %.2f\n",save1.calculateMonthlyInterest());
        modifyInterestRate(0.05);
        save1.calculateMonthlyInterest();
        save2.calculateMonthlyInterest();
        System.out.printf("saver two new balance is %.2f\n",save2.calculateMonthlyInterest());
        System.out.printf("saver one new balance is %.2f\n",save1.calculateMonthlyInterest());
    }




}
