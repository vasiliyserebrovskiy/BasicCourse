package lesson_47;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson_47.Cat;


/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.04.2025)
 */

/*
    Stream API - встроенный инструмент позволяющий обрабатывать наборы данных в декларативном стиле.(В функциональном стиле)
    (До этого писали в императивном стиле. Четко прописан цикл, что и как мы делаем)

    Основные идеи - преобразование последовательности элементов через набор операций.
    Stream (поток) - поток данных, представляет собой последовательность элементов.

    Поток дает возможность поочередного получения элементов для обработки.
    Стримы могут быть созданы из различных источников. (коллекции, массивы, файлы, консоль и т.д. и т.п.)
    Поток - это способ получения и обработки данных.
    PipeLine - последовательность операций, выполняемых на потоке.

    1. Промежуточные операции / методы (Intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток).
        Их может быть много. (больше чем одна)

    2. Терминальные операции /методы - это операции, которые запускают обработку потока и закрывают его(поток).
        После выполнени терминальной операции поток перестает быть доступным для дальнейшей обработки.
        Может быть ТОЛЬКО один!

    Ленивые вычисления
        стримы не выполняют промежуточные методы, пока не будет вызван терминальный метод на них.


 */
public class StreamExample {

    /*
    Промежуточные методы - все возвращают поток.
    1 Stream<T> filter(Predicate<T> predicate) - оставляетв потоке, только те элементы для которых предикат вернет true.
    Т.е. оставляет элементы удовлетворяющие указанному условию. (отбрасывает элементы не удовлетворяющие условию)

    2 sorted() - сортирует поток в естественном порядке.
    sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора

    3 Stream<R> map(Function<T,R> action) - преобразует элементы потока, с использованием заданной функции, в том числе в другой тип данных. (в новый поток)
    4 Stream<T> peak(Consumer<T> action) - выполняет действие для каждого элемента потока и как правило не изменяющая элемент. (часто используется для логирования или печати в консоль)
    5 distinkt() - удаляет дубликаты из потока
    ---------

    Терминальные методы
    1 R collect(Collector<T,A,R> collector) - метод преобразует элементы потока, в разные виды коллекций или другие структуры данных.
    2 void forEach(Consumer) - выполняет заданное действия, для каждого элемента потока
     */

    public static void main(String[] args) {

        //task1();
        // task2();
        // task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //  task8();
        //task8_1();
        //task9();
        task10();

    }

    private static void task10() {
        // Удалить повторяющиеся значения из списка
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> uniq = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniq);

        System.out.println("============================");

        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);

        cats.forEach(System.out::println);
        System.out.println("=== Filter ===");
        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9() {
        // создание стима из Map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println(map);

    }

    private static void task8_1() {
        //проверка на null в List.of нельзя передавать null!
    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2, new Cat(null, 10, "green"), cat3};
        // Получить список кошек, имя которых длиннее 4 символов
        // Arrays.stream(cats) - создает поток из элементов массива
        List<Cat> longCats = Arrays.stream(cats)
                //.filter(c -> c != null) // оставить в потоке только не null
                //.filter(c -> Objects.nonNull(c)) // оставить в потоке только не null
                .filter(Objects::nonNull) // оставить в потоке только не null
                .filter(c -> Objects.nonNull(c.getName())) // проверка поля на null
                .filter(c -> c.getName().length() > 4)
                //.filter(c -> c != null && c.getName().length() > 4)
                .collect(Collectors.toList());

        /*
        Два метода из Objects
        Objects.nonNull(Object o) - вернет true если параметр не null
        Objects.isNull(Object o) - вернет true если параметр равен null
         */

        System.out.println(longCats);
    }

    private static void task7() {
        List<Cat> cats = getListCats();

        //Вывести на экран имена котов чей вес < 5
        // вывести на экран котов, оставшихся в потоке после фильтрации

        /*
        peak() - промежуточный метод, используется в основном для отладки. Не закрывает поток.
        forEach() - терминальный метод. Для выполнения действия с каждым элементом потока, закрывает поток.
         */
        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() < 5)
                //.peek(System.out::println)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        catStream.forEach(name -> System.out.println("name: " + name));

    }

    private static void task6() {
        List<Cat> cats = getListCats();

        // Получить список имен кошек, у которых имя короче 5 символов

        /*
        Классический подход - методы фильтрации должны выполняться в потоке как можно раньше
        Эфективность
         */
        List<String> names = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("names: " + names);
        System.out.println("================");
        // В угоду читаемости и понимания кода
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println("names2: " + names2);

    }

    private static void task5() {
        List<Cat> cats = getListCats();

        // Получить список имен кошек, чей вес больше 4
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames (weight > 4): " + catNames);

    }

    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames: " + catNames);

        // Изначальная коллекция(источник данных для потока) не изменяется
        System.out.println(cats);

       /* List<String> listNames = new ArrayList<>();
        for(Cat cat : cats) {
            listNames.add(cat.getName());
        }*/


    }

    private static void task3() {
        List<Cat> cats = getListCats();

        //Оставить котов с именем, длиннее 4 символов
        Stream<Cat> longNameStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> longNames = longNameStream.collect(Collectors.toList());
        System.out.println("longNames: " + longNames);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // Список кошек с весом болше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println("fatCats: " + fatCats);

        // Повторно использовать закрытый поток нельзя! Закрытый поток - это поток, на котором уже был вызван терминальный метод
        //List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка

    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {

        List<Integer> integers = List.of(-1, 12, 0, 5, -15, 24, 99);
        // Получить список, содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания
        List<Integer> result = new ArrayList<>();
        //Четкий императивный список
        for (Integer num : integers) {
            if (num > 0) result.add(num);
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        System.out.println("==================");
        // У всех коллекций есть метод .stream() создающий поток(стрим) из элементов коллекций.
        List<Integer> integerList = integers.stream() // создание поток из элементов коллекции список List
                .filter(e -> e > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов потока в естественном порядке
                .collect(Collectors.toList()); // собирает все элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);
    }

} //END CLASS
