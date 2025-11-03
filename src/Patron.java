import java.util.*;
import Books.Book;

public class Patron {
    private String name;
    private String patronId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Patron(String patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
