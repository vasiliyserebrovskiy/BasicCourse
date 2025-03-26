package homework_42.task_03;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
/*
Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output
 */
public class NumbersSort {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));

    }
}
