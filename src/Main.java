import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7,
                "Желтого", 2015,
                "России");

        Car audi = new Car("Audi", "A8 50 L TDI quattro",
                3.0, "черный", 2020,
                "Германии");

        Car bmw = new Car("BMW", "Z8", 3.0,
                "черный", 2021,
                "Германии");

        Car kia = new Car("Kia", "Sportage 4 поколение",
                2.4, "красный", 2018,
                "Южной Корее");

        Car hyundai = new Car("Hyundai", "Avante",
                1.6, "оранжевый", 2016,
                "Южной Корее");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}