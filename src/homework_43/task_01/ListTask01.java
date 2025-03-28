package homework_43.task_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.03.2025)
 */
/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
public class ListTask01 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.addAll(List.of(10, 25, 47, 38, 100, 98, 57, 835, 88, 0));
        list2.addAll(List.of(25, 67, 0, 35, 1000, 298, 507, 38, 12, 47));

        List<Integer> result = returnRetainElements(list1, list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("========================================");
        System.out.println("Result: " + result);

    }

    public static <T >List<T> returnRetainElements(List<T> list1, List<T> list2) {

        List<T> newList = new ArrayList<>(list1);
        newList.retainAll(list2);

        return newList;

    }


}
