package consultation_20;

import java.util.List;
import java.util.Optional;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
public class ReduceExample {
    /*
    Аккумулирующие методы
    Эти методы используются для вычисления одного значения на основании данных потока(и некоего начального значения)

    Optional<T> reduce(BinaryOperator<T> accumulator) - выполняет свертку(аккумулирование) элементов потока

    T reduce(T identity, BinaryOperator<T> accumulator) - выполняет свертку(аккумулирование) элементов потока.
    На первой итерации поместиться начальное значение

    BinaryOperator<T> - функциональный интерфейс, который является специальной формой интерфейса BiFunction<T, T, T>
    используется когда два объекта одного типа объединяются и возвращается объект того же типа.

     */

    public static void main(String[] args) {

        //task1();
        //task2();
        task3();


    }

    private static void task3() {
        // Можно использовать для нахождения максимума. Происходить не накопление, а замена значения переменной
        List<String> strings = List.of("Java", "longest string","Kotlin", "Python");

        Optional<String> longest = strings.stream()
                .reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println("longest = " + longest);

    }

    private static void task2() {
        List<String> strings = List.of("Java", "Kotlin", "Python");

        Optional<String> concat = strings.stream()
                .reduce((str1, str2) -> str1 + " " + str2);

        System.out.println("concat = " + concat);

        String concat2 = strings.stream()
                .reduce("", (str1, str2) -> str1 + " " + str2);

        System.out.println("concat2 = " + concat2);



    }

    private static void task1() {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Посчитать сумму всех элементов, которые кратны 3

        //res = 3(1) res = 9 (2) res = 18(3) res = 30(4) res = 45(4)
        // 3, 6, 9, 12, 15
        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0 )
                .reduce((i1, i2) -> i1 + i2);

        System.out.println("sum = " + sum);

        // тут возвращаем сразу Integer, так как указываем первоначальное значение, то там точно не пусто
        Integer sum2 = integers.stream()
                .filter(i -> i % 3 == 0 )
                .reduce(0, Integer::sum);

        System.out.println("sum2: " + sum2);

    }
}
