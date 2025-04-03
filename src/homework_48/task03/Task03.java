package homework_48.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2, и собрать результат в новый список
 */
public class Task03 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 12, -14, -13, 0, 25, 8, 17, 16, 31, 64));

        List<Integer> newIntegers = integers.stream()
                .filter(i -> i % 2 == 0)
                //.peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println("Новый список: " + newIntegers);

    }
}
