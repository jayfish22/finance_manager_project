/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This class manages budget settings and status. It includes methods for setting, modifying budgets and warning users as they approach budget limits. Integrates with the database to maintain budget records.
 */

public class Budget {
    private int budgetID;
    private int userID;
    private double budgetLimit;
    private String startDate;
    private String endDate;
    private SQLiteDatabase db;

    public Budget() {
        db = new SQLiteDatabase();
    }

    public void setBudget(int userID, double budgetLimit) {
        this.budgetLimit = budgetLimit;
        //Insert/Update budget in the database
        System.out.println("Budget set");
    }

    public String checkBudgetStatus() {
        //Check the database for budget vs actual spending
        return "Budget status checked";
    }
}

