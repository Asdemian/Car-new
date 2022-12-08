public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        if (this.brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (this.model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (Double.compare(this.engineVolume, 0D) <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (this.color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (this.productionYear < 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (this.productionCountry == null) {
            this.productionCountry = "default";
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + " , " + productionYear + " год выпуска, сборка в "
                + productionCountry + ", " + color + " цвета, объем двигателя " + engineVolume;
    }
}
