package chapterNine.studentHierachy;

public class Undergraduate extends Student{
        boolean isGraduated;
    public Undergraduate(String lastName, String firstName) {
        super(lastName, firstName);
        isGraduated = false;
    }


}
