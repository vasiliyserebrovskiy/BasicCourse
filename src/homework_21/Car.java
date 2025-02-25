package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class Car {
    String manufacturer; // Производитель
    String fuelType; //Тип бензина
    int tankCapacity; // Объем бензобака
    int fuelLevel; // Уровень топлива
    boolean isGood = true;

    public Car(String manufacturer, String fuelType, int tankCapacity) {
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;

        if (tankCapacity == 0 || tankCapacity < 0) {
            this.tankCapacity = 40;
            this.fuelLevel = 40; // Считаем, что машина создается с полным баком
        } else {
            this.tankCapacity = tankCapacity;
            this.fuelLevel = tankCapacity; // Считаем, что машина создается с полным баком
        }


    }

    public void drive() {
        if (isGood && fuelLevel > 0) {
            System.out.println("Мы едем.");
            fuelLevel -= 10;
            if (fuelLevel < 0) fuelLevel = 0;
        } else if (!isGood) {
            System.out.println("Машина сломана, нужен ремонт!");
        } else {
            System.out.println("Не хватает бенина, нужна заправка!");
        }
    }

    public void refill() {
        System.out.println("Заправляем машину :)");
        fuelLevel = tankCapacity;
    }

    public void repair() {
        System.out.println("Ремонт машины!");
        isGood = true;
    }

    public void breakdown() {
        System.out.println("Упс, что-то сломалось! :(");
        isGood = false;
    }

    public void carInfo() {
        System.out.println("=====================");
        System.out.println("Машина марки: " + manufacturer);
        System.out.println("Тип бензина: " + fuelType);
        System.out.println("Объем бензобака: " + tankCapacity + ". В баке " + fuelLevel + " литров.");
        System.out.println("Машина исправна: " + ((isGood) ? "Да" : "Нет"));
        System.out.println("=====================");
    }

}
