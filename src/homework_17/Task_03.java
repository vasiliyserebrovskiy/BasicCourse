package homework_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */

/**
 * Task 3
 * Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
 * -------------------------------------------------
 * Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
 * -------------------------------------------------
 * класс Math для нахождения степени числа использовать нельзя ;)
 * -------------------------------------------------
 * P.S. А почему вы решили, что число может прийти только положительное? ;)
 */
public class Task_03 {
    public static void main(String[] args) {

        System.out.println("===== Начало =====");
        twoPowerOfN(5);
        System.out.println("==================");
        twoPowerOfN(1);
        System.out.println("==================");
        twoPowerOfN(0);
        System.out.println("==================");
        twoPowerOfN(-1);
        System.out.println("==================");
        twoPowerOfN(-5);
        System.out.println("==================");
        twoPowerOfN(8);
        System.out.println("===== Конец ======");

    } // End main

    //Метод возведения числа в степень

    public static void twoPowerOfN(int n) {

        if (n >= 2) {
            int result = mathPowerTwo(n);
            System.out.printf("2 в стпени %s = %s.\n", n, result);
        } else if (n == 1) {
            System.out.printf("2 в степени %s = 2\n", n);
        } else if (n == 0) {
            System.out.printf("2 в степени %s = 1\n", n);
        } else if (n == -1) {
            System.out.printf("2 в степени %s = %f\n", n, (1 / (double) 2));
        } else {
            n *= -1;
            int result = mathPowerTwo(n);
            System.out.printf("2 в стпени %s = %f.\n", (-1 * n), (1 / (double) result));
        }
    }

    // Метод расчета 2 в степени |n| >= 2
    public static int mathPowerTwo(int n) {
        int result = 2;

        for (int i = 2; i <= n; i++) {
            result *= 2;
        }
        return result;
    }

}// End class
