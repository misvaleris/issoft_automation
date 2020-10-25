package by.issoft.zoo;

import java.util.List;

public class Zoo {
    private List<Animals> animals;

    public Zoo(List<Animals> animals) {
        this.animals = animals;
    }

    public long getCalories() {
        int sumCalories = 0;
        for (int i = 0; i < animals.size(); i++) {
            sumCalories += animals.get(i).getCalories();
        }
        return sumCalories;


    }
}
