package by.issoft.cars;

public interface Travelling {
    void goToTown(String townName);

    default void writeToConsole(String message){
        System.out.println(message);
    }

}
