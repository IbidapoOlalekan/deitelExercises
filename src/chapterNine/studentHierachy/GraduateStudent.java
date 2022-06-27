package chapterNine.studentHierachy;

public class GraduateStudent extends Student{
    boolean isGraduated;
    public GraduateStudent(String lastName, String firstName) {
        super(lastName, firstName);
        isGraduated = true;
    }
}
