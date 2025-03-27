package lesson_43;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.03.2025)
 */
public class ListExamples {
    public static void main(String[] args) {

        //Конструкторы ArrayList

        List<Integer> list = new ArrayList<>(); //Создается пустой массив (начальный рамер 10 элементов)
        list = new ArrayList<>(50); // С указанной емкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); //конструктор принимает коллекцию.

        //Конструкторы LinkedList

        list = new LinkedList<>(); // Создает пустой список (внутренняя реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // принимает коллекцию

        //Методы интерфейса List

        // boolean add(E e) - добавляет элемент в конец списка
        list.add(1000);
        System.out.println("list = " + list);
        list.add(-100);
        System.out.println("list = " + list);

        // void add(int index, E element) - добавляет элемент на указанную позицию
        list.add(3, 500);
        System.out.println("list = " + list);

        // E get(int index) - получение элемента по индексу
        int value = list.get(5);
        System.out.println("value = " + value);

        // два remove
        // E remove(int index) - удаление по индексу и возврат старого значения
        value = list.remove(5);
        System.out.println("value = " + value);
        System.out.println("list = " + list);

        //boolean remove(Object obj) - адаление по значению, возврат результата удаления(в наследство от Collection)
        System.out.println("list.remove(0) = " + list.remove(Integer.valueOf(0)));
        System.out.println("list = " + list);

        // Поиск элемента по значению, возвращает индекс indexOf()
        // int indexOf(Object o) - ищем первое вхождение
        System.out.println("list.indexOf(4000) = " + list.indexOf(4000)); // -1 - значение не найдено
        System.out.println("list.indexOf(-100) = " + list.indexOf(-100)); // 4 - значение не найдено

        System.out.println("list.lastIndexOf(-100) = " + list.lastIndexOf(-100)); //последнее вхождение
        System.out.println("===== Sort");
        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора
        list.sort((i1, i2) -> Integer.compare(i2, i1));
        //list.sort(Comparator.reverseOrder()); - // тот же результат что и #60
        System.out.println("Sort list = " + list);

        list.sort(Integer::compareTo);
        System.out.println("list = " + list);

        list.sort(Comparator.naturalOrder());

        // Получение нового списка, List<E> subList(indexFrom, indexTo) - метод возвращает список из указанных элементов, от индекса до индекса(без последнего элемента)
        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList(1,5) = " + subList);

        System.out.println("====================");
        Deque<Integer> deque = new ArrayDeque<>();


    }
}
