package chapterTwo;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {

    private final List<Book> books = new ArrayList<>();
    public List<Book> books(){
        return Collections.unmodifiableList(books);
    }

    public void add(Book... booksToAdd) {
        Arrays.stream(booksToAdd).forEach(books::add);
    }

    public List<Book> arrange() {
//       books.sort(Comparator.naturalOrder());
      // return books.stream().sorted().collect(Collectors.toList());
        return arrange(Comparator.naturalOrder());
    }

    public List<Book> arrange(Comparator<Book> criteria){
        return books.stream().sorted(criteria).collect(Collectors.toList());
    }
}
