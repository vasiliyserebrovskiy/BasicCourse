package homework_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Task 5 *(Опционально)
 * - Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
 * - Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
 * - Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
 * - Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */
public class DogModifiedApp {

    public static void main(String[] args) {

        Random random = new Random();

        // Создаем случайный массив барьеров
        int[] barriers = new int[7];
        for (int i = 0; i < 7; i++) {
            barriers[i] = random.nextInt(101) + 70; // Заполнить массив случайными значениями от 70 до 170.
        }

        System.out.println("======= Исходные данные =======");
        System.out.println("Наши высоты барьеров: " + Arrays.toString(barriers));

        // Создаем 5 собак
        DogModified[] dogs = new DogModified[5];

        dogs[0] = new DogModified("Enik", random.nextInt(51) + 30);
        dogs[1] = new DogModified("Laika", random.nextInt(51) + 30);
        dogs[2] = new DogModified("Alma", random.nextInt(51) + 30);
        dogs[3] = new DogModified("Sjuzi", random.nextInt(51) + 30);
        dogs[4] = new DogModified("Rex", random.nextInt(51) + 30);

        DogModified.printDogsInfo(dogs);

        System.out.println("\n======= Результаты взятия барьеров собаками =======\n");

        for (DogModified dog : dogs) {
            int count = 0;
            for (int barrier : barriers) {
                if (dog.jumpBarrier(barrier)) count++;
            }
            System.out.println("Собака \"" + dog.getName() + "\" взяла барьеров: " + count);
        }

    }
}
