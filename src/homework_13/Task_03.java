package homework_13;

import java.util.Scanner;

/**
 * Task 3* (Опционально)
 * Попросите пользователя ввести строку чётной длины с клавиатуры.
 * Распечатайте два средних символа строки.
 * Например:
 * -------------
 * Для строки "string" результат будет "ri".
 * Для строки "code" результат будет "od".
 * Для строки "Practice" результат будет "ct".
 */

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку четной длинны: ");
        String stringInput = sc.nextLine();
        String result = stringInput.substring(stringInput.length() / 2 - 1, stringInput.length() / 2 + 1);
        System.out.println("Два средних символа строки: " + result);
    }
}
