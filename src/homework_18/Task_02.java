package homework_18;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */

/**
 * Task 2
 * Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task_02 {
    public static void main(String[] args) {
        String[] array1 = new String[]{"Hallo", "Guten Morgen", "Hi", "Привет"};
        String[] array2 = new String[]{"Hi"};
        String[] array3 = new String[]{};
        String[] array4 = new String[]{};
        String[] result;
        array4 = null;

        result = findMinMaxStrings(array1);
        printArray(result);

    }

    //Method for finding max & min string
    public static String[] findMinMaxStrings(String[] array) {
        String[] newStringArray = new String[2];

        //Проверка входных параметров
        if (array == null || array.length == 0) {
            System.out.println("Ошибка: входной массив null или пуст!");
            return newStringArray;
        }

        int maxLength = array[0].length();
        int minLength = array[0].length();
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                maxIndex = i;
            }
            if (array[i].length() < minLength) {
                minLength = array[i].length();
                minIndex = i;
            }
        }

        newStringArray[0] = array[minIndex];
        newStringArray[1] = array[maxIndex];

        return newStringArray;
    }

    // Method for printing array
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}
