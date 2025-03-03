package homework_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */

import java.util.Arrays;

/**
 * Task 5 *(Опционально)
 * - Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
 * - Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
 * - Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
 * - Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */
public class DogModifiedApp {

    public static void main(String[] args) {

        System.out.println("======= Исходные данные =======");
        //Проверяем что у нас с барьерами
        System.out.println("Наши высоты барьеров: " + Arrays.toString(DogModified.barriers));
        // Создаем 5 собак
        DogModified[] dogs = new DogModified[5];
        dogs[0] = new DogModified("Enik");
        dogs[1] = new DogModified("Laika");
        dogs[2] = new DogModified("Alma");
        dogs[3] = new DogModified("Sjuzi");
        dogs[4] = new DogModified("Rex");

        DogModified.printDogsInfo(dogs);

        System.out.println("\n======= Результаты взятия барьеров собаками =======\n");

        for (DogModified dog : dogs) {
            int count = 0;
            for (int barrier : DogModified.barriers) {
                if (dog.jumpBarrier(barrier)) count++;
            }
            System.out.println("Собака \"" + dog.getName() + "\" взяла барьеров: " + count);
        }


    }
}
