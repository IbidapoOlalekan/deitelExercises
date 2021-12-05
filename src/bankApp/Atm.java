package bankApp;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        displayInitialPrompt();
        Scanner scanner = new Scanner(System.in);
       int response =  0;
       MyAccount userAccount;

       do {
           displayInitialPrompt();
           response = scanner.nextInt();
           switch (response){
               case 1:
                   scanner.nextLine();
                   System.out.println("Shebi you wan create account?");
                   System.out.println("Oya give me ya name");
                   String name = scanner.nextLine();
                   System.out.println("Oya give me your needle");
                   String pin = scanner.nextLine();
                   userAccount = new MyAccount(name,pin);
                   System.out.println("\n\n\n We don create am!!!");
                   int newAccountPromptResponse;

                   //todo start prompt
                   do {
                       String newAccountPrompt = """
                               Press 1 to Deposit
                               Press 2 to Withdraw
                               Press 3 to Check Balance
                               Press 4 to Go Back
                               Press 5 if you don tire
                               """;
                       System.out.println(newAccountPrompt);
                       newAccountPromptResponse = scanner.nextInt();
                       switch (newAccountPromptResponse) {
                           case 1:
                               System.out.println("Oya how much you wan put for ya account");
                               int amount = scanner.nextInt();
                               userAccount.deposit(amount);
                               System.out.println("\n\n\n Oya we don put ya moni");
                               //todo implement deposit
                               break;
                           case 2:
                               System.out.println("Oya how much you wan collect from ya account");
                               int amountToWithdraw = scanner.nextInt();
                               scanner.nextLine();
                               System.out.println("Oya Enter the needle you set before");
                               String providePin = scanner.nextLine();

                               System.out.println("\n\n\n Oya we don collect ya moni");
                               //todo implement withdraw
                               break;
                           case 3:
                               //scanner.nextLine();
                               System.out.println("Oya wetin be your pin");
                               String checkBalancePin = scanner.nextLine();
                               System.out.println("Ya Account Balance " + userAccount.getBalance(checkBalancePin));
                               //todo implement check balance
                               break;
                           case 4:
                              
                               //todo implement go back
                               break;
                           case 5:
                               System.exit(0);
                       }

                   }
                   while (true);
                   //end point

               case 2:
                   System.exit(0);
               default:
           }
       }
       while (response != 1 && response != 2);
    }



    public static void displayInitialPrompt() {
        String prompt = """
                Welcome to Diamond (Access) confused bank LTD
                Wetin you wan do sef?
                Press 1 to create Account
                Press 2 to Exit
                """;
        System.out.println(prompt);
    }
}
