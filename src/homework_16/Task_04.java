package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

import java.util.Scanner;

/**
 * Task 4 * (Опционально)
 * Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
 * ----------------------------------------
 * Пример:
 * ----------------------------------------
 * 567432 -> 5+6+7+4+3+2 -> 27
 */
public class Task_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        boolean catchError = false;

        System.out.println("Пожалуйста введите любое число: ");
        String userInput = sc.nextLine().trim();

        String[] myString = userInput.split("");

        while (i < myString.length) {
            try {
                sum += Integer.parseInt(myString[i]);
            } catch (NumberFormatException e) {
                System.out.printf("Ошибка: Ваше число %s содержит символ, отличный от числа!\n", userInput);
                catchError = true;
                break;
            }
            i++;
        }
        if (!catchError) System.out.printf("Вы ввели число %s, сумма всех его чисел = %s\n", userInput, sum);
    }
}
