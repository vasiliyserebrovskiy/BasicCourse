package lesson_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Подготовка для чтения стандартного потока ввода с клавиатуры

        // Прочитать строку
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        //nextLine читает всю строку, введенную пользователем и возвращает уу в виде строки
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Ваше имя = " + name + ". Ваш возраст:" + age);
        //Всегда после вызова всех nextInt, nextDouble и т.д., ставим вызов метода nextLine() чтобы скушать остаток строки
        scanner.nextLine();

        // Введите город
        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        // To do чтение токенами чисел
        // разделитель - пробельный символ
        /*
         \s+ - пробельный символ
         - пробел (в любом количестве подряд)
         - знак табуляции
         - перевод корретки
         - \r - возврат каретки
         */

        System.out.println("Введите число PI: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Число Пи: " + pi);

    }
}
