package by.issoft.animals;

public abstract class CommonAnimals {
    protected int veigh;

    public abstract void goEat(String foodName);

    public CommonAnimals(int veigh) {
        this.veigh = veigh;
    }
}
