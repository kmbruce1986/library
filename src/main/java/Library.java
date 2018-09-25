import java.util.ArrayList;

public class Library {
     ArrayList<Book> books;
     private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countNumberOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > countNumberOfBooks()){
        this.books.add(book);}
    }

    public int getCapacity() {
        return capacity;
    }
}
