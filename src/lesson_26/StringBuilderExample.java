package lesson_26;

import lesson_11.Hello;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best!";

//        System.out.println(str);

        //StringBuilder - это класс, который используется для создания и манипулирования с изменяемыми строками.

        //StringBuilder имеет перегруженный конструктор
        //StringBuffer - младший брат, заточен на работу в многопоточной среде!
        StringBuilder sb = new StringBuilder(); //пустой конструктор
        sb = new StringBuilder("Hello"); // может принимать какое-нибудь начальное значение(String)

        sb.append(" "); // метод для добавление символов в конце строки(приклеивание справа). Аналог конкатенации.

        // Получить строковое представление
        String string = sb.toString();
        System.out.println("String = " + string);

        // Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello World вставить между beautifull
        sb.insert(6, "beautifull "); // Weeeeeeeeeeeeeeee
        System.out.println(sb);

        /*String start = "Hello World";
        String result = start.substring(0,6);
        result += "beautifull ";
        result += start.substring(6);
        System.out.println(result);*/

        // заменить подстраку, определяется по индексам указанных значений (верхняя граница не включительно)
        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java"); // огонь
        System.out.println(sb);

        // Удалить подстроку в диапазонеот - до
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb);

        // Нам надо знать, есть ли в sb какая-то подстрока
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index); // возвращает -1 если подстрока не найдена

        System.out.println("========== revers ==========");
        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb);

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        System.out.println("== колличество символов в sb (длинна)==");
        // Получение длинны строки
        System.out.println("длина строки : " + sb.length());

        // Можно установить новую длинну(обрезать или расширить sb)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println(sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb char(0) code = " + (int) ch1);

        sb.setLength(4);
        System.out.println(sb);

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов, и возвращающий абревиатуру этой фразы
        (первые буквы каждого слова записанные в верхнем регистре)
        Научно исследовательский институт -> НИИ
         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "dsfdsfdsfdsf sfsdfdsghf";
        // Получить массив char символов из которых состоит строки

        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

    }
}
