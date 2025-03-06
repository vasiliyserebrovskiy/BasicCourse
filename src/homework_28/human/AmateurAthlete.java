package homework_28.human;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class AmateurAthlete extends Human {


    @Override
    public void run() {
        System.out.println("Бежим со скорость 15 км/ч.");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Отдыхаем 10 минут.");
    }
}
