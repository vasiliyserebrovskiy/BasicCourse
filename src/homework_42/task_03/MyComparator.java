package homework_42.task_03;

import java.util.Comparator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {

        if (num1 % 2 == 0 && num2 % 2 != 0) {
            return -1;
        }
        if (num1 % 2 != 0 && num2 % 2 == 0) {
            return 1;
        }

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return Integer.compare(num1, num2);
        }

        return Integer.compare(num2, num1);
    }
}
