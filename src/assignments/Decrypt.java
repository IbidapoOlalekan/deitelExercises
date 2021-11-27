package assignments;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Encrypted Data: ");
        int encrypted = scan.nextInt();

        int firstDigit = encrypted / 1000;
        int secondDigit = (encrypted % 1000)/100;
        int thirdDigit = (encrypted % 100)/10;
        int fourthDigit = (encrypted % 10)/1;

        if (firstDigit >= 7){
          firstDigit =   firstDigit - 7;
        }
        else {
            firstDigit =  (firstDigit + 10) - 7;
        }

        if (secondDigit >= 7){
            secondDigit = secondDigit - 7;
        }
        else {
            secondDigit = (secondDigit + 10) - 7;
        }

        if (thirdDigit >= 7){
            thirdDigit = thirdDigit - 7;
        }
        else {
            thirdDigit = (thirdDigit + 10) - 7;

        }

        if (fourthDigit >= 7){
            fourthDigit = fourthDigit - 7;

        }
        else {
            fourthDigit = (fourthDigit + 10) - 7;

        }

        System.out.printf("The decrypted data is %d%d%d%d",thirdDigit,fourthDigit,firstDigit,secondDigit);




    }
}
