package by.issoft.zoo;

/**
 * Common info about animal
 */
public abstract class Animals implements GetCalories {
    /**
     * Count of calories for animal per day
     */
    protected int calories;

    public Animals(int calories) {
        this.calories = calories;
    }

    @Override
    public long getCalories() {
        System.out.println("Hey, I am " + getName() + " and I need " + calories + " calories per day");
        return calories;
    }

    public abstract String getName();
}
