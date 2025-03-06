package homework_28.shapes;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */

/**
 * Task 3 опционально
 * Фигуры и их площади
 * ----- 1
 * Создайте класс Фигура с методом рассчитатьПлощадь(). +
 * ----- 2
 * Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник). +
 * ----- 3
 * В главном классе создайте список фигур и вычислите площадь каждой из них. +
 */
public class ShapesApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(15);
        shapes[1] = new Square(37);
        shapes[2] = new Triangle(12.5, 17);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
        }

    }

}
