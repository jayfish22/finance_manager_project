/**
 * Name: Jayda Fisher
 * Date: 10-27-24
 * Assignment: Project 4.6
 * Description: This class generates financial reports, providing monthly summaries and comparisons between budget and expenses. It fetches data from the database to produce comprehensive financial reports.
 */

public class Report {
    private int reportID;
    private int userID;
    private String generatedDate;

    public Report(int reportID, int userID, String generatedDate) {
        this.reportID = reportID;
        this.userID = userID;
        this.generatedDate = generatedDate;
    }

    public String generateMonthlySummary() {
        //Generate monthly financial summary
        return "Monthly financial summary";
    }

    public String compareBudgetAndExpenses() {
        //Compare budget to expenses
        return "Comparison of budget and expenses";
    }
}
