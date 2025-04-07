package homework_50.task_02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.04.2025)
 */
/*
Task 3
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
public class Task02 {

    public static void main(String[] args) {
        List<LocalDate> dateList = Arrays.asList(
                LocalDate.of(2023, 7, 11),
                LocalDate.of(2023, 7, 16),
                LocalDate.of(2023, 7, 2)
        );

        long days = Task02.daysBetweenEarliestAndLatest(dateList);
        System.out.println("Разница в днях: " + days); // 14 дней


        long daysStream = Task02.daysBetweenEarliestAndLatestStream(dateList);
        System.out.println("Разница в днях Stream: " + days); // 14 дней
    }

    public static long daysBetweenEarliestAndLatest(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не должен быть пустым");
        }

        LocalDate earliest = Collections.min(dates);
        LocalDate latest = Collections.max(dates);

        return ChronoUnit.DAYS.between(earliest, latest);
    }

    // Тоже но с использованием Stream API
    public static long daysBetweenEarliestAndLatestStream(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не должен быть пустым");
        }

        // Используем Stream API для нахождения самой ранней и самой поздней даты
        Optional<LocalDate> earliest = dates.stream().min(LocalDate::compareTo);
        Optional<LocalDate> latest = dates.stream().max(LocalDate::compareTo);

        // Извлекаем значения и считаем разницу в днях
        return ChronoUnit.DAYS.between(earliest.get(), latest.get());
    }

}
