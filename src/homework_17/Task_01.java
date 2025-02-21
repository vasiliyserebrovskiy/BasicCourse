package homework_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */

/**
 * Task 1
 * Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.
 * --------------------
 * Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */
public class Task_01 {
    public static void main(String[] args) {

        String str1 = ""; // 0
        String str2 = "Какая-то строка"; //15
        String str3 = "Sehr geehrte Damen und Herren"; // 29

        printStringLength(str1);
        printStringLength(str2);
        printStringLength(str3);

    } // End main

    // Метод определения длины строки, с выводом длины строки в консоль
    public static void printStringLength(String str) {
        System.out.printf("Длина строки составляет %s символов.\n", str.length());
    }

} // End class
