package chapterSeven;

public class MultidimensionalArray {
    public static void main(String[] args) {
        String[][]array = {{" Name "," Address "," \t\tSex "},{" Bayo "," 10,Ajibode Street "," Male "}};
        displayArray(array);

    }
    public static void displayArray(String[][] array){
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println(" ");

        }
    }
}
