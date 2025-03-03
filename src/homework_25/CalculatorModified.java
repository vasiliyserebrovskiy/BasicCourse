package homework_25;

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
 * Вычисление длины окружности и площади круга по ее радиусу
 * ------------------------
 * Класс должен содержать:
 * Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 * Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
 * Константу (число Пи)
 */
public class CalculatorModified {

    public static final double PI = 3.1415926;

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

    // Считаем длину окружности
    public static double circleLength(double radius) {
        return 2 * PI * radius;
    }

    //Считаем площадь круга
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

}
