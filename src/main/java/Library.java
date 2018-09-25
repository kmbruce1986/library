import java.util.ArrayList;

public class Library {
     ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public int countNumberOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
