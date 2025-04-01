package lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.04.2025)
 */
// Stream API. Функциональные интерфейсы Function, Predicate, Consumer являются частью Java Lambda expression, введенных в Java 8.
// Имплементации этих интерфейсов применяются, когда метод принимает интерфейс в качестве параметра.
public class InterfacesExample {
    public static void main(String[] args) {

        // Consumer<T> - выполняет операцию над объектом <T> не возвращая никакого результата
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "!!!");
            }
        };

        example = str -> System.out.println(str + "!!!");

        example.accept("Hello World");
        example.accept("Java");

        // Составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = str -> System.out.println("2. " + str + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);

        resultConsumer.accept("Test");

        System.out.println("==================");
        // Predicate<T> - проверка объекта на соответствие условию. (Тестирование объекта)
        // boolean test(T t) - основной (абстрактный) если подходит вернет true

        /*
         and() - логическое И
         or() -  логическое ИЛИ
         negate() - логическое отрицание
         */

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        Predicate<String> isShort = str -> str.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println("result: " + result);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        System.out.println("==================");
        List<Integer> myList = new ArrayList<>(List.of(-1, 0, 34, 25, -12, 45, 67, -3, 7, 8, 12, 36, 4));
        // Список всех отрицательных чисел
        List<Integer> res = filterListByPredicate(myList, integer -> integer < 0);
        System.out.println("Res: " + res);
        res = filterListByPredicate(myList, integer -> integer % 2 != 0);
        System.out.println("res 2: список нечетных чисел" + res);

        // Список все четных чисел > 5
        res = filterListByPredicate(myList, i -> i % 2 == 0 && i > 5);
        System.out.println("Список четных чисел больше 5: " + res);

        System.out.println("====================");
        Predicate<String> isLongString = str -> str.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        Predicate<String> combinePredicate = isLongString.and(isContainsJava);

        String word = "Java!";
        System.out.println("combinePredicate.test(word): " + combinePredicate.test(word));

        Predicate<String> combine2 = isContainsJava.negate();
        System.out.println("combine2.test(word): " + combine2.test(word));

        System.out.println("=============== Function ================");
        //Function<T, R> - производит операцию над объектом Т, возвращает результат типа R
        // R apply(T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 0;
            }
        };

        integerFunction = str -> str.length();

        int len = integerFunction.apply("Hello world");
        System.out.println("len : "+len);

        Function<String, String> toUpper = str -> str.toUpperCase();
        //Function<String, String> toUpper = String::toUpperCase;
        System.out.println("toUpper.apply(\"Hello world\"): "+toUpper.apply("Hello world"));



    } // END Class

    // Метод должен возвращать список объектов, удовлетворяющих условию / прошедших проверку придикатом
    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
