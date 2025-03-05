package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Memory extends Component {
    private int type;

    public Memory(String brand, String model, int type) {
        super(brand, model);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String toString() {
        return String.format("Производитель: %s,  Модель: %s, Тип: %d", brand, model, type);
    }
}
