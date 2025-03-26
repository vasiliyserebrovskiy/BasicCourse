package homework_42.task_01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг). +
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name. +
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score. +
В методе main создайте массив из нескольких объектов Sportsman.
Отсортируйте его с использованием:

естественного порядка, определенного в Comparable, +
данного класса Comparator, +
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmans = new Sportsman[6];

        sportsmans[0] = new Sportsman("Alex", 45, 100);
        sportsmans[1] = new Sportsman("Marsel", 38, 200);
        sportsmans[2] = new Sportsman("Clement", 41, 150);
        sportsmans[3] = new Sportsman("Bode", 34, 90);
        sportsmans[4] = new Sportsman("Alberto", 50, 350);
        sportsmans[5] = new Sportsman("Lindsay", 41, 100);

        //printSportsMans(sportsmans);

        System.out.println("Сортируем используя естественный механизм сортировки:\n");
        Arrays.sort(sportsmans);
        printSportsMans(sportsmans);

        //SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        System.out.println("Сортируем используя класс Comparator:\n");
        Arrays.sort(sportsmans, new SportsmanScoreComparator());
        printSportsMans(sportsmans);

        System.out.println("Сортируем с использованием анонимного класса");

        Arrays.sort(sportsmans, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman man1, Sportsman man2) {
                return man1.getAge() - man2.getAge();
            }
        });
        printSportsMans(sportsmans);

    }

    public static void printSportsMans(Sportsman[] sportsmans) {
        System.out.println("==============================");
        for (Sportsman man : sportsmans) {
            System.out.println(man);
        }
        System.out.println("==============================");
    }
}
