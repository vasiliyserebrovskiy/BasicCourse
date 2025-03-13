package homework_32.task_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
 */

public class Task_03_App {
    public static void main(String[] args) {

        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0

        NumericPair<Integer, Double> doublePai2 = new NumericPair<>(5, 4.5);
        System.out.println(doublePai2.sum()); // Вывод: 10.0

        Byte btVal = 10;

        NumericPair<Number, Byte> bytePair = new NumericPair<>(btVal, btVal);
        System.out.println(bytePair.sum());
    }
}
