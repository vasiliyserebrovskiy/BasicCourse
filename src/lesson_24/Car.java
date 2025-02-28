package lesson_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
public class Car {
    // Статическое поле класса. Общее число машин. Существует в единственном экземпляре и доступно всем экземплярам/объектам класса
    static int totalCars;

    private String model;
    private int power;


    //Constructor
    public Car(String model, int power) {
        this.model = model;
        this.power = power;
        totalCars++; // При создании нового объекта, увеличиваем общее кол-во созданных машин
    }

    public String toString() {
        return String.format("Auto: model: %s, power: %d. Всего создано машин: %d",
                model, power,totalCars);
    }


    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
