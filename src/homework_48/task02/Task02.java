package homework_48.task02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
public class Task02 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("ruby", "java", "javascript", "html", "css", "python", "go", "pascal", "cobol", "assembly"));
        strings.add(null);

        String shortestString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println("Строка с минимальным количеством символов: " + shortestString);


    }
}
