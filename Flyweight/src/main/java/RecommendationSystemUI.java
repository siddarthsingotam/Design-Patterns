
public class RecommendationSystemUI {
    public static void main(String[] args) {
        // Example usage of the recommendation system
        Recommendation originalRecommendation = new Recommendation("Fiction Readers");
        originalRecommendation.addBook(new Book("Author 1", "Book 1"));
        originalRecommendation.addBook(new Book("Author 2", "Book 2"));

        Recommendation clonedRecommendation = originalRecommendation.clone();
        clonedRecommendation.removeBook(clonedRecommendation.getBooks().get(0));

        System.out.println("Original Recommendation:");
        displayRecommendation(originalRecommendation);

        System.out.println("\nCloned Recommendation with Book 1 removed:");
        displayRecommendation(clonedRecommendation);
    }

    private static void displayRecommendation(Recommendation recommendation) {
        System.out.println("Target Audience: " + recommendation.getTargetAudience());
        System.out.println("Books:");
        for (Book book : recommendation.getBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
