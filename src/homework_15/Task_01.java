package homework_15;

/**
 * @author: Vasilii Serebrovskii
 * @date: 17.02.2025
 * @description: Краткое описание класса
 */

import java.util.Random;

/**
 * Task 1
 * Запишите в 4 переменные случайные числа от 0 до 100.
 * Выведите все 4 числа на экран.
 * Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
 * Output:
 * Максимальное число: 33
 */
public class Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);

        System.out.println("Сгенерированные числа = | " + var1 + " | " + var2 + " | " + var3 + " | " + var4 + " |");

        int max = var1;
        if (var2 > max) max = var2;
        if (var3 > max) max = var3;
        if (var4 > max) max = var4;

        System.out.println("Максимальное число: " + max);

    }
}
