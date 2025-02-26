package homework_18;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */

/**
 * Task 1
 * Написать метод со следующим функционалом:
 * ---------------------------------
 * На вход метод принимает массив целых чисел и число - длину нового массива.
 * -- Что делает метод!
 * Метод должен создать и распечатать массив заданной в параметрах длинны.
 * --
 * В начало массива должны быть скопированы элементы из входящего массива:
 * ---------------------------------
 * {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 * Copy
 * {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
 */
public class Task_01 {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //array = null;
        copyToNewArray(array, 3);

    }

    // Method create new array
    public static void copyToNewArray(int[] array, int idx) {

        //Проверка входных параметров
        if (array == null) {
            System.out.println("Ошибка: массив пустой!");
            return;
        }
        if (idx < 0) {
            System.out.println("Ошибка: длинна нового массива не может быть отрицательной!");
            return;
        }

        int[] result = new int[idx];
        for (int i = 0; i < idx && i < array.length; i++) {
            result[i] = array[i];
        }

        /*int[] newArray = new int[idx];
        int iterator;

        if (idx >= array.length) iterator = array.length;
        else iterator = idx;

        for (int i = 0; i < iterator; i++) {
            newArray[i] = array[i];
        }*/

        // Печать получившегося массива
        System.out.print("Создан массив : ");
        printArray(result);
        if (idx == 0) System.out.println("]");
    }

    // Method for printing array
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}

