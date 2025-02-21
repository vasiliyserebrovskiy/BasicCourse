package homework_18;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */

/**
 * Task 3 * (Опционально)
 * Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 *
 * вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Task_03_commented {
    public static void main(String[] args) {
        //Данные для проверки метода
        int[] array1 = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5}; //выход {13, 11, 31, 11, 5}
        int[] array2 = new int[]{};
        int[] array3 = new int[]{};
        int[] array4 = new int[]{-1, -13, -25, -11, -31, -55, -98, -11, -5};
        int[] array5 = new int[]{2, 4, 6, 8, 32, 64, 128, 256, 512};

        //Для проверки метода
        int[] result;
        array3 = null;

        //Проверка работы метода
        result = findAllPrimeNumbers(array4);
        System.out.print("Полученных массив простых чисел: ");
        printArray(result);

    }

    // Метод findAllPrimeNumbers :  возвращающий массив простых чисел из заданного массива
    // В Условии не оговаривается КАКОЙ массив должен вернуть метод,
    // так как входным параметром является int[] массив, то логично предположить,
    // что и возвращаемый массив должен быть типа int[].

    public static int[] findAllPrimeNumbers(int[] array) {

        // ArrayList использовать не получиться пока, так что пойдем немного по другому
        String primeNumbers = ""; // не очень хорошо, так как будут создаваться новые строки, при каждой конкатенации. накидаем мусорщику работы немного
        boolean isOnePrimeFound = false; // проверяем, найдем ли хоть одно простое число

        //Проверим, что входной массив не пуст и не null
        if (array == null || array.length == 0) {
            System.out.println("Ошибка: входной массив null или пуст!");
            return new int[0]; //Если что-то пошло не так возвращаем пустой массив
        }

        System.out.print("Данный массив содержит простые числа: | ");
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 1) {

                if (array[i] == 2 || array[i] == 3) {
                    System.out.print(array[i] + " | ");
                    isOnePrimeFound = true;
                    primeNumbers += array[i] + "X";
                    continue;
                }
                if (array[i] % 2 != 0 && array[i] % 3 != 0) {
                    boolean isPrime = true;
                    for (int j = 5; j * j <= array[i]; j += 6) {

                        if (array[i] % j == 0 || array[i] % (j + 2) == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(array[i] + " | ");
                        isOnePrimeFound = true;
                        primeNumbers += array[i] + "X";
                    }
                }
            }

        }
        System.out.println();
        System.out.println("Наша временная строка = " + primeNumbers);

        // Необходимо поставить проверку, что получили хотя бы одно простое число

        String[] primaryNumbersArray = primeNumbers.split("X");
        System.out.print("primaryNumbersArray = ");
        printArray(primaryNumbersArray);
        int arrayIdx = primaryNumbersArray.length;
        System.out.println("Длинна масиива = " + arrayIdx);
        int[] newArray = new int[arrayIdx];

        // Формируем возвращаемый массив если простые числа были найдены
        if (isOnePrimeFound) {
            for (int i = 0; i < arrayIdx; i++) {
                  newArray[i] = Integer.parseInt(primaryNumbersArray[i]);
            }
        }

        return newArray;
    }

    // Вывод массива в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

    //Временно для отладки!!!!!!
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]\n"));
        }
    }

}
