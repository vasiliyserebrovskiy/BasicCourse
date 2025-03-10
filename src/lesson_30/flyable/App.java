package lesson_30.flyable;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class App {

    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = airplane;

        System.out.println("==================");
        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            //instanseof проверяем возможность приведения ссылки в интерфейсу
            if (flyable instanceof Swimmable) {
                System.out.println("Могу привести этот объект в Swimmable");
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
                System.out.println("==========\n");
            }

            if (flyable instanceof Airplane) {
                System.out.println("Могу привести к классу Airplane");
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("Вместимость = " + airplaneLink.capacity);
                airplaneLink.takePassenger();
                System.out.println("Кол-во пассажиров = " + airplaneLink.amountPassengers);
            }

        }


    }
}
