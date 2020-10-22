package by.issoft.street;

import java.util.ArrayList;
import java.util.List;

public class MainStreet {
    public static void main(String[] args) {
        Cottege cottege1 = new Cottege("Suvorova 1", 250, 5);
        Cottege cottege2 = new Cottege("Suvorova 2", 300, 2);
        Cottege cottege3 = new Cottege("Suvorova 3", 270, 4);
        Cottege cottege4 = new Cottege("Suvorova 4", 400, 7);
        Cottege cottege5 = new Cottege("Suvorova 5", 150, 1);


        List<Flat> manyFlats = new ArrayList<>();
        manyFlats.add(new Flat(1, 33, 2));
        manyFlats.add(new Flat(2, 44, 3));
        manyFlats.add(new Flat(3, 50, 1));
        manyFlats.add(new Flat(4, 30, 2));
        manyFlats.add(new Flat(5, 50, 4));
        manyFlats.add(new Flat(6, 45, 4));

        ManyFlatHouse manyFlatHouse1 = new ManyFlatHouse("Suvorova 6", manyFlats);

        List<Flat> townFlats1 = new ArrayList<>();
        townFlats1.add(new Flat(1, 90, 5));
        townFlats1.add(new Flat(2, 100, 3));

        List<Flat> townFlats2 = new ArrayList<>();
        townFlats2.add(new Flat(3, 105, 3));
        townFlats2.add(new Flat(4, 135, 4));

        TownHouse townHouse1 = new TownHouse("Suvorova 7", townFlats1);
        TownHouse townHouse2 = new TownHouse("Suvorova 8", townFlats2);

        List<RentalHouse> rentalHouses = new ArrayList<>();
        rentalHouses.add(cottege1);
        rentalHouses.add(cottege2);
        rentalHouses.add(cottege3);
        rentalHouses.add(cottege4);
        rentalHouses.add(cottege5);
        rentalHouses.add(townHouse1);
        rentalHouses.add(townHouse2);
        rentalHouses.add(manyFlatHouse1);

        long totalRenta = 0;
        for (RentalHouse rentalHouse : rentalHouses) {
            long houseRental = rentalHouse.getRental();
            totalRenta = totalRenta + houseRental;
        }
        System.out.println("Total renta of Suvorova is " +totalRenta);
    }
}
