package lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.03.2025)
 */
public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection - гарантирует наличие базовых методов, для всех расширяющих его интерфейсов(List, Queue, Set)
        // Это позволяет единообразно обрабатывать различные виды коллекций

        // Когда мы работаем с коллекциями, ссылка всегда ТИПА ИНТЕРФЕЙС
        // Тип ссылки определяет набор доступных методов, и ссылку на какой объект класса, может хранить эта переменная
        // Создаем коллекцию строк

        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size() = " + strings.size());

        // boolean isEmpty() - true если коллекция пуста
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        // boolean add(T t) - добавления элемента
        strings.add("Java");
        //strings.add("Python")
        System.out.println("strings.add(\"Python\") = " + strings.add("Python"));

        // Переопределенный метод toString(), для красивово вывода элементов коллекции
        System.out.println("strings = " + strings);
        // Статический метод .of() - метод в нескольких интерфейсов и классах JFC (введен sdk 9 и выше)
        // создает не изменяемую коллекцию из предоставленных элементов
        // Ljcnegty lkz List, Set и Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6);
        System.out.println("Integers = " + integers);
        //integers.add(7); // попытка модифицировать, изменить - приведет к ошибке (Исключительная ситуация)


        // addAll(Callection<? extends T> collection) - добавит все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Go Land", "Ruby", "Kotlin", "PHP"));
        System.out.println("strings = " + strings);

        // removeAll(Collection<b>) - удаляет все элементы, содержащиеся в коллекции B из коллекции, на которой вызван метод
        // colA.remove(colB) - удаляет из А элементы, которые содержит кол-я В
        // методы addAll(),removeAll(), retainAll() - это программная реализация математических операций над множествами
        // addAll - сложение множеств
        // removeAll - вычитание

        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        colA.removeAll(List.of(3, 2, 1));
        System.out.println("colA.removeAll(b) = " + colA);

        // Пересечение retainAll(Collection<B>) В коллекции вызова, остаются только те элементы, которые содержаться в коллекции В

        // colA.retainAll(colB) - оставляет в А только те элементы, которые есть в В
        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("colA = " + colA);
        System.out.println("colB = " + colB);
        colA.retainAll(colB);
        System.out.println("colA retain colB = " + colA);

        // ContainsAll(Collection<T>) - возвращает true если коллекция содержит все элементы коллекции В
        System.out.println(colA);
        System.out.println("colA.contains(List.of(20,30)) = " + colA.containsAll(List.of(20, 30)));


        // boolean remove(Object obj) - удаляет элемент из коллекции, возвращает true если элемент найден и удален

        System.out.println("colA.remove(100) = " + colA.remove(100));
        System.out.println("colA.remove(20) = " + colA.remove(20)); // Удалит одно значение(даже если элемент с таким значением несколько)
        System.out.println("colA = " + colA);
        //System.out.println("colA.removeAll(List.of(20)) = " + colA.removeAll(List.of(20))); // Удалит одно значение(даже если элемент с таким значением несколько)
        System.out.println("colA = " + colA);

        //clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA = " + colA);


    }
}
