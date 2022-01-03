package practiceDeitel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person = new Person();
    @Test
    public void firstNameCanBeSet(){
        String firstName = "Lekan";
         person.setFirstName(firstName);
        assertEquals("Lekan", person.getFirstName());
    }
    @Test
    public void lastNameCanBeSet(){
        String lastName = "Ibidapo";
        person.setLastName(lastName);
        assertEquals("Ibidapo",person.getLastName());
    }
    @Test
    public void ageCanBeSet(){
        int age = 10;
        person.setAge(age);
        assertEquals(age,person.getAge());
    }
    @Test
    public void ageCannotBeSetToNegative(){
        int age= -10;
        person.setAge(age);
        assertEquals(0,person.getAge());
    }
    @Test
    public void personAgeCannotBeGreaterThanHundred(){
        int age = 101;
        person.setAge(age);
        assertEquals(0,person.getAge());
    }
    @Test
    public void personCanBeATeen(){
        int age = 18;
        person.setAge(18);
        assertEquals(age,person.getAge());
        Boolean isTeen = person.isTeen();
        assertTrue(isTeen);
    }
    @Test
    public void fullNameCanBePrinted(){
        String firstName = "Lekan";
        person.setFirstName(firstName);
        assertEquals("Lekan", person.getFirstName());
        String lastName = "Ibidapo";
        person.setLastName(lastName);
        assertEquals("Ibidapo",person.getLastName());

       String fullName =  person.getFullName();
        assertEquals("Lekan Ibidapo", fullName);
    }
    @Test
    public void firstNameIsEmpty(){
        String firstName = "";
        person.setFirstName(firstName);
        assertEquals("",person.getFirstName());
        String lastName = "Ibidapo";
        person.setLastName(lastName);
        assertEquals("Ibidapo",person.getLastName());
        String fullName = person.getFullName();
        assertEquals(lastName,fullName);
    }
    @Test
    public void lastNameIsEmpty(){
        String firstName = "Lekan";
        person.setFirstName(firstName);
        assertEquals("Lekan",person.getFirstName());
        String lastName = "";
        person.setLastName(lastName);
        assertEquals("",person.getLastName());
        String fullName = person.getFullName();
        assertEquals(firstName,fullName);
    }
    @Test
    public void bothLastNameAndFirstNameIsEmpty(){
        String firstName = "";
        person.setFirstName(firstName);
        assertEquals("",person.getFirstName());
        String lastName = "";
        person.setLastName(lastName);
        assertEquals("",person.getLastName());
        String fullName = person.getFullName();
        assertEquals("",fullName);
    }


}
