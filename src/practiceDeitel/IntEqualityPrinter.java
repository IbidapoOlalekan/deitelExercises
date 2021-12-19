package practiceDeitel;

public class IntEqualityPrinter {
    public  static void printEqual(int firstNum, int secondNum, int thirdNum){
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0){
            System.out.println("Invalid Value");
        }
        else {
            if (firstNum == thirdNum && secondNum == thirdNum){
                System.out.println("All numbers are equal");
            }

            else if (firstNum!=thirdNum && secondNum!= thirdNum && firstNum!= secondNum){
                System.out.println("All Numbers Are Different");
            }
            else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
