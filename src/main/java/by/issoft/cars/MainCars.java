package by.issoft.cars;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCars { //создаем запускающий класс



    public static void main(String[] args) {
        CommonCar trac = new TrackCar(87, 99);
//        trac.goToTown("Minsk");
        CommonCar lightCar = new LightCar(500, 77);
//        lightCar.goToTown("New City");
        CommonCar fastCar = new FastCar(67, 98);
//        fastCar.goToTown("Los Angeles");
        Travelling[] tracs = {trac, lightCar, fastCar};
        dispathcer(tracs);

        trac.setOilCount(100);
        System.out.println("New oil count for trac is " + trac.getOilCount());
    }

    private static void dispathcer(Travelling[] tracs) {
        for (int i = 0; i < tracs.length; i++) {
            tracs[i].goToTown("Minsk");
            tracs[i].writeToConsole("Hello !");
        }
    }


}
