import Books.Book;
import Books.BookManager;

public class Lending {
    private BookManager bookManager;

    public Lending(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public boolean lendBook(Patron patron, String isbn) {
        Book book = bookManager.searchByISBN(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(Patron patron, String isbn) {
        Book book = bookManager.searchByISBN(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            return true;
        }
        return false;
    }
}
