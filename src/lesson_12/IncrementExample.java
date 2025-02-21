package lesson_12;

public class IncrementExample {
    public static void main(String[] args) {
        // Инкриминирование
        int x = 5;
        x = x + 10;
        x += 5; // x = x + 5
        System.out.println("x = " + x);
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 5;
        System.out.println("13 строка -> x = " + x);

        // Инкремент
        x++; // x = x + 1 oder x += 1 - увеличение на 1
        System.out.println("x = " + x);
        // Декремент
        x--; // x = x - 1 oder x -= 1 - уменьшение на единицу
        System.out.println("x = " + x);

        /*
        Инкремент и декремент можно записать по разному
         1 после переменной x++ или x-- постфикс
         2 перед переменной ++x или --x - префикс

            Если запись постфикс (х++) то сначала используется текущее значение переменной, а потом оно будет увеличено

         */

        int var = 100;
        System.out.println("var = " + var++);
        System.out.println("var after = " + var);

        int y = 100;
        System.out.println("y = " + ++y);
        System.out.println("y after = " + y);




    }
}
