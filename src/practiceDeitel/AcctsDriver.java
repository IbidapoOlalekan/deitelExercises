package practiceDeitel;

public class AcctsDriver {
    public static void main(String[] args) {
        Accts myAccount = new Accts();

        myAccount.setName("Bayo");
        myAccount.setName("Ibidapo Abdula");
        myAccount.setDay(21);
        myAccount.setMonth(8);
        myAccount.setYear(2001);
        System.out.printf("The account name is %s%n",myAccount.getName());
        System.out.printf("%s balance: %.2f%n",myAccount.getName(),myAccount.getBalance());
        myAccount.deposit(50000);
        //System.out.printf("Adding %.2f to the balance",myAccount.deposit(50000));
        System.out.printf("%s balance: %.2f%n",myAccount.getName(),myAccount.getBalance());
        myAccount.withdrawal(40000);
        System.out.printf("%s balance: %.2f%n",myAccount.getName(),myAccount.getBalance());
        System.out.print(myAccount.getName() + " date of birth: ");
       myAccount.displayDateOfBirth();
    }
}
