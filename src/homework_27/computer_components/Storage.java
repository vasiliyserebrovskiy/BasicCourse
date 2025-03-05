package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Storage extends Component {
    private int storageCapacity;

    public Storage(String brand, String model, int storageCapacity) {
        super(brand, model);
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String toString() {
        return String.format("Производитель: %s,  Модель: %s, Объем: %d", brand, model, storageCapacity);
    }
}
