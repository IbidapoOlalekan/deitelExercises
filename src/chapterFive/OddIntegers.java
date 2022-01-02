package chapterFive;

public class OddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 0; i < 16; i++){
            if (i % 2 != 0){

                System.out.println(i);
                product*=i;
            }
        }
        System.out.println(product);


    }
}
