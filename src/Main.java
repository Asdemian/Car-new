import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Grande";
        lada.productionCountry = "России";
        lada.engineVolume = 1.7;
        lada.color = "Желтого";
        lada.productionYear = 2015;

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionCountry = "Германии";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionYear = 2020;

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionCountry = "Германии";
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.productionYear = 2021;

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.productionCountry = "Южной Корее";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionYear = 2018;

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionCountry = "Южной Корее";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}