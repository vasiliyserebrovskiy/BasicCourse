package lesson_25;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */
public class StaticApp {

    public static void main(String[] args) {
        // Если в программе не используется статика, статическая инициализация не вызывается
        // Как только что-то создается хоть какое-то обращение к статике - статика инициализируется
        // Если создается объект класса, то и статика тоже инициализируется

        // Статический блок вызывается до конструктора и вызывается ровно один раз, в момент загрузки класса в JVM.


        System.out.println("Static counter = " + StaticBlockDemo.counter);
        System.out.println("Static array = " + Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo();
        StaticBlockDemo demo2 = new StaticBlockDemo("TITLE");
        System.out.println(demo);
        System.out.println(demo2);
        System.out.println("Static array = " + Arrays.toString(StaticBlockDemo.colors));

    }

}
