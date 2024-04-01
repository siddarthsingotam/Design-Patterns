
public class User {
    private String username;
    private static User currentUser;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static User getCurrentUser() {
        return currentUser;
    }
}

