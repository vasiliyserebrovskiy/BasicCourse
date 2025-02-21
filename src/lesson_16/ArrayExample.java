package lesson_16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] array; // Объявление массива целых числе
        int array1[]; // Альтернативный способ. не рекомендуется использовать

        String[] strings; // Строковый массив

        //Инициализация массива
        array = new int[4]; // создали или инициализировали целочисленный(типа int) массив на 4 элемента
        strings = new String[10]; // на 10 ячеек

        int[] array2 = new int[8]; // Объявление и инициализация массива типа int на 8 элементов(ячеек в памяти)
        boolean[] bools = new boolean[3]; // булев массив

        // При создании массива(инициализация) при выделении памяти для ячеек. Java автоматом заполняет массив, набором значений по-умолчанию!
        /*
        1. Для числе int, byte, short, long, float, double и char - 0(0.0)
        2. Для boolean - false
        3. Все ссылочные типы данных - null (null - ничто)

         */

        // получить значение в ячейке с индексом 0
        int value = array2[0]; // получение значения по индексу
        System.out.println("array2[0]: " + value); // 0
        System.out.println("array2[0]: " + array2[7]); // 0

        System.out.println("bools[1]: " + bools[1]); // false

        System.out.println("strings[9]: " + strings[1]); // null

        // Вернет адрес на область памяти а не элементы массива
        System.out.println("array: " + array2);
        System.out.println("array: " + Arrays.toString(array2));

        int[] numbers = new int[]{45, 46, -16, 0, 159}; // Создаем массив, размером равным количеству элементов в {}
        int[] ints = {-10, 54, 32, 333, 444}; // короткая форма явной инициализации (не всегда работает - для методов не годиться)

        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 345;
        System.out.println("numbers[2]: " + numbers[2]);

        int len = numbers.length;
        System.out.println("numbers.length = " + len);


        System.out.println("===== ===== ===== =====");
        //Перебрать индексы от i до length() -1
        System.out.println("Вывести все значения массива:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();
        // Создать массив на 10 элементов и записать в него случайные 10 чисел от 0 до 100

        int[] num = new int[10];
        Random random = new Random();
        int idx = 0;
        System.out.println("[");
        while (idx < num.length) {
            num[idx] = random.nextInt(101);
            System.out.print( num[idx] + ", ");
            idx++;
        }
        System.out.println("]");


        //-----------------------------------------------

       /* System.out.println("===== ===== standart for ===== ===== ");
        for(int j=0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();
        System.out.println("===== ===== enchanced for ===== ===== ");*/

        /*
        for (int numb : numbers) {
            System.out.print(numb + ", ");
        }
        */


        // В массиве num найти минимальный элемент
        int min = num[0];
        i = 0;
        while (i < num.length) {
            if (num[i] < min ) min = num[i];
            i++;
        }

        System.out.println("Минимальный элемент в массиве равен: " + min);

    }
}
