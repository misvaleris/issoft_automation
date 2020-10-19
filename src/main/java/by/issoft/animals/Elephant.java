package by.issoft.animals;

public class Elephant extends CommonAnimals {
    private String eyeColor;

    public Elephant(String eyeColor, int veigh) {
        super(veigh);
        this.eyeColor = eyeColor;
    }

    @Override
    public void goEat(String foodName) {
        System.out.println("Hello, I am a Elephant and I eat " + foodName);
        System.out.println("Also, you can see my eye is " + eyeColor);
        System.out.println("And of course my veight is " + veigh +"t");
        System.out.println();
    }
}
