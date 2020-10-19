package by.issoft.animals;

public class Jirafe extends CommonAnimals {
    private String leatherColor;

    public Jirafe(String leatherColor, int veigh) {
        super(veigh);
        this.leatherColor = leatherColor;
    }

    @Override
    public void goEat(String foodName) {
        System.out.println("Hello, I am a Jirafe and I eat " + foodName);
        System.out.println("Also, you can see my " + leatherColor + " leather");
        System.out.println("And of course my veight is " + veigh +"t");
        System.out.println();
    }


}
