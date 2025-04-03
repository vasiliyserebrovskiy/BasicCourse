package homework_48.task01;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */
public class Task01 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -18, -5, 0, 45, -25, 146, 7);

        List<Integer> sortedIntegers = integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparingInt(n -> n % 10))
                .collect(Collectors.toList());

        System.out.println("sortedIntegers: " + sortedIntegers);

    }


}
