package lesson_32.hw_31;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.03.2025)
 */
public class MagicArrayListApp {

    public static void main(String[] args) {


        MagicArrayList<Integer> list = new MagicArrayList();

        Integer[] array2 = list.toArray();

        System.out.println(Arrays.toString(array2));

        System.out.println(list);
        list.add(10);
        list.addAll(20,30,40,50);
        System.out.println(list);

        Integer[] array = list.toArray();

        System.out.println(Arrays.toString(array));

        // Стирание типов при работе с дженериками
        // Type Erasyre - информация о типах дженериков удаляется во время компиляции
        /*
        Во время компиляции:
            1. Проверка типов.
            2. Стирание типов: удаление информации о параметрах типов
            3. происходит добавление приведения типов, где это необходимо.
         */



       /* System.out.println("========== Integer ===========");
        Integer[] myInt = {2, 10, 13};
        MagicArrayList<Integer> myIntegers = new MagicArrayList<>(myInt);
        System.out.println("myIntegers = " + myIntegers);
        MagicArrayList<Integer> myIntegers2 = new MagicArrayList<>();
        System.out.println("myIntegers2 isEmpty = " + myIntegers2.isEmpty());
        myIntegers2.addAll(23, 24);
        myIntegers2.add(55);
        System.out.println("myIntegers2 = " + myIntegers2);
        System.out.println("myIntegers size = " + myIntegers.size());
        System.out.println("myIntegers2 indexOf 23 = " + myIntegers2.indexOf(23));
        myIntegers2.add(23);
        System.out.println("myIntegers2 = " + myIntegers2);
        System.out.println("myIntegers2 lastIndexOf 23 = " + myIntegers2.lastIndexOf(23));
        System.out.println("myIntegers2 contains 23 = " + myIntegers2.contains(23));
        System.out.println("myIntegers2 contains 50 = " + myIntegers2.contains(50));
        System.out.println("isEmpty = " + myIntegers2.isEmpty());
        Integer x = 55;
        System.out.println("remove by index 0 = " + myIntegers2.remove(0));
        System.out.println("myIntegers2 = " + myIntegers2);
        System.out.println("remove by value 55 = " + myIntegers2.remove(x));
        System.out.println("myIntegers2 = " + myIntegers2);
        x = 555;
        System.out.println("remove by value 555 = " + myIntegers2.remove(x));

        System.out.println("get element by id 1 = " + myIntegers2.get(1));
        myIntegers2.set(1, x);
        System.out.println("myIntegers2 = " + myIntegers2);


        System.out.println("\n========== String ==================");
        MagicArrayList<String> myStrings = new MagicArrayList<>();
        System.out.println("isEmpty = " + myStrings.isEmpty());
        myStrings.addAll("String 1", "String 2", "String 3");
        System.out.println("myStrings = " + myStrings);
        String str = "String 1";
        System.out.println("remove by value \"str\" " + myStrings.remove(str));
        System.out.println("remove by value \"String 1 \" = " + myStrings.remove("String 1"));
        System.out.println("myStrings = " + myStrings);
        System.out.println("remove by index 0 = \"" + myStrings.remove(0) + "\"");
        System.out.println("myStrings = " + myStrings);
        System.out.println("remove by index 5 = " + myStrings.remove(5));
        System.out.println("myStrings = " + myStrings);
        System.out.println("myStrings contain \"String 5\" = " + myStrings.contains("String 5"));
        System.out.println("myStrings contain \"String 3\" = " + myStrings.contains("String 3"));
        System.out.println("isEmpty = " + myStrings.isEmpty());

        System.out.println("================");*/



    }
}
