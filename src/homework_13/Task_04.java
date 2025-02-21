package homework_13;

/**
 * Task 4 * (Опционально)
 * Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
 * ------------------------------------------------
 * Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
 * ------------------------------------------------
 * Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.
 */

public class Task_04 {
    public static void main(String[] args) {
        char ch1 = 'v';
        char ch2 = 'a';
        char ch3 = 's';
        char ch4 = 'i';
        char ch5 = 'l';
        char ch6 = 'i';
        char ch7 = 'i';

        // Вариант номер 1
        char ch1Big = (char) (ch1 - 32);
        char ch2Big = (char) (ch2 - 32);
        char ch3Big = (char) (ch3 - 32);
        char ch4Big = (char) (ch4 - 32);
        char ch5Big = (char) (ch5 - 32);
        char ch6Big = (char) (ch6 - 32);
        char ch7Big = (char) (ch7 - 32);
        System.out.println("" + ch1Big + ch2Big + ch3Big + ch4Big + ch5Big + ch6Big + ch7Big);

        //Вариант номер 2 без доп переменных
        System.out.println("" + ((char) (ch1 - 32)) + ((char) (ch2 - 32)) + ((char) (ch3 - 32)) + ((char) (ch4 - 32)) + ((char) (ch5 - 32)) + ((char) (ch6 - 32)) + ((char) (ch7 - 32)));

    }
}
