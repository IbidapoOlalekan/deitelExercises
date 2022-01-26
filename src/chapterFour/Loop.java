package chapterFour;

public class Loop {
    public static void main(String[] args) {
            int number = 0;
            int numbers = 0;
        System.out.print("The even Numbers:" );
        calculateEven(number);
        System.out.println();
        System.out.print("The Odd Numbers:" );
        calculate0dd(numbers);


    }

    private static void calculate0dd(int numbers) {
        while (numbers <= 99){
           numbers=   numbers+ 1;
            if (numbers % 2 != 0){
                System.out.print(numbers + " ");
       }


   }
    }

    private static void calculateEven(int number) {
        while (number <= 99){
          number=   number+ 1;
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}