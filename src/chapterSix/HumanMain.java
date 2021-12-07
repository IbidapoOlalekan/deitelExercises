package chapterSix;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Helen Isu",Gender.SWIT);
//        human.setGender(Gender.FEMALE);

        String honey = human.toString();
        System.out.println(honey);

        Human humans = new Human("Judith",Gender.FEMALE);

       String hun =  humans.toString();
        System.out.println(hun);

    }

}
