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
        System.out.println(twoPowerOfN(5));
        System.out.println("==================");
        System.out.println(twoPowerOfN(1));
        System.out.println("==================");
        System.out.println(twoPowerOfN(0));
        System.out.println("==================");
        System.out.println(twoPowerOfN(-1));
        System.out.println("==================");
        System.out.println(twoPowerOfN(-5));
        System.out.println("==================");
        System.out.println(twoPowerOfN(8));
        System.out.println("===== Конец ======");

    } // End main

    //Метод возведения числа в степень

    public static double twoPowerOfN(int n) {

        boolean isPossitive = n >= 0;

        // если х отрицательный - отбросить знак числа
        if (n < 0) n *= -1;

        // Вычисляем 2 ^ |x|
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= 2;
        }



        return (isPossitive) ? result : 1 / result;
    }



}// End class
