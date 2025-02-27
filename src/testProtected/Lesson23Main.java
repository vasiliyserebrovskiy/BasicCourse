package testProtected;

import lesson_23.Cat;
import org.w3c.dom.ls.LSOutput;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.02.2025)
 */
public class Lesson23Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tim", 10, 4);
        System.out.println(cat.toString());
        cat.setAge(15);
        System.out.println(cat.getAge());

        // cat.isDefault = true; // protected и модификатор по умолчанию, в другом пакете доступа нет

    }
}
