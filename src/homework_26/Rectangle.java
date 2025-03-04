package homework_26;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */

/**
 * Класс Rectangle (Прямоугольник)
 * Создайте класс Rectangle, который наследуется от Shape. +
 * Добавьте поля width и height типа double, которые хранят размеры прямоугольника. +
 * Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height. +
 * Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника. +
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimension(double width, double height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Неверные значения полей! Значения полей width и height должны быть больше 0.");
            return;
        }
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Площадь прямоугольника = " + area);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
