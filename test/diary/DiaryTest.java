package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUp() {
        myDiary = new Diary("Jaci","ilovejesus222");
    }

    @Test
    public void diaryCanBeCreatedTest() {
    assertNotNull(myDiary);
    assertEquals("Jaci",myDiary.getOwnerName());
    }

    @Test
    public void diaryPasswordCanBeUpdatedTest() {
        myDiary.setPassword("iLoveOtuns112");
        assertEquals("iLoveOtuns112",myDiary.getPassword());
    }

    @Test
    public void diaryCanAddGistTest() {
        myDiary.addNewGist("My True Love", "My true lover name is....","ilovejesus222");
        assertEquals(1,myDiary.getGists().size());
    }

    @Test
    public void viewGistByTitle() {
        myDiary.addNewGist("My True Love", "My True lover name is....","ilovejesus222");
        myDiary.addNewGist("My Fake Love", "My Fake lover name is....","ilovejesus222");
        myDiary.addNewGist("My Ex Love", "My Ex lover name is....","ilovejesus222");
        assertEquals(3,myDiary.getGists().size());

       Gist foundGist =  myDiary.findGistByTitle("My Ex Love");
       assertEquals("My Ex Love", foundGist.getTitle());
        assertEquals("My Ex lover name is....", foundGist.getGist());

    }
    @Test
    public void gistCanBeDeletedTest() {
        myDiary.addNewGist("My True Love","My true lover name is ....","ilovejesus222");
        myDiary.addNewGist("My Fake Love", "My Fake lover name is....","ilovejesus222");
        assertEquals(2,myDiary.getGists().size());
        myDiary.deleteGist("My True Love","ilovejesus222");
        assertEquals(1,myDiary.getGists().size());
    }

    @Test
    public void markAsFavoriteGistTest(){
        myDiary.addNewGist("My True Love","My true lover name is ....","ilovejesus222");
        myDiary.addNewGist("My Fake Love", "My Fake lover name is....","ilovejesus222");
        myDiary.addNewGist("My Ex Love", "My Ex lover name is....","ilovejesus222");
        assertEquals(3,myDiary.getGists().size());
        myDiary.favorite("My True Love");
        assertEquals(1,myDiary.getFavoriteGists().size());
    }



}