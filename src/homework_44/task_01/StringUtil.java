package homework_44.task_01;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.03.2025)
 */
public class StringUtil {

    public static List<String> getUniqueSortedWords(String string) {

        String newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        String[] words = newString.split("\\s+");

        List<String> list = Arrays.asList(words);
        Set<String> mySet = new HashSet<>(list);


        SortedSet<String> treeSet = new TreeSet<>((str1, str2) -> {
            if (str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }
            return Integer.compare(str1.length(), str2.length());
        });

        treeSet.addAll(mySet);

        return new ArrayList<>(treeSet);
    }
}
