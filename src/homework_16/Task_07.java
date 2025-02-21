package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

import java.util.Arrays;

/**
 * Task 7 * (Опционально)
 * Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.
 * <p>
 * Пример:
 * <p>
 * { "One", "Two", "Twenty" } ->
 * <p>
 * T
 * w
 * e
 * n
 * t
 * y
 */
public class Task_07 {

    //Метод для приема массива строк и вывода наибольшей строки на экран посимвольно (каждый символ с новой строки)
    private static void printMaxArrayString(String[] array) {

        int i = 0;
        int maxStringLength = 0;
        int indexMaxString = 0;

        //Ищем самую длинную строку
        while (i < array.length) {
            if (array[i].length() > maxStringLength) {
                maxStringLength = array[i].length();
                indexMaxString = i;
            }
            i++;
        }

        //Выводим самую длинную строку посимвольно
        String maxString = array[indexMaxString];
        i = 0;
        while (i < maxString.length()) {
            System.out.println(maxString.charAt(i));
            i++;
        }

    }

    public static void main(String[] args) {

        String[] myString = new String[]{"Привет!", "Добрый день!", "Hello!", "Hallo!"};
        System.out.println("Исходный массив строк = " + Arrays.toString(myString));

        printMaxArrayString(myString);


    }
}
