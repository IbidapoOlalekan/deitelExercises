package chapterSeven;

import java.net.PortUnreachableException;

public class ArrayAssignment {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5};
       int min =  getMinimumOf(number);
        System.out.println(min);
    }

    public static int getMinimumOf(int[] number){
        int total = 0;
        int diffrence = 0;
        for (int i = 0 ; i < number.length; i++){

           total += number[i];
            for (int j = 1; j < i; j++){
                diffrence =  total - number[j];
                System.out.print(diffrence + " ");
            }
        }

        return diffrence;
    }


}
