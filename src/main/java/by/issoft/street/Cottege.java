package by.issoft.street;

public class Cottege extends Houses {
    private int square;
    private int peopleCount;

    public Cottege(String adress, int square, int peopleCount) {
        super(adress);
        this.square = square;
        this.peopleCount = peopleCount;
    }

    @Override
    public long getRental() {
        return 2 * (square * peopleCount);
    }

}
