package lesson_27;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Application {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John","LN-122345");
        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus);

        BusDriver busDriver1 = new BusDriver("Margo", "LN-467382");
        bus.setDriver(busDriver1);

        System.out.println(bus);

        bus.showListPassengers();

        Passenger john = new Passenger("John");
        Passenger mario = new Passenger("Mario");
        Passenger jane = new Passenger("Jane");

        bus.takePassenger(john);
        bus.takePassenger(john);
        bus.takePassenger(mario);
        bus.takePassenger(jane);
        bus.takePassenger(jane);


        bus.showListPassengers();

        System.out.println("Кол-во пассажиров = " + bus.getCountPassangers());


    }
}
