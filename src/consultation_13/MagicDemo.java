package consultation_13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.03.2025)
 */
public class MagicDemo {
    public static void main(String[] args) throws Exception{

        Person person = new Person("Alex");

        // Нахожу приветное поле name
        Field nameField = Person.class.getDeclaredField("name");

        // Открываю доступ к приватному полю
        nameField.setAccessible(true);

        //  Меняю значение в поле
        nameField.set(person, "Мария");

        // получить значение, сработает ли

        System.out.println("Значение пол name = " + nameField.get(person));

        //возвращаем все на место, закрываем поле
        nameField.setAccessible(false);

        System.out.println(person);

        // Нахожу метод по имени
        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        // Снимаем приватность
        sayHelloMethod.setAccessible(true);

        // Вызвать метод
        sayHelloMethod.invoke(person);

        // восстановить все как было
        sayHelloMethod.setAccessible(false);

        System.out.println("\n========================");

        Class<?> personClass = Class.forName("consultation_13.Person");

        // получаем конструктор
        Constructor<?> constructor = personClass.getConstructor(String.class);

        Object object = (Person) constructor.newInstance("Василий");

        System.out.println(object);



    }
}
