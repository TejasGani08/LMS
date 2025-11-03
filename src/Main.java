import Books.BookManager;
import Books.Book;

public class Main {

    public static void main(String[] args) {
    BookManager bookManager = new BookManager();
    Lending lending = new Lending(bookManager);

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321", 1960);
        bookManager.addBook(book1);
        Book book2 = new Book("1984", "George Orwell", "1234",  1949);
        bookManager.addBook(book2);
        Patron patron = new Patron ("P001", "Alice");
        lending.lendBook(patron, "1234");
            //Print book details
            System.out.println("Book details:");
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("ISBN: " + book1.getIsbn());
            System.out.println("Year: " + book1.getPublishYear());
            System.out.println(patron.getName()+ "borrowed:  "+ patron.getBorrowedBooks().get(0).getTitle());
            lending.returnBook(patron, "1234");
            System.out.println("Book returned successfully.");
    }
}