package homework_18;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */

/**
 * Task 3 * (Опционально)
 * Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 * <p>
 * вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Task_03 {
    public static void main(String[] args) {
        //Данные для проверки метода
        int[] array1 = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5}; //выход {13, 11, 31, 11, 5}
        int[] array2 = new int[]{};
        int[] array3 = new int[]{};
        int[] array4 = new int[]{-1, -13, -25, -11, -31, -55, -98, -11, -5};
        int[] array5 = new int[]{2, 4, 6, 8, 32, 64, 128, 256, 512};
        int[] array6 = new int[]{512, 2, 6, 8, 32, 64, 128, 256, 2};
        //Для проверки метода
        int[] result;
        array3 = null;

        //Проверка работы метода
        result = findAllPrimeNumbers(array1);
        System.out.print("Полученных массив простых чисел: ");
        printArray(result);

    }
    // Поиск простых чисел в массиве: 1 ищем простые числа и считаем их 2 создаем новый массив для простых чисел, если нашли и записываем их 3 возвращаем массив
    public static int[] findAllPrimeNumbers(int[] array) {

        boolean isOnePrimeFound = false;
        int count = 0;

        if (array == null || array.length == 0) {
            System.out.println("Ошибка: входной массив null или пуст!");
            return new int[0];
        }

        // идем по массиву и считаем простые числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                if (array[i] == 2 || array[i] == 3) {
                    isOnePrimeFound = true;
                    count++;
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
                        isOnePrimeFound = true;
                        count++;
                    }
                }
            }
        }

        System.out.println("Сколько нашли простых чисел = " + count);

        if (isOnePrimeFound) {
            int[] newArray = new int[count];
            count = 0;
            //идем еще раз по массиву и записываем простые числа в новый массив
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 1) {
                    if (array[i] == 2 || array[i] == 3) {
                        newArray[count] = array[i];
                        count++;
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
                            newArray[count] = array[i];
                            count++;
                        }
                    }
                }
            }
            return newArray;
        }
        return new int[]{};
    }


    // Вывод массива в консоль
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }
}
