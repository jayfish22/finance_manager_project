/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This is the main class of the Personal Finance Manager application. It initializes the application, creates instances of the main classes, and demonstrates the functionalities of managing users, transactions, budgets, and reports.
 */

public class App {
    public static void main(String[] args) {
        SQLiteDatabase db = new SQLiteDatabase();

        //User class to demonstrate registration and update
        User user = new User();
        user.register("john_doe", "password123", "john@example.com");
        user.updateProfile("john_updated", "updated@example.com");

        //Transaction class to demonstrate adding and editing transactions
        Transaction transaction = new Transaction();
        transaction.addTransaction(1, 100.00, "Expense", "2024-10-25");
        transaction.editTransaction(1, 150.00);

        //Budget class to set a new budget and check status
        Budget budget = new Budget();
        budget.setBudget(1, 500.00);
        String status = budget.checkBudgetStatus();
        System.out.println(status);

        //Output to verify operations
        System.out.println("All operations completed successfully.");
    }
}

