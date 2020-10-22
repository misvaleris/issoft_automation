package by.issoft.street;

import java.util.List;

public class TownHouse extends FlatHouse {
    public TownHouse(String adress, List<Flat> flats) {
        super(adress, flats);
    }
    @Override
    public long getRental() {
        return 3 * super.getRental();
    }
}
