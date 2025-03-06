package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Component {
    protected String brand;
    protected String model;
    // private final - на лекции сделали их такими

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return String.format("Производитель: %s,  Модель: %s", brand, model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


}
