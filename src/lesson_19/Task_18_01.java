package lesson_19;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.02.2025)
 */

import java.util.Arrays;

/**
 * Task 1
 * Написать метод со следующим функционалом:
 * <p>
 * На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:
 * <p>
 * {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 * Copy
 * {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
 * Copy
 * Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
public class Task_18_01 {
    public static void main(String[] args) {

        int[] test = new int[]{0,1,2,3,4,5,6};

        copyOfArray(test, 10);

    }

    public static void copyOfArray(int[] array, int newLength) {

        if (newLength < 0 ) {
            return;
        }
        int[] result = new int[newLength];
        for (int i = 0; i < newLength && i < array.length; i++) {
            result[i] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }


}
