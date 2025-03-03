package homework_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */
public class Hw25Main {
    public static void main(String[] args) {

        System.out.println("Длинна окружности с радиусом 20 = " + CalculatorModified.circleLength(20));
        System.out.println("Площадь круга радиусом 20 = " + CalculatorModified.circleArea(20));

        /*Task 2
        Неизменяемая переменная
            •	Объявите переменную final int MAX_USERS = 100;.
            •	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
            •	Объясните, что произошло при попытке изменения значения.*/

        final int MAX_USERS = 100;
        // Будет ошибка компиляции: java: cannot assign a value to final variable MAX_USERS
       // MAX_USERS = 150; // нельзя присвоить новое значение переменной MAX_USERS, так как она объявлена как final.
        // Модификатор final указывает на то, что переменной MAX_USERS может быть присвоено значение только один раз.

        ImmutablePoint.printMessage("This is a message");
    }
}
