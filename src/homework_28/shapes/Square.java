package homework_28.shapes;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Площадь квадрата = " + side);
    }
}
