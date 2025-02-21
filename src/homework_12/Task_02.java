package homework_12;

/**
 * Task 2
 * Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
 * Вычислите среднюю температуру за неделю и выведите ее на печать.
 * P.S. - правильно выберите типы данных
 */

public class Task_02 {
    public static void main(String[] args) {
        int monday = 2;
        int tuesday = -3;
        int wednesday = 5;
        int thursday = 6;
        int friday = 3;
        int saturday = 5;
        int sunday = 4;
        double averageTemperature;

        averageTemperature = (double) (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
        System.out.println("Средняя температура на прошлой неделе была равна: " + averageTemperature + " градусов Цельсия.");
    }
}
