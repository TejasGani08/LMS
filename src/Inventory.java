import Books.BookManager;
import Books.Book;
import java.util.*;
public class Inventory {
        private BookManager bookManager;

        public Inventory(BookManager bookManager) {
            this.bookManager = bookManager;
        }

        public List<Book> getAvailaBooks() {
            List<Book> availableBooks = new ArrayList<>();
            for (Book book : bookManager.SearchByTitle("")) {
                if (book.isAvailable()) {
                    availableBooks.add(book);
                }
            }
            return availableBooks;
        }
}
