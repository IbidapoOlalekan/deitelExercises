package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        for (int n = 1; n < 6; n++ ){
            displayInOneLine(n + " ");
            displayInOneLine(n * 10 + " ");
            displayInOneLine(n * 100 + " ");
            displayInOneLine(n * 1000+ " ");
            display(" ");
            String a = "bull";
        }
    }

    public static String display(String message){
        System.out.println(message);
        return message;
    }

    public static String displayInOneLine(String message){
        System.out.print(message);
        return message;
    }
}
