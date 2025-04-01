package homework_45;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (31.03.2025)
 */
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку

//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов:
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3;
 */
public class FrequencyDictionary {
    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        System.out.println("\nВхождение слов: ");
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();

        //вариант с compute
        System.out.println("compute 3: " + frequencyDictionary3(text));
        System.out.println("compute 4: " + frequencyDictionary4(text));
        System.out.println("compute 5: " + frequencyDictionary5(text));

    }

    //Метод для подсчета количества строк в строке
    public static Map<String, Integer> frequencyDictionary(String string) {
        Map<String, Integer> myMap = new TreeMap<>();
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        for (String word : words) {
            myMap.put(word, myMap.getOrDefault(word, 0) + 1);
        }

        return myMap;
    }

    //Метод для подсчета количества букв в строке
    public static Map<Character, Integer> frequencyCharsDictionary(String string) {
        Map<Character, Integer> symbolMap = new TreeMap<>();

        for (char symbol : string.toCharArray()) {
            symbolMap.put(symbol, symbolMap.getOrDefault(symbol, 0) + 1);
        }

        return symbolMap;
    }

    //Методы merge и compute - методы используются для вычисления новых значений в карте, на основе ключа и текущего значения
    public static Map<String, Integer> frequencyDictionary3(String string) {
        Map<String, Integer> myMap = new TreeMap<>();
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        for (String word : words) {
            //myMap.put(word, myMap.getOrDefault(word, 0) + 1);
            /*
            compute(K key, BiFunction<K,V> remapping Function)
            Метод compute позволяет вычислить новое значение ключа использую функцию пересчета.
            новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то запись(пара) с текущим ключем удаляется из карты
             */

            //oldValue=myMap.get(word=kye);
            myMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        return myMap;
    }

    public static Map<String, Integer> frequencyDictionary4(String string) {
        Map<String, Integer> myMap = new TreeMap<>();
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        for (String word : words) {
            //myMap.put(word, myMap.getOrDefault(word, 0) + 1);
            /*
            compute(K key, BiFunction<K,V> remapping Function)
            Метод compute позволяет вычислить новое значение ключа использую функцию пересчета.
            новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то запись(пара) с текущим ключем удаляется из карты
             */

            // Метод вычисляет новое значение для ключа, только если ключ не присутствует в карте или возвращает null
            myMap.computeIfAbsent(word, key -> 0); // можно тут оставить 1, тогда computeIfPresent нужно выполнять раньше(до этого вызова)
            // myMap.put(word,1);

            //computeIfPresent - вычисляет новое значение только если ключу было ассоциировано какое-то не null значение
            myMap.computeIfPresent(word, (key, value) -> value + 1);

        }

        return myMap;
    }

    public static Map<String, Integer> frequencyDictionary5(String string) {
        Map<String, Integer> myMap = new TreeMap<>();
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        for (String word : words) {

            /*
            merge(K key, V newValue, BiFunction<K, V> remappingFucntion)
            Метод merge используется для объединения значений по ключу
            - Если ключа нет или метод вернул null, новая пара key:value вставляется в карту
            - если ключ уже существует и вернул не null, примениться функция объединения, которая может использовать старое и новое значение
             */
            myMap.merge(word, 1, (oldValue,newValue) -> oldValue + newValue);
            //myMap.merge(word, 1, Integer::sum);


        }

        return myMap;
    }

}
