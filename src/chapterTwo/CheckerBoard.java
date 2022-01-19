package chapterTwo;

public class CheckerBoard {
    public static void main(String[] args) {
        display("* * * * * * * *");
        display(" * * * * * * * *");
        display("* * * * * * * *");
        display(" * * * * * * * *");
        display("* * * * * * * *");
        display(" * * * * * * * *");
        display("* * * * * * * *");
        display(" * * * * * * * *");
    }

    public static String  display(String message){
        System.out.println(message);
        return message;
    }

}
