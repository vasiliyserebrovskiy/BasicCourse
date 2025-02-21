package homework_11;

/**
 * Task 3 * (Опционально)
 * Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
 * <p>
 * Вычислите среднюю температуру за неделю и выведете ее на печать.
 */
public class Task05 {
    public static void main(String[] args) {
        int monday = 5;
        int tuesday = -1;
        int wednesday = 3;
        int thursday = 7;
        int friday = 2;
        int saturday = 6;
        int sunday = 7;
        double averageTemperature;

        averageTemperature = (double) (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
        System.out.println("Средняя температура на прошлой неделе была равна: " + averageTemperature + " градусов Цельсия.");

    }
}
