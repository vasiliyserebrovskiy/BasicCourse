package lesson_30.interfaces;


// Интерфейс содержит только поведение
public interface Printable {
    // интерфейс является совокупностью абстрактных методов, задающих поведение
    // сам интерфейс косвенно абстрактный. Ключевое слово abstract присутствует по умолчанию в объявлении интерфейса

//    В интерфейсах не может быть полей и конструкторов
    // В интерфесе могут быть константы и они всегда public static final

    String color = "black"; // КОНСТАНТА public static final можно не писать, ибо будет по умолчанию!

    // Интерфейс может наследоваться от интерфейса - расширять интерфейс

    // Все методы интерфейса косвенно (неявно и по умолчанию и абстрактные и публичные)
    //public abstract - не нужно
    void print();

    //начиная с JDK 8 можно реализовать default - если метод defaul nj нужно писать его реализацию

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    // Начиная с JDK 8 доступны статические методы
    static void testStatic(String str) {
        System.out.println("Static method: " + str);
    }

    // Начиная с jdk 9 появилась возможность писать приватные методы (статические и не статические)
    //они приватные, не помечены final но переопределить их в классах невозможно


}
