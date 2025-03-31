package lesson_45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (31.03.2025)
 */
public class MapExamples {
    public static void main(String[] args) {

        //Map<K, V> K - ключ V - значение

        //Коллизия - разные ключи приводят к одной ячейке(одинаковый хэшкод и/или одинаковый номер ячейки)

        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная, не рекомендуется к использованию

        Map<String, String> phoneBook = new HashMap<>();

        // добавить пару ключ + значение
        // put(K key, V value) -> возвращает старое значение, соответствующее ранее этому ключу
        // если ранее такого ключа не было, возвращает null
        System.out.println(phoneBook.put("Hanna", "49-11111"));
        phoneBook.put("Max", "49-22222");
        phoneBook.put("John", "49-33333");

        System.out.println("phoneBook: " + phoneBook);

        String oldValue = phoneBook.put("John", "49-44444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);


        //Все map допускают использования null как ключа
        // map допускает хранения null как значение
        phoneBook.put(null, "49-00000");
        System.out.println("phoneBook = " + phoneBook);

        //putAll() - принимает карту (Мар) и копирует все парв ключ-значение из этой карты
        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "49-55555");
        book2.put("Michael", "49-66666");

        phoneBook.putAll(book2);
        System.out.println("phoneBook = " + phoneBook);

        // boolean containsKey(Object key) - вернет true если карта содержит такой ключь
        // boolean containsValue(Object value) - вернет true если карта содержит хотя бы одно такое значение
        System.out.println("phoneBook.containsKey(\"Michael\"): " + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\"): " + phoneBook.containsKey("123"));
        System.out.println("phoneBook.containsValue(\"49-44444\"): " + phoneBook.containsValue("49-44444"));

        System.out.println("========== GET ======");
        //Взятие значения по ключу
        // V get (K key) - возвращает значение по ключу. Если ключа нет вернет null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);
        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY"));

        // getOrDefault(Object key, defaultValue) - возвращает значение по ключу. Если ключа нет, вернет значение по-умолчанию(2 параметр)
        String val2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("print val2 = " + val2);
        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("val2 2 : " + val2);

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));
        System.out.println("===== Конструкторы ======");
        // Конструкторы
        Map<Integer, String> construct = new HashMap<>(); //пустой конструктор, создается пустой список пар Ключ - значение.
        // 16 корзин и коэффициент заполнения 0.75
        construct = new HashMap<>(30); // Создается пустой словарь, с 32 корзинами. Коэффициент заполнения 0.75
        construct = new HashMap<>(32, 0.90f);// указание коэффициента заполненности

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");
        construct = new HashMap<>(otherMap);
        System.out.println("construct : " + construct);

        //remove(Object key) - возвращает старое значение, если оно было. Если пары не было вернет null
        //boolean remove(Object key, Object value) - удаляет пару ключ-значение только если и ключ и значение соответствуют текущим в Мар. вернет true

        System.out.println("phoneBook.remove(\"John\", \"49-0000\"): " + phoneBook.remove("John", "49-0000"));
        System.out.println("phoneBook.remove(\"John\", \"49-44444\"): " + phoneBook.remove("John", "49-44444"));
        System.out.println("phoneBook:" + phoneBook);

        System.out.println("phoneBook: " + phoneBook);
        System.out.println("phoneBook.remove(\"Sebastian\"): " + phoneBook.remove("Sebastian")); // Ключ есть. Удалит пару и вернет старое значение.
        System.out.println("phoneBook: " + phoneBook);
        System.out.println("phoneBook.remove(\"Sebastian\"): " + phoneBook.remove("Sebastian")); // Ключ нет. Вернет null.

        // void clear() - очищает карту
        //size() - количество пар key - value

        System.out.println("phoneBook.size(): " + phoneBook.size());
        // boolean isEmpty() - возвращает true, если пустой

    }
}
