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
//  the same test as below, but this may be better named.
//    @Test
//    public void libraryStartsEmpty() {
//        assertEquals(0, library.countNumberOfBooks());
//    }

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

//    add a test to show whether or not library is full
    @Test
    public void isFull() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.isFull());
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
