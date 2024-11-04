/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This class handles all database interactions for the Personal Finance Manager application. It includes methods to connect to the SQLite database, and to insert, update, delete, and retrieve data from it.
 */

import java.sql.*;

public class SQLiteDatabase {
    private String url = "jdbc:sqlite:finance_manager.db";

    public SQLiteDatabase() {
        initializeDatabase();
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    private void initializeDatabase() {
    }

    public void insertUser(String username, String password, String email) {
        String sql = "INSERT INTO Users(username, password, email) VALUES(?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting user: " + e.getMessage());
        }
    }

}

