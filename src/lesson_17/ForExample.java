package lesson_17;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */
public class ForExample {
    public static void main(String[] args) {
        // Цикл for
        /*
         for ( <блок инициализации> ; <условие выхода> ; <блок изменений> ) {
            <тело цикла>
         }
         */
        // вывести все числа от 0 до 10
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }

        System.out.println();
        System.out.println("Состояние переменной j: " + j);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("После цикла for");

        // Бесконечный цикл для цикла for - ни один из блоков не является обязательным
        /*for ( ; ; ) {
            System.out.println("Hello, World!");
        }*/
        // Изгаляемся с циклом for пока ждем Сергея
        /*for ( ; j < 15; ) {
            System.out.println("Hello, World!");
            j++;
        }*/

        //int i1 = 5;
        //for (i1 = 0; i1 >= 0; i1 += 100_000) {
        //    System.out.print(i1 + ", ");
        //}
        //System.out.println();
        //System.out.println("Состояние переменной i1: " + i1);

        System.out.println("\n==========================================\n");
        // В блоке инициализации может быть переменная любоготипа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }
        System.out.println("\n==========================================\n");
        // Мы можем инициализировать и изменять любое количество переменных в блоках инициализации и / или изменений
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f + " : ");
        }
        System.out.println("\n==========================================\n");
        // Создать массив целых чисел случайной длинны от 5 до 15
        // заполнить массив случайными числами от -50 до 50

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            //if ( i != ints.length - 1) System.out.print(ints[i] + ", ");
            //else System.out.println(ints[i] + "]");
            System.out.print(ints[i] + (i < ints.length -1 ? ", " : "]\n"));
        }
        // System.out.println("]");
        // System.out.println("Наш массив = " + Arrays.toString(ints));

        // Найти минимальное значение в массиве ints[] и вывести его в консоль
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Минимальное значение в нашем массиве = " + min);

        // по ключевому слову fori - автоматическое заполнение шаблона for
        System.out.println("\n=======================\n");
        // continue, break
        for (int i = 0; i < 7; i++) {
            if (i == 3) continue; // прерывает текущую итерацию цикла и переходит к следующей итерации(в блок изменений)
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 3) break; // прерывает текущую итерацию цикла и работу всего цикла.
            // Все последующие итерации выполнены не будут вне зависимости от условия в блоке проверок
            System.out.print(i + ", ");
        }
        System.out.println();

    }
}
