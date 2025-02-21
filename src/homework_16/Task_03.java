package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

import java.util.Scanner;

/**
 * Task 3 *(Опционально)
 * Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово,
 * программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
 * --------------------------------------------------
 * Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 */
public class Task_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String userInput;

        do {
            System.out.println("Пожалуйста, введите слово hello: ");
            userInput = sc.nextLine().trim().toLowerCase(); // Учтем два варианта написания hello и Hello как правильное написание слова
            counter++;
        } while (!userInput.equals("hello"));

        System.out.println("Вам потребовалось " + counter + " попыток, чтобы ввести слово hello.");

    }
}
