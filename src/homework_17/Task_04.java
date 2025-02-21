package homework_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Task 4 * (Опционально)
 * Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
 * ---------------------------
 * Простое число - число, которое делится на цело только на 1 и само себя.
 * -----------------------------
 * Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class Task_04 {
    public static void main(String[] args) {

        Random random = new Random();
        //Готовим массив простых чисел
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        //Выводим изначальный массив чисел
        printArray(array);
        System.out.println("-----------------------------------------------------");
        findPrimeNumber(array);

    } //End main

    // Метод поиска простых чисел в целочисленном массиве
    public static void findPrimeNumber(int[] array) {
        int primeCount = 0;
        System.out.print("Данный массив содержит простые числа: | ");
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 1) { // Простыми числами являются числа > 1.

                if (array[i] == 2 || array[i] == 3) { // 2 и 3 простые числа
                    primeCount++;
                    System.out.print(array[i] + " | ");
                    continue; // array[i] уже простое, можно дальше не проверять -> переходим к следующему элементу массива
                }

                if (array[i] % 2 != 0 && array[i] % 3 != 0) { // число не делиться нацело на 2 и 3 - возможно является простым

                    /* Нужен дополнительный цикл, проверки делимости числа
                    1) Все простые числа кроме 2 и 3 имеют вид (6*k +- 1)
                    -> проверять делители можем начинать с j = 5, шагом в 6
                    Проверять делимость будем на оба числа j и j + 2 за раз ( для k = 1 простые числа 5 и 7)
                    2) диапазон чисел для блока ограничения можем ограничить j * j <= array[i] (если число n делиться на d то будет делиться и на число равное n/d достаточно проверять в диапазоне до корня от n)
                     */
                    // предположим число у нас простое
                    boolean isPrime = true;

                    // Проверим наше предположение
                    for (int j = 5; j * j <= array[i]; j += 6) {

                        if (array[i] % j == 0 || array[i] % (j + 2) == 0) {
                            isPrime = false; // уже не простое, можно дальше не проверять (По условию задачи числа не больше 100, но если использовать данную функцию для любых чисел, то сэкономим немного времени)
                            break;
                        }
                    }
                    // Если предположение верное выводим счастливчика
                    if (isPrime) {
                        primeCount++;
                        System.out.print(array[i] + " | ");
                    }
                }
            }

        }
        System.out.println();
        System.out.println("Количество простых чисел в массиве = " + primeCount);
    }

    // Вывод массива в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

} //End Class
