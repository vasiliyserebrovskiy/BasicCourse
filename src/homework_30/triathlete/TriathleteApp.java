package homework_30.triathlete;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */

/**
 * Task 1
 * Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно. +
 * Реализуйте класс Triathlete, который будет реализовывать оба интерфейса. +
 * Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием. +
 */
public class TriathleteApp {

    public static void main(String[] args) {

        Triathlete triathlete1 = Triathlete.registerTriathlete("John", 50);
        Triathlete triathlete2 = Triathlete.registerTriathlete("Anna", 37);
        Triathlete triathlete3 = Triathlete.registerTriathlete("", 35);
        Triathlete triathlete4 = Triathlete.registerTriathlete("Michael", 130);

        System.out.println(triathlete3);
        System.out.println(triathlete4);
        System.out.println(triathlete1);
        System.out.println(triathlete2);

        triathlete1.run();
        triathlete1.swimm();
        triathlete2.run();
        triathlete2.swimm();


    }

}
