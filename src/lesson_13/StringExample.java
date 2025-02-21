package lesson_13;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!"; // Объявление и инициализация переменной типа String
        System.out.println(greeting);

        String string1 = new String("Hello!"); // Создание строки, этот способ считается не рекомендуемым
        System.out.println(string1);
        // Метод length
        int length = greeting.length(); // Вызов метода length() - подсчитать число символов в строке
        System.out.println("длина строки length = " + length);

        // Метод toUpperCase()
        System.out.println(greeting.toUpperCase());
        System.out.println("greeting: " + greeting);

        // String в Java иммутабельна (неизменяема)
        // Если я хочу сохранить результат работы метода, нужно сохранить результат в переменную
        String newString = greeting.toLowerCase();
        System.out.println("newString: " + newString);

        System.out.println("=============\n");

        // Конкатенация строк (склеивания / объединения)

        String str1 = "One";
        String str2 = " ";
        String str3 = "Hello";

        // Базовый метод - оператор +
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // тип данных Х + String -> Х приводиться к строке и выполняется конкатенация

        System.out.println(1 + 3);
        // + конкатенация vs сложение
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);

        // цепочка вызова методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!"); // ((str1 + str2) + str3) + "!!!"
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // Склеить несколько строк вставляя между ними одинаковый разделитель

        String concatStr4 = String.join("|||", "Hello", "World", "Test");
        System.out.println("concatStr4: " + concatStr4);
        String concatStr5 = String.join(" ", str1, str2, str3, "!!!!");
        System.out.println("concatStr5: " + concatStr5);

        System.out.println("===========\n");

        // Приведение типов когда есть строка и + - это знак конкатенации. Второй тип данных будет приведен к String
        // Все остальные типы преобразуются в строки
        int a = 1;
        int b = 2;
        String str = "Сумма а + b = " + a + b;
        System.out.println("str: " + str);

        // Меняем порядок операций
        str = "Сумма а + b = " + (a + b);
        System.out.println("str: " + str);

        System.out.println("===========\n");

        // Индексация

        String digits = "0123456789";
        System.out.println("digits.length():" + digits.length());

        // charAt(index) Взять символ из строки по его индексу (номеру)
        char symbol = digits.charAt(4); // Взять символ под индексом 4
        System.out.println("charAt(4): " + symbol);
        // Первый символ всегда имеет индекс 0, последний length() - 1

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);
        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("===========\n");

        // Выделение подстроки
        String subString = digits.substring(2); // со 2(включительно) индекса и до конца
        System.out.println("subString(2): " + subString);
        System.out.println("digits: " + digits); // Начальная строка остается без изменений
        String subString2 = digits.substring(2, 7); // подстрока со 2 символа включительно по 6 не включая 6
        System.out.println("subString2: " + subString2);

        System.out.println("===========\n");

        // Замена частей строки
        // replace(), replaceFirst(), replaceAll()
        // replace - заменяет все совпадения заданной строки, на другую строку (Работает только со строками не поддерживает регулярные выражения)
        String string = "One World One";
        String replace = string.replace("One", "WWW"); // меняем все совпадения
        System.out.println("string: " + string);
        System.out.println("replace: " + replace);

        replace = string.replaceFirst("One", "BBB"); // меняем только первое совпадение
        System.out.println("replace 2: " + replace);

        replace = string.replaceAll("One", "Two"); //Заменяет все совпадения, можно использовать regex
        System.out.println("replace 3: " + replace);

        String stringReg = "One World One Onix O";
        replace = stringReg.replaceAll("\\bO\\w*","Replaced"); // одна O минимум
        System.out.println("replace: "+replace);

        replace = stringReg.replaceAll("\\bO\\w+","Replaced"); // после O есть минимум 1 символ
        System.out.println("replace: "+replace);
    }
}
