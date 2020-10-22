package by.issoft.street;

import java.util.List;

public abstract class FlatHouse extends Houses {
    protected List<Flat> flats;

    public FlatHouse(String adress, List<Flat> flats) {
        super(adress);
        this.flats = flats;
    }

    @Override
    public long getRental() {
        long totalRenta = 0;
        for (Flat flat : flats) {
            totalRenta = totalRenta + flat.getRenta();
        }
        return totalRenta;
    }
}
