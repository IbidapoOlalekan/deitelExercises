package chapterFourteen;

public class Function {
    public static void main(String[] args) {
        String word = "ABLLOONO ";
        String wordToBeFound = "BALLOON";
       int count =  countOccurrences(word,wordToBeFound);
        System.out.println("The number of balloon is "  + count);
    }

    static int countOccurrences(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (String s : a) {
            if (word.equals(s))
                count++;
        }
        return count;
    }
}
