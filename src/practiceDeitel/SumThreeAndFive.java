package practiceDeitel;

public class SumThreeAndFive {
    public static void main(String[] args) {
        int number;
        int count = 1;
        int total = 0;
        for (int i =1 ; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("The numbers are" + i);
                total += i;
                count++;
                if (count == 5){
                    break;
                }
            }
          //  System.out.println("The numbers are " + i);
        }
        System.out.println("The total is " + total);

    }
}
