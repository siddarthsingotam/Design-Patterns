

public class Book {
    private String author;
    private String title;
    // Additional attributes like genre, publicationYear can be added here

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Getter and setter methods for author, title, and other attributes

    public Book clone() {
        // Implement cloning logic here
        return new Book(this.author, this.title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
