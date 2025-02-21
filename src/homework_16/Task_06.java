package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Task 6
 * Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
 * -----------------------------------------
 * Пример:
 * -----------------------------------------
 * { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */
public class Task_06 {
    public static void main(String[] args) {

        Random random = new Random();

        // Создаем исходный массив чисел
        int[] myInt = new int[10];
        int i = 0;

        while (i < myInt.length) {
            myInt[i++] = random.nextInt(101) - 50;
        }

        System.out.println("Изначальный массив                 : " + Arrays.toString(myInt));

        int min = 0;
        int minIndex = 0;
        int max = 0;
        int maxIndex = 0;
        i = 0;

        //Ищем минимум и максимум в массиве
        while (i < myInt.length) {
            if (myInt[i] > max) {
                max = myInt[i];
                maxIndex = i;
            }
            if (myInt[i] < min) {
                min = myInt[i];
                minIndex = i;
            }
            i++;
        }

        //Меняем минимум и максимум местами
        int myMax = myInt[maxIndex]; // сохраняем максимальное значение
        myInt[maxIndex] = myInt[minIndex];
        myInt[minIndex] = myMax;

        System.out.println("Максимум и минимум поменяны местами: " + Arrays.toString(myInt));

    }
}
