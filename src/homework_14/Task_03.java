package homework_14;

import java.util.Scanner;

/**
 * Task 3
 * Попросите пользователя ввести целое число с клавиатуры.
 * Ваша программа должна вывести строку в формате:
 * Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
 * Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
 * Copy
 * Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

public class Task_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int userNumber = sc.nextInt();
        sc.nextLine();
        //Сравнения
        boolean bol1 = userNumber % 2 == 0;
        boolean bol2 = userNumber % 3 == 0;
        boolean bol3 = userNumber % 2 == 0 && userNumber % 3 == 0;

        System.out.printf("Число: %s четное: %s; кратно 3: %s; четное и кратно 3: %s\n", userNumber, bol1, bol2, bol3);

    }
}
