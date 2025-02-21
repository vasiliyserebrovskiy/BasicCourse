package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

/**
 * Task 1
 * Найдите произведение всех чисел от 1 до 15 включительно.
 * --------------------------------------
 * Результат выведите на экран
 */
public class Task_01 {
    public static void main(String[] args) {
        int i = 1;
        int multiply = 1;

        while (i <= 15) {
            multiply *= i++;
        }
        System.out.println("Произведение всех чисел от 1 до 15 включительно = " + multiply); //2004310016
    }
}
