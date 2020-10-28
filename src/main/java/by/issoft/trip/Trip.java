package by.issoft.trip;

import java.util.HashMap;
import java.util.List;

public class Trip {
    String dateOfTrip;
    List<Expenses> expenses;

    public Trip(String dateOfTrip, List<Expenses> expenses) {
        this.dateOfTrip = dateOfTrip;
        this.expenses = expenses;
    }

    public List<Expenses> getExpenses() { //геттер, чтобы получить список затрак
        return expenses;
    }
}
