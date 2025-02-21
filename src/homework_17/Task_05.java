package homework_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */

import java.util.Arrays;

/**
 * Task 5 * (Опционально)
 * Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.
 * -------------------------------
 * Пример:
 * -------------------------------
 * { "One", "Two", "Twenty" } ->
 * -------------------------------
 * T
 * w
 * e
 * n
 * t
 * y
 */
public class Task_05 {
    public static void main(String[] args) {

        String[] myString = new String[]{"Привет!", "Добрый день!", "Hello !", "Hallo!"};

        printArray(myString);

        printMaxArrayString(myString);

    } //End main

    // Метод для приема массива строк и вывода наибольшей строки на экран посимвольно (каждый символ с новой строки)
    private static void printMaxArrayString(String[] array) {

        int maxStringLength = 0;
        int indexMaxString = 0;

        //Ищем самую длинную строку
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxStringLength) {
                maxStringLength = array[i].length();
                indexMaxString = i;
            }
        }
        //Выводим самую длинную строку посимвольно
        String maxString = array[indexMaxString];

        for (int i = 0; i < maxString.length(); i++) {
            System.out.println(maxString.charAt(i));
        }
    }

    // Вывод массива в консоль
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }
} // End class
