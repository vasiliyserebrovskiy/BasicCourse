package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class CarMain {
    public static void main(String[] args) {

        //Создаем объект машина
        Car myCar = new Car("Toyota", "Diesel", -10);
        myCar.carInfo();

        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();

        myCar.breakdown();
        myCar.carInfo();

        myCar.repair();
        myCar.carInfo();

        myCar.refill();
        myCar.carInfo();

    }
}
