/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This class manages user data and authentication. It provides methods for user registration, login, and profile updates, integrating with the database to store and retrieve user information.
 */

public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private SQLiteDatabase db;

    public User() {
        db = new SQLiteDatabase();
    }

    public void register(String username, String password, String email) {
        db.insertUser(username, password, email);
        System.out.println("User registered successfully");
    }

    public void updateProfile(String newUsername, String newEmail) {
        this.username = newUsername;
        this.email = newEmail;
        System.out.println("Profile updated successfully");
    }

}

