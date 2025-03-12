package lesson_32;

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

        // .valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("double = " + dbl);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println("b1 = " + b1);

        // parseXXX() - преобразует строку в соответствующий примитив
        double dblP = Double.parseDouble("456"); // возвращает примитив
        Double dblD = Double.valueOf("456"); // возвращает ссылочный тип

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // У всех оберток переопределен метод tosString(), который возвращает строковое представление числа
        // equals - есть у каждой обертки, сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);
        //compareTo - сравнивает текущий объект с другим объектом. Определяет кто больше?
        // тип возвращаемого значения int
        System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
        System.out.println("i2.compareTo(i1) = " + i2.compareTo(i1));

        /*
           i1 > i2 -> положительное
           i1 < i2 -> отрицательное
           i1 = i2 -> 0
         */

        System.out.println("\n=========");
        // XXXvalue() - возвращает значение объекта как примитивный тип.

        Double d2 = 125.67; // Автоупаковка
        d2 = Double.valueOf(125.67); // Явная принудительная упаковка
        double dPrimitive = d2; // Авто распаковка
        dPrimitive = d2.doubleValue(); // Явная принудительная распаковка

        System.out.println("\n====================");
        /*
            Абстрактный класс Number. Все числовые обертки наследуются от него.
            Byte, Short, Integer, Float, Long, Double

         */

        /*
            byteValue()
            shotValue()
            intValue()
            longValue()
            floatValue()
            doubleValue()
         */

        //
        Integer integer = 31844;

        double dval = integer.doubleValue();
        System.out.println("dval = " + dval);
        System.out.println("integer.floatValue() = " + integer.floatValue());

        Double dWrapper = 245.78;
        int intV = dWrapper.intValue();
        System.out.println("intV = " + intV);

        System.out.println("dWrapper.byteValue() = " + dWrapper.byteValue());

    }

}
