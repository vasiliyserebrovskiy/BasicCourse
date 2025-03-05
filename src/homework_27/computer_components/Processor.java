package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Processor extends Component {

    private int coresNumbers;

    public Processor(String brand, String model, int coresNumbers) {
        super(brand, model);
        this.coresNumbers = coresNumbers;
    }

    public int getCoresNumbers() {
        return coresNumbers;
    }

    public String toString() {
        return String.format("Производитель: %s,  Модель: %s, Число ядер: %d", brand, model, coresNumbers);
    }
}
