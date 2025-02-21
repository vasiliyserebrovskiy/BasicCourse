package homework_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */

/**
 * Task 2
 * Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
 * --------------------------
 * {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 * Copy
 * Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
 * ------------------------------
 * {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */
public class Task_02 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 8, 15, -12, 12, 45, 14};
        printArray(array);

        printArray(array, 5);

    } //End main

    //Метод печатающий массив в обратном порядке
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i != 0 ? ", " : "]\n"));
        }
    }

    //Метод с учетом индекса: до индекса в обычном порядке, начиная с элемента(стоящего по указанному индексу) и до конца массива в обратном порядке
    public static void printArray(int[] array, int idx) {
        if (idx > array.length - 1) {
            System.out.println("Ошибка: указанный индекс больше длинны массива!");
        } else if (idx < 0) {
            System.out.println("Ошибка: указан отрицательный индекс!");
        } else {
            System.out.print("[");
            //выводим левую часть
            for (int i = 0; i < idx; i++) {
                System.out.print(array[i] + ", ");
            }
            for (int i = array.length - 1; i >= idx; i--) {
                System.out.print(array[i] + (i != idx ? ", " : "]\n"));
            }

        }
    }

} //End class
