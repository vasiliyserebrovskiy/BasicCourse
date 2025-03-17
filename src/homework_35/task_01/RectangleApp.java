package homework_35.task_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

    length (длина) — тип double +
    width (ширина) — тип double +

Требования:
    Конструкторы:
        Создайте конструктор, который инициализирует оба поля класса. +
        Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0. +
    Методы:
        Реализуйте методы доступа (геттеры и сеттеры) для каждого поля. +
        Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]". +
    Метод main():
        В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString(). +
 */
public class RectangleApp {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle(-10, 10);
        System.out.println(rec2);

        Rectangle rec3 = new Rectangle(10, -10);
        System.out.println(rec3);

        Rectangle rec4 = new Rectangle(10, 25);
        System.out.println(rec4);


    }
}
