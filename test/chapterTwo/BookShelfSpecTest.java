package chapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("A bookshelf")

    class BookShelfSpec{
       private BookShelf shelf;
       private Book effectiveJava;
       private Book codeComplete;
       private Book mythicalMonth;
        @BeforeEach
        void init() throws Exception {
            shelf = new BookShelf();
            effectiveJava = new Book("Effective Java","Joshua Bloch", LocalDate.of(2008, Month.MAY, 8));
            codeComplete = new Book("Code Complete","Steve McConnel",LocalDate.of(2004,Month.JUNE,9));
            mythicalMonth = new Book("The Mythical Man-Month","Frederick Phillips Brook",LocalDate.of(1975,Month.JANUARY,1));
        }

        @Test
        @DisplayName("is empty when no book is added to it")
         void shelf_Empty_When_No_Book_Added(){
            List<String> books = shelf.books();
            assertTrue(books.isEmpty(),()-> "BookShelf should be empty");

        }


        @Test
        @DisplayName("Add two books and the count is two")
        void shelfToStringShouldPrintBookCountAndTitles()throws Exception {

            shelf.add("The Phoenix Project");
            shelf.add("Java 8 In Action");
            List<String> books = shelf.books();
            try {
                books.add("The Mythical Man-Month");
                fail(()-> "Should not be able to add book to books");
            } catch (Exception e) {
                assertTrue(e instanceof UnsupportedOperationException, ()-> "Should " +
                        "throw UnsupportedOperationException");
            }
          // assertEquals(2,books.size(),()-> "BookShelf should have two books");
//            assertAll(() -> assertTrue(shelfStr.contains("The Phoenix Project"),"1st Book Missing"),()-> assertTrue(shelfStr.contains("Java 8 in Action"),"2nd book title missing"),
//                    () -> assertTrue(shelfStr.contains("2 books found"),"Book count missing"));
        }

        @Test
        void bookShelf_Arranged_By_BookTitle(){
            shelf.add("Effective Java","Code Complete","The mythical Man-Month");
            shelf.arrange();
            List<String> books = shelf.books();
            assertEquals(Arrays.asList("Effective Java","Code Complete","The mythical Man-Month"),books,()->"Books in a bookshelf are in insertion order");
        }

        void thisTestShouldFail(){
            fail(() -> "This should fail");
        }
    }


