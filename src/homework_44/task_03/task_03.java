package homework_44.task_03;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (29.03.2025)
 */
/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e
 */

public class task_03 {

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println("Исходная строка: " + string);
        System.out.println("Первый не повторяющийся символ в строке: " + returnFirstUniqueCharacterInRow(string));

    }

    public static Character returnFirstUniqueCharacterInRow(String string) {

        String newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        char[] charArray = newString.toCharArray();
        //System.out.println("Char array: " + Arrays.toString(charArray));

        Set<Character> repeatingChars = new HashSet<>();
        List<Character> uniqueChars = new ArrayList<>();

        for (char c : charArray) {
            if (repeatingChars.contains(c)) {
                continue;
            }
            if (uniqueChars.contains(c)) {
                uniqueChars.remove((Character) c);
                repeatingChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.isEmpty() ? null : uniqueChars.get(0);

    }
}
