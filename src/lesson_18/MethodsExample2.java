package lesson_18;

import lesson_11.Hello;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */
public class MethodsExample2 {
    public static void main(String[] args) {
        int temp = 55;

        changeMe(temp);

        System.out.println(temp);

        int[] numbers= {1,2,3,4,5,6,7,8,9,10};

        System.out.print("numbers 1: ");
        printArray(numbers);
        changeMe(numbers);
        System.out.print("numbers 2: ");
        printArray(numbers);

        int[] link2 = numbers;
        link2[2] = -100;
        System.out.print("link2: ");
        printArray(link2);

        // null - ничто - специальное значение, указывающее что ссылка не ссылается на объект. Отсутствие значения ссылки в переменной.
        numbers = null;
//        printArray(numbers);

        //numbers[0] = 10; // Ошибка исполнения - NullPointerException - во время выполнения
        //нельзя взять 0 элемент у ничего

        link2[7] = 0;
        System.out.print("link2: ");
        printArray(link2);
        // Если переменная была инициализированна полным образом, то переназначить с укороченной формой записи не ПРОЙДЕТ
        // numbers = {1,2,3}; - так нельзя!!!!
        // тип ссылки определяет, какие методы мне доступны
        numbers = new int[]{10,20,30};
        System.out.print("numbers: ");
        printArray(numbers);

        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello); // Warum -> тип String иммутабельный

        String str2 = hello.toUpperCase();
        System.out.println("UpperCase: " + str2);

    } // End main

    public static void changeMe(String str) {
        System.out.println("метод changeMe str: " + str);
        str = str+"!!!";
        System.out.println("str: " + str);
    }

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }

    // Method change me
    public static void changeMe(int x) {
        x = 100;
    }

    // Method for printing array
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

} // End class
