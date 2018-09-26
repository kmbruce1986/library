import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
     private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countNumberOfBooks(){
        return this.books.size();
    }
//alternate way of method when using the isFull returning boolean.
    public void addBook(Book book) {
        if (!isFull()){
            this.books.add(book);
        }
//        if (this.capacity > countNumberOfBooks()){
//        this.books.add(book);}
    }

    public int getCapacity() {
        return capacity;
    }
//adding this method means you can use it to check if the library is full for a variety of reasons
    public boolean isFull() {
        return countNumberOfBooks() == getCapacity();
    }
}
