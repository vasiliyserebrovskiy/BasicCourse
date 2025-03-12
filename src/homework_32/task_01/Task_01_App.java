package homework_32.task_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа. +

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T. +
Методы:
T getFirst() — возвращает первый элемент. +
T getSecond() — возвращает второй элемент. +
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */
public class Task_01_App {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World
        pair.swap();
        System.out.println("======");
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
        pair.setFirst("First Element");
        pair.setSecond("Second Element");

        System.out.println(pair);

        System.out.println("\n==============");

        Pair<Integer> intPair = new Pair<>(124, 256);
        System.out.println(intPair.getFirst());
        System.out.println(intPair.getSecond());
        intPair.swap();
        System.out.println("======");
        System.out.println(intPair.getFirst());
        System.out.println(intPair.getSecond());
        intPair.setFirst(1024);
        intPair.setSecond(512);
        System.out.println(intPair);


    }
}
