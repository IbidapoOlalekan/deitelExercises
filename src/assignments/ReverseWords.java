package assignments;

public class ReverseWords {
    public static void main(String[] args) {
        String word  = "BALLOON";
        reverseWord(word);

    }

    private static void reverseWord(String word) {
        for (int count = word.length() - 1; count >= 0; count--){
            System.out.printf("%c",word.charAt(count));
        }
    }
}
;
