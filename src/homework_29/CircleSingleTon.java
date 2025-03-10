package homework_29;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class CircleSingleTon extends Shape {
    //private static CircleSingleTon instance; //Приветное поле
    private double radius;

    private CircleSingleTon(double radius) {
     //   if (radius < 0) return;
        this.radius = radius;
        type = "Circle";
    }

    public static CircleSingleTon getCircle(double radius) {
        if (radius < 0 ) return null;
        return new CircleSingleTon(radius);
    }

//    // Классический пример Single Ton
//    public static CircleSingleTon getInstance(double radius) {
//        if (instance == null) instance = new CircleSingleTon(radius); //В статическом методе можно вызывать конструктор
//
//        return instance;
//    }

//    public CircleSingleTon(double radius) {
//        if (radius < 0) return;
//        this.radius = radius;
//        type = "Circle";
//    }

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
