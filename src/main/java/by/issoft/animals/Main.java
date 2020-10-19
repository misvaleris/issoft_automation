package by.issoft.animals;

public class Main {
    public static void main(String[] args) {
        CommonAnimals jiraf = new Jirafe("red", 2);
        jiraf.goEat("lists");
        CommonAnimals elephant = new Elephant("blue", 10);
        elephant.goEat("banana");
    }
};

