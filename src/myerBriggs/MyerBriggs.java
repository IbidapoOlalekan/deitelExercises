package myerBriggs;

import java.util.Scanner;

public class MyerBriggs {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        questions();
    }

    public static void questions() {
        String[] questions = new String[20];
        questions[0] = """
                A expend energy, enjoy groups
                B conserve energy, enjoy one-on-one
                """;
        questions[1] = """
                A interpret literally
                B look for meaning and possibilities
                """;
        questions[2]= """
                A logical, thinking, questioning
                B empathetic, feeling, accommodating
                """;
        questions[3]= """
                A organized, orderly
                B flexible, adaptable
                """;
        questions[4]= """
                A more outgoing, think out loud
                B more reserved, think to yourself
                """;
        questions[5]= """
                A practical, realistic, experimental
                B imaginative, innovative, theoretical
                """;
        questions[6]= """
                A candid, straight forward, frank
                B tactful, kind, encouraging
                """;
        questions[7]= """
                A plan, schedule
                B unplanned, spontaneous
                """;
        questions[8]= """
                A seek many tasks,public activities, interaction with others
                B seek private, solitary activities with quiet to concentrate 
                """;
        questions[9]= """
                A standard, usual, conventional
                B different, novel, unique
                """;
        questions[10]= """
                A firm, tend to criticize, bold the line
                B gentle, tend to appreciate, concillate
                """;
        questions[11]= """
                A regulated structured
                B easygoing, "live" and "let live"
                """;
        questions[12]= """
                A external, communicative, express yourself
                B internal, reticent, keep it to yourself
                """;
        questions[13]= """
                A focus on here-and-now
                B look to the future, global perspective, "big picture"
                """;
        questions[14]= """
                A tough-minded,just
                B tender-hearted, merciful
                """;
        questions[15]= """
                A preparation, plan ahead
                B go with the flow, adapt as you go
                """;
        questions[16]= """
                A active, initiate
                B reflective, deliberate
                """;
        questions[17]= """
                A facts, things, "What is"
                B ideas, dreams, "What could be", philosophical
                """;
        questions[18]= """
                A matter of fact, issue - oriented
                B sensitive, people-oriented, compassionate
                """;
        questions[19]= """
                A control, govern
                B latitude, freedom
                """;
        loopQuestion(questions);
    }

    public static void loopQuestion(String[] questions){
        String[] response = new String[20];
        int count = 0;
        int i;
        for(i=1; i< response.length; i++){
            display(questions[i]);
            String userResponse = scanner.next();
            response[i] = userResponse.toUpperCase();
        }
        printUserResponse(response);
        checkTraitIfExtrovertedOrIntroverted(response);
        checkIfTraitIsSensitiveOrNotSensitive(response);
        checkIfTraitIsThinkerOrFeeler(response);
        checkIfTraitsIsJudgingOrPerceiving(response);
    }
    public static void display(String message){
        System.out.println(message);
    }

    public static void printUserResponse(String[] message){
        int count = 1;
        display("The responses are: ");

        for (int i = 1; i < message.length; i++){
            display(count++ + "." + message[i] + " ");
            if (count %  5 == 0) System.out.println();
        }
    }

    public static void checkTraitIfExtrovertedOrIntroverted(String[] userResponse){
       String valueA = "A";
       String valueB = "B";
       int frequencyOfValueA = 0;
       int frequencyOfValueB = 0;
        for (int i = 1; i < userResponse.length; i+=4){
            if (userResponse[i].equals(valueA)){
                frequencyOfValueA++;
            }
            else {
                frequencyOfValueB++;
            }
        }
        if (frequencyOfValueA > frequencyOfValueB){
            display("Extroverted");
        }
        else{
            display("Introverted");
        }
    }

    public static void checkIfTraitIsSensitiveOrNotSensitive(String[] userResponse){
        String valueA = "A";
        String valueB = "B";
        int frequencyOfValueA = 0;
        int frequencyOfValueB = 0;
        for (int i = 2; i < userResponse.length; i+= 4){
            if (userResponse[i].equals(valueA)){
                frequencyOfValueA++;
            }
            else {
                frequencyOfValueB++;
            }
        }
        if (frequencyOfValueA > frequencyOfValueB){
            display("Sensitive");
        }
        else {
           display("Not sensitive");
        }
    }

    public static void checkIfTraitIsThinkerOrFeeler(String[] userResponse){
        String valueA = "A";
        String valueB = "B";
        int frequencyOfValueA = 0;
        int frequencyOfValueB = 0;
        for (int i = 3; i < userResponse.length; i+=4){
            if (userResponse[i].equals(valueA)){
                frequencyOfValueA++;
            }
            else {
                frequencyOfValueB++;
            }
        }
        if (frequencyOfValueA > frequencyOfValueB){
            display("Thinkers");
        }
        else {
            display("Feeler");
        }
    }

    public static void checkIfTraitsIsJudgingOrPerceiving(String[] userResponse){
        String valueA = "A";
        String valueB = "B";
        int frequencyOfValueA = 0;
        int frequencyOfValueB = 0;
        for (int i = 4; i < userResponse.length; i+=4){
            if (userResponse[i].equals(valueA)){
                frequencyOfValueA++;
            }
            else {
                frequencyOfValueB++;
            }
        }
        if (frequencyOfValueA > frequencyOfValueB){
            display("Judging");
        }
        else {
            display("Perceiving");
        }
    }




}