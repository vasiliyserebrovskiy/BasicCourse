package lesson_48.groupingBy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
public class GroupingByExample {

    /*
    Collectors.groupingBy(Function classifier) - простейшая форма группировки.
    Группирует элементы по ключу, который будет получен с помощью функции классификатора.
    Результатом будет карта Map<k, List<T>>
     */

    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Peter", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 19, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 28, "chef", "Management"),
                new Employee("Hanna", 2000, 35, "chef", "Cleaning"),
                new Employee("Max", 1300, 45, "cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        // Сгруппировать сотрудников по отделам
        Map<String, List<Employee>> map = employees.stream()
                //.collect(Collectors.groupingBy(employee -> employee.getDepartment()));
                .collect(Collectors.groupingBy(Employee::getDepartment));

        //System.out.println("Группировка по отделам = " + map);
        printMap(map);

        List<Employee> itlist = map.get("IT");
        System.out.println("itlist = " + itlist);

        // Коллектор для значений. В какую коллекцию собирать значения, соответствующие ключу.
        Map<String, Set<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));

        printMap(map2);

        map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toSet()));

        printMap(map2);

        // Получить количество сотрудников по отделам
        Map<String, Long> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        printMap(map3);

        // Расчет средней зарплаты по отделу
        Map<String, Double> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        printMap(map4);

        // Получить список зарплат в каждом отделе
        Map<String, List<Double>> map5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toList())));

        printMap(map5);


        // Суммарная статистика
        DoubleSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("AVG: " + statistics.getAverage());
        System.out.println("count: " + statistics.getCount());
        System.out.println("SUM: " + statistics.getSum());

        System.out.println("Statistics: " + statistics);



    }

    private static <K,V> void printMap(Map<K, V> map) {
        map.forEach((K,V) -> System.out.println(K + " : " + V));
        System.out.println("===============\n");
    }

    private static void task2() {
        List<Integer> integers = List.of(1, 2, 3, -10, 105, 4, 6, -21, 0, 200, 140, 350);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i == 0) return "Zero";
                    if (i < 0) return "Negative";
                    if (i % 2 == 0) return "Even";
                    return "Odd";
                }));

        System.out.println("map = " + map);
        List<Integer> even = map.get("Even");
        System.out.println("Even: " + even);


    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 9, 3, 4, 5, 6, 5, 7, 8, 9, 10);
        // even: {2,4,6,810}
        // odd: {1,9,3,5,7}

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "even" : "odd"));

        System.out.println("map = " + map);

    }

}
