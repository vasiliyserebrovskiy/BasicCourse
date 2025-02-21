package homework_14;

/**
 * Дан текст Programming is fun.
 * ---------------------------------
 * Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
 */

public class Task_01 {
    public static void main(String[] args) {
        String str = "Programming is fun.";
        boolean containStr = str.contains("fun");
        System.out.println("Строка \"" + str + "\" содержит \"fun\"? : " + containStr);
    }
}
