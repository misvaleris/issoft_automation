package by.issoft.cars;

public abstract class CommonCar implements Travelling { //группируем общую информацию.
    protected int oilCount; // количество топлива, создание общей переменной. protected дает инфу детям.

    public CommonCar(int oilCount) {
        this.oilCount = oilCount;
    }

    //  public abstract void goToTown(String townName);//создание общего метода. Он не реализуется в родительском методе, а только в наследниках!

    protected int countOil(String townName) {
        int oilResult = oilCount - townName.length();
        return oilResult;
    }

    public int getOilCount(){
        return oilCount;
    }

    public void setOilCount(int oilCountNew){
        oilCount = oilCountNew;
    }
}
