package by.issoft.cinema;

import by.issoft.street.Flat;

import java.util.List;

public abstract class Films extends Cinema {
    protected List<Film> film;

    @Override
    public long getRevenue() {
       long totalRevenue = 0;
        for (Film film : film) {
            totalRevenue = totalRevenue + film.getRevenue();
            System.out.println(totalRevenue);
       }
       return totalRevenue;
    }

}