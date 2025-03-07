package homework_29;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class Rectangle extends Shape {
    private double rectangleSideA;
    private double rectangleSideB;

    public Rectangle(double rectangleSideA, double rectangleSideB) {
        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;
        type = "Rectangle";
    }

    public Rectangle(double rectangleSideA) {
        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideA;
        type = "Square";
    }

    @Override
    double calculateArea() {
        return rectangleSideA * rectangleSideB;
    }

    @Override
    double calculatePerimeter() {
        return (rectangleSideA + rectangleSideB) * 2;
    }

    public double getRectangleSideA() {
        return rectangleSideA;
    }

    public void setRectangleSideA(double rectangleSideA) {
        this.rectangleSideA = rectangleSideA;
    }

    public double getRectangleSideB() {
        return rectangleSideB;
    }

    public void setRectangleSideB(double rectangleSideB) {
        this.rectangleSideB = rectangleSideB;
    }
}
