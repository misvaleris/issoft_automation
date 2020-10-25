package by.issoft.zoo;

import java.util.ArrayList;
import java.util.List;

public class MainZoo {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();

        Giraffe giraffe = new Giraffe(2500);
        animals.add(giraffe);

        Monkey monkey = new Monkey(3400);
        animals.add(monkey);

        Crocodile crocodile = new Crocodile(3200);
        animals.add(crocodile);

        Elephant elephant = new Elephant(4000);
        animals.add(elephant);

        Zoo zoo = new Zoo(animals);
        System.out.println(zoo.getCalories());

    }
}
