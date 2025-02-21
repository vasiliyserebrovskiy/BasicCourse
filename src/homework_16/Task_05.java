package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Task 5
 * Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
 * ----------------------------------------
 * Вывести на экран:
 * ----------------------------------------
 * Минимальное значение в массиве
 * Максимальное значение в массиве
 * Среднее арифметическое всех значений в массиве
 */
public class Task_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        int min = 0;
        int max = 0;
        int sum = 0;

        //Создаем и заполняем наш массив случайными числами
        int[] myInt = new int[15];

        System.out.print("Полученный случайный массив чисел = [ ");
        while (i < myInt.length) {
            myInt[i] = random.nextInt(101) - 50;
            if (i != 14) System.out.print(myInt[i] + ", ");
            else System.out.print(myInt[i] + " ");
            i++;
        }
        System.out.println(" ]");

        // Ищем максимум, минимум и считаем сумму всех элементов
        i = 0;
        while (i < myInt.length) {
            if (myInt[i] > max) max = myInt[i];
            if (myInt[i] < min) min = myInt[i];
            sum += myInt[i];
            i++;
        }

        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Среднее арифметическое всех значений в массиве: " + sum);

    }
}
