package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScanerLocal {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String data = "3,14 42,7";
        String data = "3.14 42.7";
        Scanner sc = new Scanner(data);

        //Задание параметров локали
//        sc.useLocale(Locale.GERMANY);
        sc.useLocale(Locale.US);

        // Locale - формат даты и времени на локальном компьютере. Используется locale системы для определения формата чисел,
        // в том числе, каким знаком разделяется вещественная часть числа

        //Local .US - штаты. дробная часть отделяется '.'
        // ru_RU - Россия, дробная часть отделяется ','
        // Germany - дробная часть отделяется ','
        System.out.println(Locale.getDefault());
        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());
        System.out.println("=======================");


        String text = "42 ,Java,3.14    , Hello";
        Scanner scanner = new Scanner(text);

        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
//        scanner.useDelimiter("[;|]"); // разделитель ; или |
        scanner.useDelimiter("\\s*,\\s*"); // разделитель ; или |

        String java = scanner.next(); // считает один токен (между разделителями)и возвращает строку
        System.out.println(java);
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        scanner.reset(); //Вернуться к стандартному разделителю
    }
}
