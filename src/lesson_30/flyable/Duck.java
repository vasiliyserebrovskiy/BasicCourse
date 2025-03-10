package lesson_30.flyable;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */

// Интерфейсы, которые реазизуются классом пишуться через запятую
public class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
