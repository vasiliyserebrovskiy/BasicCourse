package homework_44.task_02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (29.03.2025)
 */
/*
Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами. Некоторые слова должны повторяться в обоих множествах. +
Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).
Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.

Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */
public class StringsTask02 {

    public static void main(String[] args) {

        //Создаем строковые множества
        Set<String> set1 = new HashSet<>(Arrays.asList("яблоко", "банан", "апельсин", "груша", "слива"));
        Set<String> set2 = new HashSet<>(Arrays.asList("банан", "киви", "груша", "виноград", "персик"));

        System.out.println("Множество 1: " + set1);
        System.out.println("Множество 2: " + set2);
        //Объединение множеств union
        System.out.println("Объединение: " + union(set1, set2));
        //Пересечение множеств intersection
        System.out.println("Пересечение: " + intersection(set1, set2));
        //Разность множеств difference
        System.out.println("Разность: " + difference(set1, set2));
    }

    // Объединение множеств addAll()
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    // Пересечение множеств retainAll()
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    // Разность множеств removeAll()
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new HashSet<>(set1);
        resultSet.removeAll(set2);
        return resultSet;
    }

}
