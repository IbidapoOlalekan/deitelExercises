package chapterTwo;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("A bookshelf")

    class BookShelfSpec{
       private BookShelf shelf;
       private Book effectiveJava;
       private Book codeComplete;
       private Book mythicalMonth;
       private Book cleanCode;
        @BeforeEach
        void init() throws Exception {
            shelf = new BookShelf();
            effectiveJava = new Book("Effective Java","Joshua Bloch", LocalDate.of(2008, Month.MAY, 8));
            codeComplete = new Book("Code Complete","Steve McConnel",LocalDate.of(2004,Month.JUNE,9));
            mythicalMonth = new Book("The Mythical Man-Month","Frederick Phillips Brook",LocalDate.of(1975,Month.JANUARY,1));
            cleanCode = new Book("Clean Code","Robert C. Martin",LocalDate.of(2007,Month.JANUARY,4));
        }

        @Test
        @DisplayName("is empty when no book is added to it")
         void shelf_Empty_When_No_Book_Added(){
            List<Book> books = shelf.books();
            assertTrue(books.isEmpty(),()-> "BookShelf should be empty");

        }

        @Test
        public void bookShelfContainsTwoBooksWhenTwoBooksAdded() {
            shelf.add(effectiveJava,codeComplete);
            List<Book> books = shelf.books();
            assertEquals(2,books.size(),() -> "Bookshelf should have two books");
        }
        @Test
        public void emptyBookShelfWhenAddIsCalledWithoutBooks(){
            shelf.books();
            List<Book> books = shelf.books();
            assertTrue(books.isEmpty(),()-> "Bookshelf should be empty. ");
        }

        @Test
        @DisplayName("Add two books and is immutable for client")
        void booksReturnedFromBooksShelfIsImmutableForClient()throws Exception {

            shelf.add(effectiveJava, codeComplete);
            List<Book> books = shelf.books();
            try {
                books.add(mythicalMonth);
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
        @DisplayName("Can Be Arranged By Book title")
        void bookShelf_Arranged_By_BookTitle(){
            shelf.add(effectiveJava,codeComplete,mythicalMonth);
            List<Book> books = shelf.arrange();
            assertEquals(asList(codeComplete, effectiveJava, mythicalMonth),books,()->"Books in a bookshelf should be arranged lexicographically by book title");
        }

        @Test
        @DisplayName("books are in insertion order after calling arrange")
        void booksInBookShelfAreInInsertionOrderAfterCallingArrange(){
            shelf.add(effectiveJava,codeComplete,mythicalMonth);
            shelf.arrange();
            List<Book> books = shelf.books();
            assertEquals(asList(effectiveJava, codeComplete, mythicalMonth),books,()->"Books in a bookshelf are in insertion order");
        }

        @Test
        @DisplayName ("Can Be Arranged By User Provided Criteria")
        void bookShelfArrangedByUserProvidedCriteria(){
            shelf.add(effectiveJava,codeComplete,mythicalMonth);
            List<Book> books = shelf.arrange(Comparator.<Book>naturalOrder().reversed());
            assertEquals(asList(mythicalMonth, effectiveJava, codeComplete),books,()-> "Books in a bookshelf are arranged in descending order of book title");
        }

        @Test
        @DisplayName("Can be arranged by publication date ")
        void booksShelfCanBeArrangedByPublicationDate(){
            shelf.add(effectiveJava,codeComplete,mythicalMonth);

        }
        @Test
        @DisplayName("books inside bookshelf are grouped by publication year")
        void groupBooksInsideBookshelfByPublicationYear(){
            shelf.add(effectiveJava,codeComplete,mythicalMonth,cleanCode);

            //Map<Year, List<Book>> booksByPublicationDate = shelf.groupByPublicationYear();

            //assertThat(booksByPublicationYear)
        }
        void thisTestShouldFail(){
            fail(() -> "This should fail");
        }
    }


