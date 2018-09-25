import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("A Little Life", "Hanya Yanagihara", "Literary Fiction");
    }

    @Test
    public void canCountNumberOfBooks() {
        assertEquals(0, library.countNumberOfBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countNumberOfBooks());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void cannotAddBookToLibraryNoCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countNumberOfBooks());
        library.addBook(book);
        assertEquals(5, library.countNumberOfBooks());
    }
}
