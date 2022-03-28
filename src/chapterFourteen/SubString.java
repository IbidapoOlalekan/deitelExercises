package chapterFourteen;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("Substring from index 20 to the end is \"%s\" %n", letters.substring(20));
        System.out.printf("Substring from index three to seven is  \"%s\"%n ",letters.substring(3,8));

        //todo concatenating String

        String s1 = "Happy";
        String s2 = "Birthday";

        System.out.printf("The result of concatenating s1 and s2 is %s  ", s1.concat(s2));
    }

}
