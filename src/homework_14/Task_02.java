package homework_14;

/**
 * Task 2
 * Создайте две переменные типа int.
 * -------------------------------------
 * В первую переменную запишите случайное значение от 0 до 50.
 * Во вторую переменную случайное значение от 0 до 100.
 * (опционально) Во вторую переменную случайное значение от -20 до 30.
 * Проверьте:
 * -------------------------------------
 * равны ли переменные,
 * не равны ли они,
 * больше ли a, чем b,
 * и меньше ли b, чем a.
 * Выведите результат на экран.
 */

public class Task_02 {
    public static void main(String[] args) {
        int a = 37;
        int b = 63;

        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b : " + (a > b)); // false
        System.out.println("b < a : " + (b < a)); // false
        // b = -13
        System.out.println("===== b < 0 =====");
        b = -13;
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b : " + (a > b)); // true
        System.out.println("b < a : " + (b < a)); // true
    }
}
