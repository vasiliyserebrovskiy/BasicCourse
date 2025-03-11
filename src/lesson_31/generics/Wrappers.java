package lesson_31.generics;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.03.2025)
 */
public class Wrappers {

    //Классы обертки используются для представления примитивных типов как объектов(как ссылочных)
    /*
    Byte - обертка byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean
     */

    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max = " + maxValue);
        System.out.println("min = " + Integer.MIN_VALUE);

        // Есть поддержка null
//        int x = null; // примитив int не поддерживал null
        maxValue = null;

        // Приведение типов. Автоупаковка и автораспаковка
        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitivInt = wrapperInt; // Автораспаковка, из типа Integer в примитив int
        System.out.println(primitivInt);
        System.out.println("======================");

        // Кэширование
        // -128...127 byte

        // Сравнение объектов - следует использовать метод equals()
        Integer a = 127; // создан объект с адресом в памяти @2aaaa2
        Integer b = 127; // Объект с таким значением уже есть, берем уже созданный объект и вернет тот же адресс @2aaa2
        //сравниваем значения записанные в переменных т.е. ссылки т.е. адреса объектов в памяти
        Integer c = 128; // создается объект с адресом в памяти @3bbb3
        Integer d = 128; // не проверяется на наличие такого объекта и создается объект в памяти @4ccc4
        System.out.println("127 == 127 " + (a == b)); //true
        System.out.println("127.equals(127) = " + a.equals(b)); //true

        System.out.println("128 == 128 " + (c == d)); //false
        System.out.println("128.equals(128) = " + c.equals(d)); // true

        // Общее или тождественные(схожие) методы, которыми обладают классы обертки

    }

}
