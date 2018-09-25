import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("A Little Life", "Hanya Yanagihara", "Literary Fiction");
    }

    @Test
    public void canGetTitle() {
        assertEquals("A Little Life", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Hanya Yanagihara", book.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Literary Fiction", book.getGenre());
    }
}
