package homework_46.task_01;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.04.2025)
 */
/*
Task 1
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.

Для совпадающих ключей значение можно брать из любой карты
//Output
banana: 20
cherry: 30
 */
public class Task1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        // Предикат для проверки наличия ключа
        Predicate<String> isCommonKey = key -> map2.containsKey(key);
        //Predicate<String> isCommonKey = map2::containsKey;

        map1.forEach((key, value) -> {
            if (isCommonKey.test(key)) {
                result.put(key,value);
            }
        });

        return result;
    }
}
