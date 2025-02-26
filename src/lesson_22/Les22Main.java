package lesson_22;

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
        System.out.println("toString = "+magic.toString());

        System.out.println("вывод 1 элемента массива = " + magic.getElement(1));
        System.out.println("вывод 15 элемента массива = " + magic.getElement(15));
        System.out.println("вывод -1 элемента массива = " + magic.getElement(-1));

        magic.test();

        System.out.println("Удаляем элемент по 3 индексу " + magic.delete(3));
        magic.test();
        System.out.println(magic.size());
        magic.add(1000);
        magic.test();

        System.out.println("\n==================\n");
        System.out.println("Ищем 20 = " + magic.indexOf(20));
        System.out.println("Ищем 200 = " + magic.indexOf(200));
        int index = magic.indexOf(200);
        if (index >= 0 ){
            System.out.println("Значение найдено");
        } else {
            System.out.println("Значение не найдено");
        }

    }
}
