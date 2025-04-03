package homework_47.task02;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.04.2025)
 */
/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */
public class Task02 {

    public static void main(String[] args) {
        List<String> myStringList = Arrays.asList("аптека", "буйвол", "втулка", "анальгин", "форточка", "аэропорт", "река", "Аптека");
        //System.out.println(myStringList);

        List<String> filteredStrList = filteredStrings(myStringList);

        System.out.println("Новый список: " + filteredStrList);
    }

    private static List<String> filteredStrings(List<String> myStringList) {
        return myStringList.stream()
                .filter(word -> word.toLowerCase().charAt(0) == 'а')
                //.filter(word -> word.substring(0,1).equalsIgnoreCase("A")) - лучше чем charAt
                //методы String endsWith() startsWith()
                // содержит ли строка подстроку contains()
                .sorted()
                .collect(Collectors.toList());
    }


}
