package homework_29;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        type = "Circle";
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
