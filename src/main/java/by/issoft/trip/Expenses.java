package by.issoft.trip;


public abstract class Expenses implements Budget{
    protected int money;
    protected int count;

    public Expenses(int money, int count) {
        this.money = money;
        this.count = count;
    }

    @Override
    public int getBudget() {
        int budget = money*count;
        return budget;
    }
}
