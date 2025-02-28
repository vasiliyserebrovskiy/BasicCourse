package lesson_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
/*
Статические члены класса имеют доступ(видят) только статический контент
 */
public class StaticExample {

    // non-static класс
    int x;

    // static поле класса
    static int staticY;

    //static method
    public static void staticMethod() {
        //статические методы видят только статические члены(поля и методы класса)
        // x++; yет доступа к не статическому полю
        staticY++; // к статическому полю kein Problem
        //можем вызывать только статические методы
        //nonStaticMethod - недоступен
        // ключевое слово this не доступно в статических меодах
        System.out.println("Вызван статический метод");
    }

    //Не-статический метод
    public void nonStaticMethod() {
        // есть доступ ко всем членам класса!
        x++; //не статика доступна
        staticY++; // статика тоже доступна
        //можем вызвать статический метод
        staticMethod();
    }

    //Метод main static
    public static void main(String[] args) {

        // x = 10; // у static метода нет доступа, к не статик переменным
        staticY = 10;
        System.out.println(staticY);

        //nonStaticMethod() // не могу вызвать не статический метод, без создания объекта !!!!
        StaticExample staticExmpl = new StaticExample();
        staticExmpl.nonStaticMethod(); // нестатический метод вызывается без проблем
        System.out.println(StaticExample.staticY);

        //Я могу вызвать статический метод без создания объекта
        StaticExample.staticMethod();
        System.out.println(StaticExample.staticY);

        // Существуют утилитные класса
        int test = MathUtil.sumIntegers(12,10,23,20);
        System.out.println("Etwas = " + test);

    }

}
