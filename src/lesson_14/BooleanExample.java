package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        System.out.println(bol1);
        bol1 = false;
        System.out.println(bol1);

        int x = 10;
        int y = 5;
        // Сравнение на равенство ==
        boolean b1 = x == y;
        System.out.printf("%s == %s -> %s\n", x, y, b1);
        // Сравнение не равенство !=
        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);
        // Больше >
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);
        //Меньше <
        b1 = x < y;
        System.out.printf("%s < %s -> %s\n", x, y, b1);
        //Меньше или равно
        y = 10;
        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n", x, y, b1);
        //Больше или равно
        x = 6;
        y = 5;
        b1 = x >= y;
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        String str = "Java is the best!";
        //Поиск вхождения подстроки
        //contains() - возвращает тру, если строка содержит указанную подстроку
        boolean contains = str.contains("Java");

        System.out.println("Результат: " + contains);

        //startWith() - начинается на указанную подстроку
        //endWith() - оканчивается на указанную подстроку
        boolean startWith = str.startsWith("Ja");
        System.out.println("startWith: " + startWith);
        boolean endWith = str.endsWith("Best");
        System.out.println("endWith: " + endWith);

        //Rename shift + F6

        // Логические операции
        System.out.println("===== Логический операции =====");

        // Логическое НЕ (отрицание)
        boolean b2 = false;
        System.out.println("b2: " + b2);
        System.out.println("!b2: " + !b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения - два условия
        /*
        Логическое И - "&"
        Одновременно два истинных условия
         */

        b2 = true & true;
        System.out.println("true & true: " + b2);

        // проверка что число входит в нужный диапазон
        // Введите число от 0 до 100
        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("число от 0 до 100: " + b2);
        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("число от 0 до 100: " + b2);

        // Логическое ИЛИ - "|"
        // Хотя бы одно условие истинно
        b2 = true | false;
        System.out.println("true | false: " + b2);

        System.out.println("\n================\n");

        // Логическое исключающее ИЛИ (XOR) "ˆ"
        // Возвращает true - если обе части выражения разные
        /*
        true ˆ true -> false
        false ˆ true -> true
        true ˆ false -> true
        false ˆ false -> false
         */
        b2 = true ^ false;
        System.out.println("true ^ false: " + b2);

        System.out.println("\n================\n");

        // Логическое сокращенное И "&&"
        // true только если обе части выражения возвращают true
        b2 = true && true;
        System.out.println("true && true: " + b2);

        int a = 10;
        int b = 0;
        boolean bol = (b != 0) && a / b > 2; // сокращенное И не считает правую часть, если левая определила результат операции
        System.out.println(" (b != 0) && a / b > 2: " + bol);
//        boolean bolFull = (b != 0) & a / b > 2; // даст ошибку - деление на 0

        b = 1;
        bol = (b != 0) && a / b > 2; // сокращенное И не считает правую часть, если левая определила результат операции
        System.out.println(" (b != 0) && a / b > 2: " + bol);

        System.out.println("============================");
        // Логическое сокращенное ИЛИ - ||
        // Выдает тру если хотя бы одна часть выражения равна true
        // сокращенное не будет считать второе условие если первое = true, а обычное будет считать
        b = 0;
        bol = true || (a / b > 2);
        System.out.println("bol: " + bol);
        /* Приоритет
            ! - 1
            & - 2
            ^ - 3
            | - 4
            && - 5
            || - 6

         */

        System.out.println("1");
        System.out.println(true ^ true & false);
        System.out.println("2");
        System.out.println(true ^ true && false);

    }
}
