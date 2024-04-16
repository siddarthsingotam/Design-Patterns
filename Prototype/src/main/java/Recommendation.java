
import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books); // Return a copy of the list to prevent modification of original list
    }

    public Recommendation clone() {
        Recommendation clone = new Recommendation(this.targetAudience);
        for (Book book : this.books) {
            clone.addBook(book.clone()); // Deep clone each book
        }
        return clone;
    }
}
