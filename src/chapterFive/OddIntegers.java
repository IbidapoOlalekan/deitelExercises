package chapterFive;

public class OddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 0; i < 16; i++){
            if (i % 2 != 0){

                display(i);
                product*=i;
            }
        }
        display(product);


    }

    public static void display(String message){
        System.out.println(message);
    }
    public static void display(int message){
        System.out.println(message);
    }
}
