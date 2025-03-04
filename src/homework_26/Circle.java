package homework_26;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */

/**
 * Класс Circle (Круг)
 * Создайте класс Circle, который наследуется от Shape. +
 * Добавьте поле radius типа double, которое хранит радиус круга. +
 * Создайте метод setRadius(double radius), который устанавливает значение поля radius. +
 * Создайте метод calculateArea(), который вычисляет и выводит площадь круга. +
 */
public class Circle extends Shape {
    public static final double PI = 3.1415926;
    private double radius;

    public Circle(String name) {
        super(name);
    }

    // Метод calculateArea()
    public void calculateArea() {
        double circleArea = PI * radius * radius;
        System.out.println("Площадь круга = " + circleArea);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Неверное значение радиуса! Радиус не может быть меньше или равен 0.");
            return;
        }
        this.radius = radius;
    }
}
