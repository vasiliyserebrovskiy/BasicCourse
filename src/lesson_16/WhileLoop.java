package lesson_16;

import lesson_11.Hello;

import java.util.Scanner;

/**
 * @author Vasilii Serebrovskii
 * @date 18.02.2025
 * @description Краткое описание класса
 */
public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (условие) {
            <блок кода - тело цикла -> который будет повторяться>
        }
        предикат - условие вычисляется перед каждой итерацией цикла
         */

        // Вывести на экран числа от 1 до 5 включительно
        int number = 0;
        while (number <= 5) {
            System.out.print(number + ", ");
            number++; // инкремент переменной условия, для исключения бесконечного цикла
        }
        System.out.println();
        System.out.println("Цикл закончен.");
        System.out.println("\n=======\n");

        // Распечатать числа от 100 до 90 включительно

        number = 100;
        while (number >= 90) {
            // System.out.println(number);
            System.out.println(number-- + " i2 = " + number); // уменьшение происходит сразу, по факту перед операцией конкатенации по знаку "+"
            // number--;
        }

        System.out.println("\n=======\n");
        // Задача, найти сумму чисел от 1 до 100

        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i++;
        }

        System.out.println("Сумма чисел от 1 до 100 = " + sum);

        System.out.println("\n=======\n");

        // вывести на экран все четные числа в диапазоне от 1 до 21
        i = 1;
        while (i <= 21) {
           // System.out.println("Число которое проверяем: " + i);
            if (i % 2 == 0) {
                System.out.print(i++ + ", ");
            }
            i++;
        }

        System.out.println();
        System.out.println("\n=======\n");

        String str = "Hello!";
        i = 0;
        while (i  < str.length()) { // можно и так (i  <= str.length() - 1)
            System.out.println(str.charAt(i++));
        }
        System.out.println("\n======= Before do while =======\n");

        // Пользователь должен ввести число. Пока не введент число, выполнение программы не продолжиться

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = sc.nextInt();
        sc.nextLine();

        // Цикл с пред условием
        while (input <= 0 ) {
            System.out.println("Введите положительное число: ");
            input = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Спасибо, вы ввели: " + input);
        System.out.println("\n==============\n");
        //DRY - don't repeat yourself - не повторяй себя
        // Цикл с пост условием
        /*
        do {
            <тело цикла>
        } while (<условие>);
        тело цикла выполняется как минимум один раз, в не зависимости от условия - true or false
         */
        int input2;
        do {
            System.out.println("Введите число больше 0: ");
            input2 = sc.nextInt();
            sc.nextLine();

        } while (input2 <= 0);

        System.out.println("Спасибо 2, вы ввели: " + input2);
        System.out.println("\n==============\n");
        // Без аварийное завершение программы
        //System.exit(0); // Завершение программы
    } // end main
} // end class
