package Books;
import java.util.*;

public class BookManager {
            private Map<String, Book> books = new HashMap<>();

    // Add a new book
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    // Remove a book by ISBN
    public void removeBook(String isbn) {
        books.remove(isbn);
    }  
    // Find a book by ISBN
    public Book searchByISBN(String isbn) {
        return books.get(isbn);
    }

    // List all books
    public List<Book> SearchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

}
