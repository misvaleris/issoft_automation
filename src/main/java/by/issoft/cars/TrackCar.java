package by.issoft.cars;

public class TrackCar extends CommonCar { //хранит специфичную информацию
    private int length; //special for track, private - делаем закрытой для остальных классов


    public TrackCar(int length, int oilCount) {
        super(oilCount); //создаем коструктор
        //вызывает конструктор родительского класса


        this.length = length; //конструктор класса для создания экземпляра (вводим данные переменной)
    }

    //  @Override //как бы отмечаем, что это еализация метода родителя
    public void goToTown(String townName) { //реализуем метод родителя
        System.out.println(townName + " My length is " + length);
        //   int oilResult = oilCount - townName.length();
        int oilCountForTrip = countOil(townName);
        System.out.println("My oil is " + oilCountForTrip);
        oilCount =  oilCountForTrip;
    }

    @Override
    public void writeToConsole(String message) {
        System.out.println("Hello world");
    }
}
