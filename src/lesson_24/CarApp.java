package lesson_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
public class CarApp {
    public static void main(String[] args) {

        System.out.println("static totalCars = " + Car.totalCars);

        Car bmw = new Car("BMW", 200);
        System.out.println("Общее число машин = " + Car.totalCars);
        System.out.println("После создания bwv " + bmw);


        Car vw = new Car("VW", 300);
        System.out.println("После создания bwv " + vw);

        System.out.println("После создания = " + Car.totalCars);
        System.out.println("totalCars = " + Car.totalCars);

        //  Я могу обратиться к статике. от имени объекта, но это плохая практика и так делать не рекомендуется
//        System.out.println("vwtotalCars = "+ vw.totalCars);

        // Нам следует обращаться к статике от имени класса !!!

        // static int x; // в main нельзя создавать статические переменные.
        // модификатор static применим только к полям или методам класса

    }
}
