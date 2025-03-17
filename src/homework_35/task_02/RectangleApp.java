package homework_35.task_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
/*
Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них совпадают значения полей length и width.
Метод main():
Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.

 */
public class RectangleApp {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println("rect1.equals(rect2) = " + rect1.equals(rect2)); // Должно быть true
        System.out.println("rect1.equals(rect3) = " + rect1.equals(rect3)); // Должно быть false

    }
}
