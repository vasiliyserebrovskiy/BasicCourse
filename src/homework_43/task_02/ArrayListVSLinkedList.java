package homework_43.task_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.03.2025)
 */
/*
Task 2 (* Опционально)
Создайте два списка. Один на реализации ArrayList, второй на LinkedList. +
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000. +
Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу +
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка) +
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции) +
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000) Значения наверное все-таки от 0 до 1_000 ?
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
public class ArrayListVSLinkedList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(5000);
        List<Integer> linkedList = new LinkedList<>();

        //Заполняем наши массивы
        fillArray(arrayList);
        fillArray(linkedList);

        System.out.println("=====================================================================================");
        // Получение всех элементов
        System.out.println("Время получения всех значений элементов списка по его индексу для ArrayList: " + getAllElements(arrayList) + " мс");
        System.out.println("Время получения всех значений элементов списка по его индексу для LinkedList: " + getAllElements(linkedList) + " мс");
        System.out.println("=====================================================================================");
        //Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
        System.out.println("Вставка 2_000 новых элементов по случайному индексу в ArrayList: " + insertElementsToRandomIndex(arrayList) + " мс");
        System.out.println("Вставка 2_000 новых элементов по случайному индексу в LinkedList: " + insertElementsToRandomIndex(linkedList) + " мс");
        System.out.println("=====================================================================================");
        //Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
        System.out.println("Удаление 1_000 элементов по случайному индексу из ArrayList: " + deleteElementsFromRandomIndex(arrayList) + " мс");
        System.out.println("Удаление 1_000 элементов по случайному индексу из LinkedList: " + deleteElementsFromRandomIndex(linkedList) + " мс");
        System.out.println("=====================================================================================");
        //Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 1_000)
        System.out.println("Удаление 1_000 элементов по значению (диапазон случайных значений от 0 до 1_000) для ArrayList: " + deleteElementsFromArrayByValue(arrayList) + " мс");
        System.out.println("Удаление 1_000 элементов по значению (диапазон случайных значений от 0 до 1_000) для LinkedList: " + deleteElementsFromArrayByValue(linkedList) + " мс");
        System.out.println("=====================================================================================");
        //Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
        System.out.println("Удаление 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000) для ArrayList: " + deleteElementsFromArrayByValue2(arrayList) + " мс");
        System.out.println("Удаление 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000) для LinkedList: " + deleteElementsFromArrayByValue2(linkedList) + " мс");
        System.out.println("=====================================================================================");
    }

    //Удаление по значению 2
    public static long deleteElementsFromArrayByValue2(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1001; i++) {
            list.remove(Integer.valueOf(random.nextInt(10_001)));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //Удаление по значению
    public static long deleteElementsFromArrayByValue(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1001; i++) {
            list.remove(Integer.valueOf(random.nextInt(1_001)));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Удаление элементов по случайному индексу
    public static long deleteElementsFromRandomIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            list.remove(random.nextInt(5_001));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Вставка элементов по индексу
    public static long insertElementsToRandomIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 2_000; i++) {
            list.add(random.nextInt(5_001), random.nextInt(1_001));
        }


        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //получение всех элементов по индексу
    public static long getAllElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 5_000; i++) {
            int value = list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void fillArray(List<Integer> array) {
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            array.add(random.nextInt(1_001));
        }
    }
}
