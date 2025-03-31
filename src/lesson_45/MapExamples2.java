package lesson_45;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (31.03.2025)
 */
public class MapExamples2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println("map: " + map);

        //Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values() = " + values);

        //Set<K> keySet() - возвращает Set, состоящий из всех ключей карты

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet() = " + keys);

        // могу перебрать ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();

        /*
        Фокус: живая связь
        Метод keySet() и values() возвращают view map() (представление / проекция) соответствующих ключей и значений карты.
        Эта проекция поддерживается самой картой, что означает, что они напрямую связаны с внутренними данными map.
        Поэтому любые изменения, внесенные в эти представления отражаются на самой карте. Причем эта связь двусторонняя.

         */
        //удаляем ключ из set ключей
        keys.remove(17);

        System.out.println("keys: " + keys);
        System.out.println("map : " + map);
        System.out.println("values: " + values);
        System.out.println("================");
        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        System.out.println("====== Map.remove() ====");
        map.remove(16);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("======================");
        //удалить все пары с такими значениями
        values.removeAll(List.of("red"));
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);


        System.out.println("===========================");
        // Если мы хотим разорвать связь - нужно копировать элементы в другие коллекции
        Set<Integer> keysCopy = new HashSet<>(map.keySet());
        keysCopy.remove(0);
        System.out.println("keysCopy:"+keysCopy);
        System.out.println("map: " + map);

        System.out.println("============= Map.Entry ==============");
        // Set<Map.Entry<Integer,String>> - entrySet() - возвращает set вхождений всех пар ключ-значение
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.print("entry: " + entry + " -> ");
            System.out.print("entry.getKey(): " + entry.getKey() + " | ");
            System.out.println("entry.getValue(): "+ entry.getValue());
        }
        // тоже живая связь
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("Java");
            }
        }


        //forEach - перебор всех пар ключ значение с возможностью применить к ним какую-то функцию
        System.out.println("map" + map);
    }
}
