package homework_13;

/**
 * Task 2
 * Создайте строки:
 * "Java"
 * "is"
 * "a"
 * "powerful"
 * "language"
 * Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
 * Выведите на экран получившуюся строку и её длину.
 */

public class Task_02 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        System.out.println("\n============== Task 2.0 ==============\n");

        String result = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Получившаяся строка = \"" + result + "\". Длинна строки : " + result.length() + " символов.");

        result = String.join(" ", str1, str2, str3, str4, str5);
        System.out.printf("Получившаяся строка = \"%s\". Длинна строки : %d символов.\n", result, result.length());

        /**
         * Task 2.2
         * Замените в результирующей строке слово "powerful" на "super".
         * Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
         * Выведите на экран значение этой переменной.
         */
        System.out.println("\n============== Task 2.2 ==============\n");

        String newResult = result.replace("powerful", "super");
        System.out.println("Измененная строка: \"" + newResult + "\"");

        boolean isInResult = result.contains("age");
        System.out.println("Содержит ли исходная строка подстроку \"age\": " + isInResult);
    }
}
