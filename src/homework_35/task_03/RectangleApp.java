package homework_35.task_03;

import java.util.ArrayList;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
/*
Task 3. Опционально задание
Удаление дубликатов из списка объектов “Rectangle”
Создайте метод, который принимает список объектов Rectangle и объект Rectangle, и удаляет из списка все объекты, которые равны переданному объекту (по значению полей length и width).

Требования:
Метод удаления дубликатов:
    Реализуйте метод removeDuplicates, который принимает список List и объект Rectangle.
    Метод должен удалить из списка все объекты, которые равны переданному объекту (используя переопределённый метод equals()).
Метод main():
    Создайте список MyList и добавьте в него несколько объектов, включая дубликаты.
    Вызовите метод removeDuplicates, передав ему список и объект Rectangle, дубликаты которого нужно удалить.
    Выведите на экран список до и после удаления дубликатов.
Важно!
    Будьте внимательны при удалении элементов из списка во время перебора в цикле.
    Если вы удаляете элементы из списка, по которому в данный момент итерируетесь, это может привести к ошибкам или пропуску элементов.
    Подумайте, как можно правильно организовать цикл, чтобы корректно удалить необходимые элементы без возникновения проблем.
 */
public class RectangleApp {
    public static void main(String[] args) {

        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        rectangles = RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        System.out.println("\n ================================ \n");

        MyList<Rectangle> rectangles2 = new MyArrayList<>();
        rectangles2.add(new Rectangle(5.0, 3.0));
        rectangles2.add(new Rectangle(4.0, 2.0));
        rectangles2.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles2.add(new Rectangle(6.0, 4.0));
        rectangles2.add(new Rectangle(5.0, 3.0));

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles2) {
            System.out.println(rect);
        }

        RectangleUtils.removeDuplicates2(rectangles2, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles2) {
            System.out.println(rect);
        }

    }
}
