package practiceDeitel.animal;

public class Animal {
    private int age;
    private String gender;
    private boolean isMammal;

    public boolean isMammal() {
       isMammal = true;
       return isMammal;
    }

    public void isMate(){
        System.out.println("Im mating");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
