package homework_47.task01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.04.2025)
 */
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
public class Task01 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(-24, 0, 24, 8, 2, 4, 3, 7, 128, 512, 256, 86, -48, 73, 33);
        //System.out.println(integers);

        List<Integer> newList = filteredList(integers);
        System.out.println("отфильтрованный список: " + newList);

    }

    private static List<Integer> filteredList(List<Integer> integers) {
        return integers.stream()
                .filter(number -> number % 2 == 0 && number > 10 && number < 100)
                .collect(Collectors.toList());
    }


}
