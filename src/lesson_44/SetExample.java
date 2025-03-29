package lesson_44;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.03.2025)
 */
public class SetExample {
    public static void main(String[] args) {

        String str = "abc";
        //str.hashCode();
        System.out.println("str = " + str.hashCode());

        String str2 = "abc";
        System.out.println(str.equals(str2));
        System.out.println(str2.hashCode());
        /*
        Для корректной работы хэш коллекций есть важное правило: контракт между методами hashCode() и equals()
        1. Если два объекта равны по методу equals(), то их хэш коды hashCode() должны быть равны
        2. Если хэш коды двух объектов различны, то объекты точно не должны быть равны по equals.
        (обратное не всегда верно. Коллизия - разные объекты могут иметь одинаковые хэш коды)
        3. Многократный вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на не измененном объекте.
         */
        System.out.println("==========================");
        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создается пустой хэш сет. Емкостью 16 и коэффициент заполнения 0.75
        set = new HashSet<>(20); // Создается пустой хэш сет с указанной емкостью
        // Принимает коллекцию - создает новый сет, содержащий уникальные элементы из указанной коллекции.
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, -10, 5, 6, -25, 3, 6, -4, 0));

       /* Integer value = 100;
        System.out.println(value.hashCode());*/
        System.out.println("set: " + set);

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);

        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("HashSet integers = " + integers);

        // LinkedHashSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet = " + linkedSet);
        System.out.println("===============");
        // Методы интерфейса Set
        // boolean add(E e) - добавление элемента
        System.out.println("add(100) = " + integers.add(100)); //true - added to Set
        System.out.println(integers);
        System.out.println("add(100) = " + integers.add(100)); // false - already exist in Set
        System.out.println(integers);

        System.out.println("===============");
        // Удаление boolean remove(Object obj) - удаляет элемент по значению
        System.out.println("delete(100) = " + integers.remove(100)); // true - fined and delete
        System.out.println(integers);

        // Поиск boolean contains(Object obj) - проверяет присутствие элемента в множестве
        System.out.println("integers.contains(100) = " + integers.contains(100)); // false
        System.out.println("integers.contains(32) = " + integers.contains(32)); // true

        /*
        int size() - возвращает количество элементов в Set
        boolean isEmpty() - true если Set пустой
        clear() - удаляет все элементы
         */

        System.out.println("===============");

        // перебор только итератором возвращает итератор, для элементов Set
        // Наличие итератора позволяет последовательно перебирать все элементы последовательно циклом for-each
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        for (Integer value : integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        // Написать метод, который принимает список и возвращает список состоящих только из уникальных элементов изначального списка.
        System.out.println("====================");
        List<Integer> result = getUniqueList(startValues);
        System.out.println("startValues = " + startValues);
        System.out.println("result = " + result);
        result.add(15);
        result.add(15);
        System.out.println(result);

        System.out.println("=====================");

        // SortedSet - расширяет интерфейс Set
        // Элементы упорядочены в соответствии с их естественном порядке(если порядок определен) или в соответствии с компаратором, переданном при создании.
        // Реализован в виде бинарного дерева.

        //SortedSet() Конструкторы
        //Пустой конструктор - естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество. Сортировка в соответствии с реализацией comparable.
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet = " + sortedSet);

        // Принимает коллекцию. Создает set из элементов коллекции, сортировка в естественном порядке.

        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet (startValues) = " + sortedSet);

        System.out.println("=============================");
        // Конструктор с компаратором, определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // обратный порядок сортировки

        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet = " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);
        System.out.println("treeSet = " + treeSet);
        System.out.println("==================");
        treeSet = new TreeSet<>(startValues);
        System.out.println("treeSet = " + treeSet);

        // first() - возвращает первый, левый элемент (наименьший по мнению компаратора)
        System.out.println("treeSet.first() = " + treeSet.first());
        // last() - возвращает последний(правый и максимальный по мнению компаратора)
        System.out.println("treeSet.last() = " + treeSet.last());

        //SortedSet<E> headSet(E element) - возвращает упорядоченное множество, меньше заданного подмножества
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("headSet = " + headSet);

        // Хвост множества SortedSet<E> tailSet(E element) - все элементы, большие или равные элементу
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("tailSet = " + tailSet);

        // SortedSet<E> sunSet(E elementFrom, E elementTo) - возвращает часть множества,  от элемента elementFrom , до элемента elementTo(не включительно)

        SortedSet<Integer> subSet = treeSet.subSet(6,16);
        System.out.println("subSet = " + subSet);

        // comparator() - возвращает компаратор, используемый для упорядочивания элементов в этом множестве.
        // Если используется естественный порядок, то вернется null

        homework("Тестовая 577 строка,    со словами!");

        //Arrays.asList(T[] array) - преобразует массив с список
        List<String> list = Arrays.asList();


    }

    private static void homework(String testStr) {
        // Заменить все не буквы на пробел
        // Заменить символ, который не является буквой, цифрой или пробелом на пустоту
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        System.out.println("new String = " + newString);

        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        List<String> list = Arrays.asList(words);
        System.out.println(list);
    }

    private static <T> List<T> getUniqueList(List<T> startValues) {
        //Set<T> newSet = new HashSet<>(startValues);
        return new LinkedList<>(new LinkedHashSet<>(startValues));
    }
}
