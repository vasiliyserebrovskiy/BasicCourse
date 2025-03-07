package homework_28.human;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Human {

    protected int runSpeed = 10;
    protected int restTime = 15;

    public void run() {
        System.out.println("Бежим со скорость " + runSpeed + " км/ч.");
        rest();
    }

    public void rest() {
        System.out.println("Отдыхаем " + restTime + " минут.");
    }
}
