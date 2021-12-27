package chapterSeven;

public class SumArray {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int total =  0;
        int average = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i ++){
            total+=array[i];
            average = total / array.length;
            if (max < array[i]){
                max  = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }


        System.out.println("The total of the array is " + total);
        System.out.println("The average of the array is " + average);
        System.out.println("The maximum is " + max);
        System.out.println("The minimum is " + min);
    }
}
