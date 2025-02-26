package lesson_22;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.02.2025)
 */
public class Les22Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        // [1, 3, 66, 5, 4]

        MagicArray magic = new MagicArray();
        System.out.println(magic.toString());
        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6, 7, 8);
        magic.add(10, 20, 30);

        System.out.println("В массиве сейчас " + magic.size() + " элементов");
        System.out.println("toString = " + magic.toString());

        System.out.println("вывод 1 элемента массива = " + magic.getElement(1));
        System.out.println("вывод 15 элемента массива = " + magic.getElement(15));
        System.out.println("вывод -1 элемента массива = " + magic.getElement(-1));

        magic.test();

        System.out.println("Удаляем элемент по 3 индексу " + magic.remove(3));
        magic.test();
        System.out.println(magic.size());
        magic.add(1000);
        magic.test();

        System.out.println("\n==================\n");
        System.out.println("Ищем 20 = " + magic.indexOf(20));
        System.out.println("Ищем 200 = " + magic.indexOf(200));
        int index = magic.indexOf(200);
        if (index >= 0) {
            System.out.println("Значение найдено");
        } else {
            System.out.println("Значение не найдено");
        }

        System.out.println("\n===================== HOME WORK 22 ==============================\n");
        System.out.println("==== Тестируем Конструктор ====");
        int[] testArray = new int[]{20, 10};
        //int[] testArray = new int[]{};
        //testArray = null;
        MagicArray myMagic = new MagicArray(testArray);
        System.out.println("Полученный массив myMagic = " + myMagic.toString());
        System.out.print("Наш  массив целиком = ");
        myMagic.test();
        System.out.println("Позиция курсора = " + myMagic.size());
        myMagic.add(15);
        myMagic.test();
        myMagic.add(40, 20);
        myMagic.test();
        System.out.println("\n==== Тестируем поиск элемента с конца ====\n");
        myMagic.add(60, 50, 20);
        myMagic.test();
        int lastIndex = myMagic.lastIndexOf(20);
        System.out.println("Индекс последнего числа 20 = " + lastIndex);
        System.out.println("Индекс последнего числа 200 = " + myMagic.lastIndexOf(200));
        System.out.println("\n==== Тестируем удаление по значению ====\n");
        boolean isRemoveByValue = myMagic.removeByValue(40);
        System.out.println("Результат removeByValue для 40 = " + isRemoveByValue);
        myMagic.test();
        myMagic.add(13);
        myMagic.test();
        isRemoveByValue = myMagic.removeByValue(1000);
        System.out.println("Результат removeByValue для 1000 = " + isRemoveByValue);
        System.out.println("\n===================== END TEST HOME WORK 22 ==============================\n");
    }
}
