package lesson_42;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    // сравнивает текущий объект this с другим объектом этого же класса (Car)
    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

    /*
    this vs car - кто больше
    this < car - больше -> отрицательное значение
    this > car - меньше -> положительное значение
    this == car -  равно -> вернет 0
     */
}
