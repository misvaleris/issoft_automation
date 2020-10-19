package by.issoft.cars;

public class FastCar extends CommonCar {
    private int speed; //special for FastCar

    public FastCar(int speed, int oilCount) {
        super(oilCount); //вызывает конструктор родительского класса
        this.speed = speed; //конструктор класса для создания экземпляра (вводим данные переменной)
    }

    //   @Override // аннтоция - мы переопределяем этот метод
    public void goToTown(String townName) { //обстрактный метод в обстрактном классе, наследники его переопределяют
        System.out.println(townName + " My Speed is " + speed);
        // int oilResult = oilCount - townName.length();
        // if (oilResult == 0) {
        //    System.out.println("We can't move, we stay without oil");
        int oilCountForTrip = countOil(townName);
        System.out.println("My oil is " + oilCountForTrip);
        oilCount =  oilCountForTrip;
    }
}