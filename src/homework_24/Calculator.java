package homework_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */

/**
 * Task 1
 * Класс "Калькулятор"
 * Создайте класс Calculator, который будет предоставлять
 * ------------------------------------
 * базовые арифметические операции: сложение, вычитание, умножение и деление
 * Класс должен содержать:
 * -------------------------------------
 * Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {

    // Метод для сложения
    public static double addition(double x, double y) {
        return x + y;
    }

    // Метод для вычитания
    public static double subtraction(double x, double y) {
        return x - y;
    }

    // Метод для умножения
    public static double multiplication(double x, double y) {
        return x * y;
    }

    // Метод для деления
    public static double division(double x, double y) {
        return x / y;
    }

}
