package chapterTwo;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfSpecTest {
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception{
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(),()-> "BookShelf should be empty");
    }

}