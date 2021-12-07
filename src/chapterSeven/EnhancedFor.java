package chapterSeven;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i <numbers.length;i++){
            numbers[i] = i * 2;
        }

        for (int item: numbers){
            System.out.print(item + " ");
        }
    }
}
