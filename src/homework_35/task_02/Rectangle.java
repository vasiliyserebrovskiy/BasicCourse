package homework_35.task_02;

import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
public class Rectangle {

    private double length;
    private double width;

    // Constructors
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters und setters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length <= 0) ? 1.0 : length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width <= 0) ? 1.0 : width;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник [длина = %f, ширина = %f] ", length, width);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
