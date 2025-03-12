package homework_32.task_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
public class NumericPair<T extends Number> {
    private T number1;
    private T number2;

    public NumericPair(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double sum(){
        return number1.doubleValue() + number2.doubleValue();
    }
}
