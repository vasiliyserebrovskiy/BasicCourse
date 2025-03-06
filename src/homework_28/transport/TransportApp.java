package homework_28.transport;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */

/**
 * Task 2
 * ---- 1
 * Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы). +
 * ---- 2
 * Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации. +
 * ---- 3
 * Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть). +
 * ---- 4
 * Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства. +
 */

public class TransportApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }


    }
}
