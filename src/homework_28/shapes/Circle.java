package homework_28.shapes;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Circle extends Shape {
    public static final double PI = 3.1415926;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Площадь круга = " + area);
    }
}
