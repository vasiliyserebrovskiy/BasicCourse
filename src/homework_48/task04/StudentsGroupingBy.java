package homework_48.task04;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
/*
Создай список студентов (List) — минимум 10 объектов, с разнообразными значениями.

Задания:
1 Группировка по специальности
Сгруппируй студентов по специальности (поле major) в Map<String, List>.

2 Группировка по курсу с использованием Set
Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.

3 Подсчёт количества студентов по специальности
Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.

4 Средний балл по специальности
Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.

5 Список оценок по специальности
Построй Map<String, List>, где хранятся только оценки по каждой специальности.

6 Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:

 6.1 минимальный возраст,
 6.2 максимальный возраст,
 6.3 средний возраст,
 6.4 общее количество студентов,
 6.5 сумму всех возрастов.
Требования:
    Вся логика должна быть оформлена в main().
    Не забудь добавить toString() в класс Student для красивого вывода.
    Постарайся использовать Stream API и Collectors как на уроке.
🔄 Дополнительно (по желанию):

7 Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности: → Map<Integer, Map<String, List>>
 */
public class StudentsGroupingBy {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Alex", 20, "инженер", 2, 3.35),
                new Student("Max", 19, "схемотехника", 1, 3.95),
                new Student("Katia", 22, "программист", 3, 5.00),
                new Student("Michael", 21, "схемотехника", 2, 3.75),
                new Student("Peter", 23, "программист", 3, 4.35),
                new Student("Sofia", 20, "инженер", 1, 4.95),
                new Student("Elena", 19, "программист", 1, 4.25),
                new Student("Anna", 23, "инженер", 3, 4.05),
                new Student("Bob", 23, "схемотехника", 3, 4.35),
                new Student("Hanna", 20, "программист", 2, 3.35)
        ));

        //students.forEach(System.out::println);

        //1 Группировка по специальности

        Map<String, List<Student>> majorMap = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));
        System.out.println("=== Группировка студентов по специальности ===");
        printMap(majorMap);

        //2 Группировка по курсу с использованием Set
        Map<Integer, Set<Student>> yearSetMap = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        System.out.println("=== Группировка по курсу с использованием Set ===");
        printMap(yearSetMap);

        //3 Подсчёт количества студентов по специальности
        Map<String, Long> countingStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
        System.out.println("=== Подсчёт количества студентов по специальности ===");
        printMap(countingStudents);

        //4 Средний балл по специальности
        Map<String, Double> majorAveraging = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));

        System.out.println("=== Средний балл по специальности ===");
        printMap(majorAveraging);

        //5 Список оценок по специальности
        Map<String, List<Double>> majorGrades = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.mapping(Student::getGrade, Collectors.toList())));

        System.out.println("=== Список оценок по специальности ===");
        printMap(majorGrades);

        //6 Суммарная статистика по возрасту
        DoubleSummaryStatistics yearStatistics = students.stream()
                .collect(Collectors.summarizingDouble(Student::getAge));

        System.out.println("========== Суммарная статистика по возрасту ==========");
        System.out.println("Минимальный возраст: " + yearStatistics.getMin());
        System.out.println("Максимальный возраст: " + yearStatistics.getMax());
        System.out.println("Средний возраст: " + yearStatistics.getAverage());
        System.out.println("Общее количество студентов: " + yearStatistics.getCount());
        System.out.println("Сумма всех возрастов: " + yearStatistics.getSum());

        //7 Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности: → Map<Integer, Map<String, List>>
        Map<Integer, Map<String, List<Student>>> yearGradeeDoubleMap = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.groupingBy(Student::getMajor, Collectors.toList())));

        System.out.println("\n=== Группируем студентов по курсу, и внутри каждого курса группируем по специальности ===\n");


        yearGradeeDoubleMap.forEach((year, secondMap) -> {
            System.out.println("=== Год: " + year + " ===============================================");
            secondMap.forEach((major, studentList) -> {
                System.out.println("  Специальность: " + major);
                studentList.forEach(student -> System.out.println("    " + student));
                System.out.println("----------------------------------------------------------");
            });
            System.out.println("==========================================================");
        });

    }

    // Печать результатов
    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((K, V) -> System.out.println(K + " : " + V));
        System.out.println("===============\n");
    }


}
