package lesson_29.abstracts;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class Cat extends Animal {

    // Обязаны переопределить все абстрактные методы
    @Override
    void move() {
        System.out.println("Код передвигается");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать!");
    }
}
