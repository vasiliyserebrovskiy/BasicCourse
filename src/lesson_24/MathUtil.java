package lesson_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
public class MathUtil {

    public static int sumIntegers(int... integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        return sum;
    }
}
