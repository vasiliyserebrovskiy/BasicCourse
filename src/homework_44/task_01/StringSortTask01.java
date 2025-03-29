package homework_44.task_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.03.2025)
 */
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

public class StringSortTask01 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));

        // Проверка сортировки одинаковых по длине слов в естественном порядке
        String testString2 = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления! Кров под защитой!";
        System.out.println(StringUtil.getUniqueSortedWords(testString2));
    }
}
