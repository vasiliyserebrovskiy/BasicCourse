package lesson_33.iterator;

import java.util.Iterator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.03.2025)
 */

/*
    Есть 2 интерфейса Iterable и Iterator
    1. Iterable<T> - если клас реализует этот интерфейс, это означает что объекты этого класса можно последовательно перебирать (итерироваться по ним)
     Ровно один абстрактный метод: Iterator<T> iterator() - метод возвращает итератор для этого набора элементов (для этой коллекции)
    2. Iteratoр<T> - позволяет обходить коллекцию
        - boolean hasNext() - есть ли следующий элемент
        - T next() - возвращает следующий элемент
        - void remove() - удаляет последний возвращенный элемент. Метод не обязательный для переопределения.
 */
public class IteratorExample {

    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);

        }

        // for each
        // for (Тип переменно имя переменной : коллекция)
        System.out.println("=================");
        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);
        // Вывести все числа, которые есть в списке умноженные на два

        for (Integer myInt : integers) {
            System.out.println("myInt*2 = " + myInt * 2);
        }

        System.out.println("===========");
        int[] myArray = {10, 20, 30, 40, 50};
        for (int num : myArray) {
            System.out.println("num*2 = " + num * 2);
        }


    }

}
