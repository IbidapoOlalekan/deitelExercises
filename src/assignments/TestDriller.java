package assignments;
//Get the number of copies a user want to buy
//if the copies is in the range of one to four copies it would be #2000 per copy
//If the copies is in the range of five to nine copies the price should be #1800 per copy
//If the copies is in the range of ten to twenty-nine copies the price is going to be #1600 per copy
//If the copies is in the range of thirty to forty-nine the price is going to be #1500 per copy
//If the copies is in the range of fifty to ninety-nine the price is going to be #1300 per copy
////If the copies is in the range of one hundred to one hundred and ninety-nine the price is going to be #1200 per copy
//If the copies is in the range of two hundred to four hundred and ninety-nine the price is going to be #1100 per copy
//If the copies is more than 500 the price is going to be #1000 per copy
//Calculate the amount to be paid by the user i.e.  quantity * price per copy
import java.util.Scanner;

public class TestDriller {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of copies: ");
        int quantity = scan.nextInt();

        if(quantity >= 1 && quantity <= 4){
                System.out.printf("The reseller would pay #%d", quantity * 2000);
            }

        if(quantity >= 5 &&  quantity <= 9){
            System.out.printf("The reseller would pay #%d",quantity * 1800);
        }
        if(quantity >= 10 && quantity <= 29){
                System.out.printf("The reseller would pay #%d",quantity * 1600);

        }
        if(quantity >= 30 && quantity <= 49){
                System.out.printf("The reseller would pay #%d",quantity * 1500);

        }
        if(quantity >= 50 && quantity <= 99){
                System.out.printf("The reseller would pay #%d", quantity * 1300);

        }
        if(quantity >= 100 && quantity <= 199){
                System.out.printf("The reseller would pay #%d",quantity * 1200);

        }
        if(quantity >= 200 && quantity <= 499){
                System.out.printf("The reseller would pay #%d",quantity * 1100);

        }
        if(quantity >= 500){


            System.out.printf("The reseller would pay #%d", quantity * 1000);

        }
    }
}
