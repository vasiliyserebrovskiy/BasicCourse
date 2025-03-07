package lesson_29.abstracts;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
// Если потомок реализовал не все абстрактные методы родителя, то такой класс должен быть помечен как абстрактный!!
public abstract class Dog extends Animal {

    @Override
    void move() {
        System.out.println("Dog move");
    }

}
