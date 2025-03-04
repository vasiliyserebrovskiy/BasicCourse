package lesson_26.transport;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class Vehicle {
    protected String model;
    private int year; // год выпуска

    //Конструктор
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    //Method движения
    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

    public String toString() {
        return model + ", year of manufacture = " + year;
    }

    //Геттер и суттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

}
