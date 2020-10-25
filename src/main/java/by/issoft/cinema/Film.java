package by.issoft.cinema;

public class Film extends Films {
    private int place;
    private int session;
    private String name;

    public Film(int place, int session, String name) {
        this.place = place;
        this.session = session;
        this.name = name;
    }

    public long getRevenue() {
        long totalRevenue = place * session;
        return totalRevenue;
    }
}
