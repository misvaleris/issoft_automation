package by.issoft.street;

import java.util.List;

public class ManyFlatHouse extends FlatHouse {
    public ManyFlatHouse(String adress, List<Flat> flats) {
        super(adress, flats);
    }

    @Override
    public long getRental() {
        return 4 * super.getRental();
    }

}
