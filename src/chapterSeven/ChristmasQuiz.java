package chapterSeven;

import java.security.SecureRandom;
import java.util.Scanner;

public class ChristmasQuiz {
    private static Scanner scan = new Scanner(System.in);
    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {

        System.out.println(selectRandomQuestion());
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

    }
    public static String[]  displayQuestions(){
        String[] userQuestion = new String[20];
        userQuestion[0] = """
                1. When is Christmas Celebrated?\s
                a.) December 25  //
                b.) December 20
                c.) December 15
                d.) December 26
                """;
        userQuestion[1] = """
                2. The traditional Christmas tree originated from which country?\s
                a.) Germany //
                b.) Iran
                c.) Jerusalem
                d.) Maldives
                """;
        userQuestion[2] = """
                3.) People buy Artificial Christmas trees more than real ones. True or false?\s
                a.) True //
                b.) False
                """;
        userQuestion[3]= """
                4.) Name the first US president who decorated the Christmas tree at the White House.
                a.) George Bush
                b.) Hilary Clinton
                c.) Franklin Pierce //
                d.) George Washington
                """;
        userQuestion[4]= """
                5.) When is Christmas celebrated in Russia?
                    a.) January 7  //
                    b.) December 25 
                    c.) December 26
                    d.) January 10
                """;
        userQuestion[5]= """
                6.) Which famous scientist was born on 25 December?
                a.)Sir Isaac Newton //
                b.) Albert Einstein
                c.) Hooke's
                d.) Calvin Henry
                """;
        userQuestion[6]= """
                7.)Which country celebrates its Independence day on Christmas Eve every year?
                a.) Nigeria
                b.) USA
                c.) United Kingdom
                d.) Libya //
                """;
        userQuestion[7]= """
                8.) How many packages are shipped every year?
                a.) 200 Million
                b.) 500 Million
                c.) 850 Million //
                d.) 10 Million
                """;
        userQuestion[8]= """
                9.)  When is midnight mass celebrated?
                a.) On Christmas Day
                b.) December 29
                c.) At midnight On Christmas Eve
                d.) December 10
                """;
        userQuestion[9]= """
                10.) Which country sends a huge Christmas tree to London, every year?
                a.) Belgium
                b.) Spain
                c.) Norway
                d.) Finland
                """;
        userQuestion[10]= """
                11.) What is placed at the top of the Christmas tree?
                a.) Devil
                b.) Human
                c.) Angel
                d.) Santa
             
                """;
        userQuestion[11]= """
                12.)  What is the duration between Christmas and Epiphany?
                a.) 12 Days
                b.) 20 days
                c.) 30 Days
                d.) 19 Days
                """;
        userQuestion[12]= """
                13.)  Which ornament is present on the tip of elves' shoes?
                a.) Rings
                b.) Doll
                c.) Bells
                d.) Ghost
                """;
        userQuestion[13]= """
                14.)  Who are the kings that visited baby Jesus?
                a.) Casper,Melchior and Balthazar
                b.) Jacintha, Judith And Dami
                c.) Bell, Boyce And Dell
                d.) Albert, Hooke And Jaden
                """;
        userQuestion[14]= """
                15.)  What is Christmas originally known as?
                a.) Yule
                b.) Xmas
                c.) Xrooll
                d.) Golden Egg
               """;
        userQuestion[15]= """
                16.) What does the red colour of Christmas Symbolize?
                a.) Blood
                b.) Blood of Jesus
                c.) Danger
                d.) Blood of Santa
                """;
        userQuestion[16]= """
                17.) What does the Green colour of Christmas Signify?
                a.) Continuity Of Life
                b.) Adaptation Of Life
                c.) Saviour Of Life
                d.) Plantation
                """;
        userQuestion[17]= """
                18.) What is the use of a tree skirt?
                a.) To buy gifts
                b.) To save money received On Christmas
                c.) Gifts are placed there
                d.) Gifts are sold there
                """;
        userQuestion[18]= """
                19.) What is Frankincense ?
                a.) A plant used for christmas tree
                b.) A tree 
                c.) A plant resin with healing properties
                d.) A special seasoning
                """;
        userQuestion[19]= """
                20.)Where was Jesus Born ?
                a.) Russia
                b.) Bethlehem
                c.) Jerusalem
                d.) Rome
                """;

       return userQuestion;
    }
    public static String[] answers(){
        String[] answers = {"a","a","a","c","a","a","d","c","c","c","c","a","c","a","b","a","c","c","c","b"};
        int n = 0;
        int correctAnswer = 0;
        int incorrectAnswer = 0;
        String answer = "";
        for (int i = 0; i < 20;i++){
            System.out.println("Please Enter Your Answer: ");
            answer = scan.nextLine();

            if (answer.compareTo(answers[0])==0){
                correctAnswer++;
            }
            else {
                incorrectAnswer++;
            }
        }
        System.out.println("You have " + correctAnswer + "correct Answers");
        return answers;
    }


    public static String selectRandomQuestion(){
    random = new SecureRandom();
    int rnd = 0;
    for (int i= 0; i < 6; i++){
        rnd =   random.nextInt(displayQuestions().length);
        return displayQuestions()[rnd];

    }

        return displayQuestions()[rnd];
    }


}
