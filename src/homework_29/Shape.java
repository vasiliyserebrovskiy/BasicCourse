package homework_29;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */

/**
 * Task 1
 * Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
 * Реализуйте классы-наследники Circle, Rectangle, и Triangle.
 * Убедитесь, что все классы правильно вычисляют площадь и периметр.
 * Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
public abstract class Shape {

    public static final double PI = 3.1415926;
    protected String type = "Shape";

    public String getType() {
        return type;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
