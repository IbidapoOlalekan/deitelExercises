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

        //todo strringbuilder length, setLength, capacity and ensureCapacity
        StringBuilder buffer = new StringBuilder("Hello how are you");
        System.out.printf("buffer = %s%n length = %d%n capacity = %d%n%n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());

        //todo stringbuilder methods charAt
        StringBuilder buff = new StringBuilder("hello there");

        System.out.printf("buffer = %s%n", buff.toString());
        System.out.printf("Character at 0: %s%n", buff.charAt(0));
        System.out.printf("Character at 4: %s%n", buff.charAt(4));

        char[] charArray = new char[buff.length()];
        buff.getChars(0,buff.length(),charArray,0);
        System.out.print("The characters are: ");
        for (char character: charArray){
            System.out.print(character);
        }

        buff.setCharAt(0,'H');
        buff.setCharAt(6,'T');
        System.out.printf("n%n buffer = %s", buff.toString());

        buff.reverse();
        System.out.printf("%n%nbuffer = %s%n", buff.toString());
    }



}
