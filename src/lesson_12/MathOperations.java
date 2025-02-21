package lesson_12;


public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;
        int result;

        //Сложение
        result = 15 + 6;
        System.out.println("result: " + result);

        // 1 Сначала происходит вычисление результата справа от знака присвоения
        // 2 Результат вычисления присваивается  в переменную слева от знака равно
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        // Вычитание
        result = var1 - var2;
        System.out.println("var1 - var 2 = " + result);

        // Умножение
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Целочисленное деление / (между двумя целыми числами)
        // 20 / 7 -> 2 целые и 6 в остатке (2.85)
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result); // 2 если числа целые

        // Взятие остатка от деления
        result = var1 % var2;
        System.out.println("var 1 % var2 = " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("==========================");

        double doubleVar = 20.0; // все числа, написанные с . воспринимаются компилятором как числа в формате double
        double doubleVar2 = 7.0d; // d - обозначает что число в формате double. Но так обычно никто не пишет

        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleRes);




    }

}
