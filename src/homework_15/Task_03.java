package homework_15;

/**
 * @author: Vasilii Serebrovskii
 * @date: 17.02.2025
 * @description: Краткое описание класса
 */

import java.util.Scanner;

/**
 * Task 3 (Повышенной сложности, опционально)
 * Программа предлагает пользователю ввести четырехзначное число.
 * Ввод осуществляется только в формате строки (String).
 * Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
 * Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
 * Примеры:
 * <p>
 * - Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
 * - Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String userInput = sc.nextLine().trim();

        if (userInput.length() != 4) {
            System.out.println("Ошибка: введенное число не является четырехзначным.");
        } else {

            int v1 = Character.getNumericValue(userInput.charAt(0));
            int v2 = Character.getNumericValue(userInput.charAt(1));
            int sum1 = v1 + v2;
            int v3 = Character.getNumericValue(userInput.charAt(2));
            int v4 = Character.getNumericValue(userInput.charAt(3));
            int sum2 = v3 + v4;

            if (sum1 == sum2) {
                System.out.printf("Число %s -> (%s+%s) = %s; (%s+%s) = %s; %s равно %s - число счастливое\n", userInput, v1, v2, sum1, v3, v4, sum2, sum1, sum2);
            } else {
                System.out.printf("Число %s -> (%s+%s) = %s; (%s+%s) = %s; %s не равно %s - число НЕ является счастливым.\n", userInput, v1, v2, sum1, v3, v4, sum2, sum1, sum2);
            }

            System.out.println(userInput.charAt(0) + userInput.charAt(1));
            System.out.println(userInput.charAt(2) + userInput.charAt(3));
        }


    }
}
