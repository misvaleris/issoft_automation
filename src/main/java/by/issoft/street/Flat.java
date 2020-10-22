package by.issoft.street;

public class Flat {
    private int square;
    private int peopleCount;
    private int number;


    public Flat(int number, int square, int peopleCount) {
        this.square = square;
        this.peopleCount = peopleCount;
        this.number = number;

    }

    public long getRenta() {
        long totalRenta = square * peopleCount;
        return totalRenta;
    }
}
