package Books;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int PublishYear;
    private boolean isAvailable = true;

    // Constructor
    public Book(String title, String author, String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.PublishYear = publishYear;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }   
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getPublishYear() {
        return PublishYear;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
