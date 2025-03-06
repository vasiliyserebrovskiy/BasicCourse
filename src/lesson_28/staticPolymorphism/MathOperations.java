package lesson_28.staticPolymorphism;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
/*
    В Java полиморфизм проявляется в двух формах:

    1 статический (компиляционный) полиморфизм -> перегрузка методов
    2 динамический (исполнительный) -> реализуется с помощью переопределения методов (Method Overriding)

    Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов(Method Overload)

    Переопределение позволяет подклассам (наследникам) изменять поведение методов родительского класса.
    Переопределение методов происходит когда наследник (подкласс) предоставляет специфическую реализацию метода,
    который уже определен в родителе(супер-классе).

 */
public class MathOperations {

    public static void main(String[] args) {
        System.out.println(sum(1,2)); // Какой метод использовать, выбирается на моменте компеляции
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
