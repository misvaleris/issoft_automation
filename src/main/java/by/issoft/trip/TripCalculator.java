package by.issoft.trip;

import java.util.ArrayList;
import java.util.List;

public class TripCalculator {
    public int getTripBudget (Trip trip){
        List<Expenses> budgets = trip.getExpenses();
        int totalBudget = 0;
        for (Expenses expenses: budgets) {
            totalBudget = totalBudget+expenses.getBudget();
        }
        return totalBudget;
    }
}
