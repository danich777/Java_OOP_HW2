/**
 * Переписать прошлое домашнее задание с использованием принципа инкапсуляции
 */

public class Main {
    public static void main(String[] args) {
        Car Toyota = new Car("Toyota", 2005, 35000, "red", 220);
        Car Lexus = new Car("Lexus", 2019,50000, "silver", 150);

        Toyota.getInfo();
        Lexus.getInfo();


        Toyota.powerOnCar();
        Toyota.road("Горького 17");
        Toyota.powerOffCar();

        Lexus.road("Горького 17");
        Lexus.powerOnCar();
        Lexus.road("Горького 17");
        Lexus.powerOffCar();



        Car.compare(Toyota, Lexus);

    }
}