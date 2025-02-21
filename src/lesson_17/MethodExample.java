package lesson_17;

import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */
public class MethodExample {
    // Все методы должны быть внутри класса!!!
    // Если main в классе есть, то его пишут первым!
    // До него могут быть только свойства или поведение / переменные

    public static void main(String[] args) {

        // Вызов метода sayHello()
        sayHello();

        char ch = 'A';
        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar('6');

        int[] array = new int[]{1, -5, 10, 25, -25, 20};
        printArray(array);
        int[] array2 = {12,-20,1767,234234,23};
        printArray(array2);

        array[3] = 1001;
        array[0] = 100_000;
        printArray(array);
        System.out.println("==============================================");
        String[] strings = {"Hello", "Java", "Test", "World"};
        printArray(strings);
        System.out.println("==============================================");
        testParametersOrder(1, "Hello");
        System.out.println("==============================================");
        testParametersOrder("World", 5);

    } // End main
    /*
     ПРЕГРУЗКА методов - в пределах одного класса может быть несколько методов, с одним именем, но разным количеством или набором параметров
     */


    public static void testParametersOrder(int x, String str) {
        System.out.println("INT + STRING: " + x + str);
    }

    public static void testParametersOrder(String str, int x) {
        System.out.println("Другое поведение STRING + INT: " + str + x);
    }



    // Вывод массива СТРОК в консоль
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length -1 ? "]\n" : ", "));
        }
    }

    // Вывод ЦЕЛОЧИСЛЕННОГО массива в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

    // Вывод в консоль числового значения для символа
    public static void printDecimalCodeOfChar(char ch1) {
        // char ch1 = ch из (аргументов вызова)
        System.out.println((int)ch1);
    }

    // Вывод в консоль ""Hello, World
    public static void sayHello() {
        // Тело метода
        System.out.println("Hello, Wordl!");
    }

} //End class
