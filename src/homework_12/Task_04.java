package homework_12;

/**
 * Task 4
 * Неявное преобразование int в double
 * Напишите программу, которая:
 * --------------------------------------------
 * Объявляет переменную типа int и присваивает ей значение 10.
 * Присваивает значение этой переменной в переменную типа double с именем myDouble.
 * Выводит значение myDouble на экран.
 * Ожидаемый результат:
 * --------------------------------------------
 * Значение myDouble: 10.0
 */

public class Task_04 {
    public static void main(String[] args) {
        int myValue = 10;
        double myDouble;

        myDouble = myValue;
        System.out.println("Значение myDouble: " + myDouble);
    }
}
