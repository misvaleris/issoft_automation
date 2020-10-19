package by.issoft.cars;

public class LightCar extends CommonCar {
    private int money; //special for lightCar

    public LightCar(int money, int oilCount) {
        super(oilCount); //вызывает конструктор родительского класса
        this.money = money; //конструктор класса для создания экземпляра (вводим данные переменной)
    }

    //  @Override
    public void goToTown(String townName) {
        System.out.println(townName + " My Money is " + money);
        //  int oilResult = oilCount - townName.length();
        int oilCountForTrip = countOil(townName);
        System.out.println("My oil is " + oilCountForTrip);
        oilCount =  oilCountForTrip;
    }
}
