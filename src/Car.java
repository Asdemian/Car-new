public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return brand+ " "+model+ " , " +productionYear+ " год выпуска, сборка в "
                +productionCountry+", "+color+" цвета, объем двигателя " +engineVolume ;
    }
}
