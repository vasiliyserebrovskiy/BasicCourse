package lesson_15;

/**
 * @author: Vasilii Serebrovskii
 * @date: 17.02.2025
 * @description: Краткое описание класса
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // Тернарный оператор - это краткая форма записи if else которая позволяет присваивать значение переменной в зависимости от условия
        int age = 20;

        //Введите ваш возраст

        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетний";
        }

        System.out.println(status);

        // переменная = (условие) ? значение_если_true : значение_если_false
        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println("result = " + result);

        int x = 10;
        System.out.println("Значение в переменной x " + ((x >= 0) ? "положительное" : " отрицательное"));
    }
}
