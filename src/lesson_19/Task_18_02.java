package lesson_19;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.02.2025)
 */
public class Task_18_02 {
    public static void main(String[] args) {

        String[] strings = {"One", "Java", "Python", "JS", "Hello"};

        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ======= testArray = null / length = 0 ========");

        //strings = null;
        strings = new String[]{};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ======= null in array ========");

        strings = new String[]{"One", "Java", null, "JS", "Hello"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ======= null in array is first ========");

        strings = new String[]{null, "Java", "Python", "JS", "Hello"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ======= ALL null ========");

        //Все null
        strings = new String[]{null, null, null, null, null};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

    }

    public static String[] getArrayWithSmallestStrings(String[] strings) {

        if (strings == null || strings.length == 0) {
            System.out.println("Ты редиска, ты отправил null!!!");
            return new String[0];
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println(notNullValue);

        if (notNullValue == null ) {
            System.out.println("Все элементы null!");
            return new String[0];
        }

        /*String smallest = strings[0];
        String biggest = strings[0];*/

        String smallest = notNullValue;
        String biggest = notNullValue;

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Текущий: " + strings[i]);
            if (strings[i] != null && strings[i].length() < smallest.length()) smallest = strings[i];

            if (strings[i] != null && strings[i].length() > biggest.length()) biggest = strings[i];
        }

        return new String[]{smallest, biggest};
    }

    private static String findFirstNotNullValueInArray(String[] strings) {

        for (int i = 0; i < strings.length ; i++) {
            if (strings[i] != null ) return strings[i];
        }
        // Если все элементы - null в массиве то попадаем сюда
        return null;
    }
}
