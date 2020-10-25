package by.issoft.cinema;

import by.issoft.street.Flat;
import by.issoft.street.RentalHouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comedias> comedy = new ArrayList<>();
        comedy.add(new Comedias (2,1, "Ace Ventura"));
        comedy.add(new Comedias (4,2, "Forrest Gump"));
        comedy.add(new Comedias (2,1, "Home Alone"));

        List<Horrors> horror = new ArrayList<>();
        horror.add(new Horrors (3, 5, "Frankenstein"));
        horror.add(new Horrors (2, 8, "King Kong"));

        List<Romantic> romantic = new ArrayList<>();
        romantic.add(new Romantic(1,4,"Casablanca"));
        romantic.add(new Romantic(12,5,"Titanic"));
        romantic.add(new Romantic(54,2,"Call Me by Your Name"));
        romantic.add(new Romantic(13,1,"The Lady Eve"));
        romantic.add(new Romantic(2,9,"Carol"));

    //    long totalRevenue = 0;
    //    for (Film film : totalRevenue) {
     //       long houseRental = rentalHouse.getRental();
      //      totalRenta = totalRenta + houseRental;
     //   }
      //  System.out.println("Total renta of Suvorova is " +totalRenta);













    }
}
