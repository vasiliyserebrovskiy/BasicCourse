package homework_12;

/**
 * Задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.
 * --------------------------------------------
 * Переменная 1 - сколько Вам полных лет
 * Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
 * Переменная 3 - Ваше имя.
 * Используя форматированный вывод выведите в консоль строку вида:
 * --------------------------------------------
 * Привет! Меня зовут Сергей, мне 18 лет. Я покупаю молоко по 1.50 за литр.
 */

public class Task_03 {
    public static void main(String[] args) {
        int age = 42;
        String name = "Vasilii";
        double price = 1.10;

        System.out.printf("Привет! Меня зовут %s, мне %d года. Я покупаю молоко по %.2f за литр.\n", name, age, price);

    }
}
