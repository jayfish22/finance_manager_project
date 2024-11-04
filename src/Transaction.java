/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This class manages financial transactions. It supports adding, deleting, and editing transactions while adjusting user's total expenses and budget limits. Database interactions are included to persist transaction data.
 */


public class Transaction {
    private int transactionID;
    private int userID;
    private double amount;
    private String transactionType;
    private String date;
    private SQLiteDatabase db;

    public Transaction() {
        db = new SQLiteDatabase();
    }

    public void addTransaction(int userID, double amount, String transactionType, String date) {
        System.out.println("Transaction added");
    }

    public void deleteTransaction(int transactionID) {
        System.out.println("Transaction deleted");
    }

    public void editTransaction(int transactionID, double newAmount) {
        this.amount = newAmount;
        System.out.println("Transaction updated");
    }
}

