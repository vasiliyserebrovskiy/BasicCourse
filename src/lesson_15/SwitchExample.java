package lesson_15;

import javax.security.sasl.SaslClient;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @author: Vasilii Serebrovskii
 * @date: 17.02.2025
 * @description: Краткое описание класса
 */
public class SwitchExample {
    public static void main(String[] args) {
        //Switch - переключатель. Выполняет различные действия, в зависимости от значения переменной или выражения.
        /* Особенно хорош, когда мы выбираем из известного и конечного кол-ва вариантов

            switch (переменная(выражение)) {
                case <1>:
                    <блок кода для значения 1>
                case <2>:
                    <блок кода для значения 2>
                default:
                    <блок кода по умолчанию, если ни одно из значений не совпало>
            }

         */
        int x = 11;
        // IF - ELSE -IF - ELSE
        if (x == 5) {
            System.out.println("x = 5");
        } else if (x == 7) {
            System.out.println(" if-else x = 7");
        } else {
            System.out.println("else: что-то другое");
        }
        System.out.println("===== SWITCH =====");
        // CASE - без break будет проливание
        switch (x) {
            case 5:
                System.out.println("switch: x = 5");
                break;
            case 7:
                System.out.println("switch: x = 7");
                break;
            default:
                System.out.println("switch: что-то другое");
        }

        System.out.println("Строка за пределами switch");

        System.out.println("===== ======");

        //Введите число от 1 до 4 в зависимости от числа выводим разные сообщения
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Введите число от 1 до 4: ");
        int input = sc.nextInt();
        sc.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
            case 4:  // аналогична x == 3 или x == 4
                System.out.println("Вы ввели 3 или 4");
                break;
            default:
                System.out.println("Default: я таких чисел не знаю");
        }*/

        //Java 14 oder hoche
        /*switch (input) {
            case 1 -> System.out.println("Opt you input 1");
            case 2 -> System.out.println("Opt you input 2");
            case 3,4 -> System.out.println("Вы ввели 3 или 4");
            default -> System.out.println("Default: я таких чисел не знаю");

            String result = switch (input) {
                case 1 -> "znachenie";
                case 2 -> "zbachenie 2";
                case 3,4 -> "znachenie 3";
                default -> "ne znajy";
            };
        }*/

        /*
            У ребенка есть карманные деньги 100 сейчас.
            Ребенок получает оценку в школе (от 1 до 5)
            за хорошие оценки ребенок получает
            за плохие отбирают
            5 - +20
            4 - +10
            3 - 0
            2 - -20
            1 - все -
         */
        System.out.println("===== money ======");

        Random random = new Random();
        int note = random.nextInt(5) + 1;
        int money = 100;
        System.out.println("Сейчас денег: " + money);
        System.out.println("Ребенок получил оценку: " + note);
        switch (note) {
            case 1:
                money = 0;
                break;
            case 2:
                money -= 20;
                break;
          //  case 3: можно не писать, так как ничего не делаем
            //    break;
            case 4:
                money += 10;
                break;
            case 5:
                money += 20;
                break;
        }

        System.out.println("У ребенка теперь " + money + " денег.");

        // java 14 и выше
        /*
        money = 100;
        money = switch (note) {
            case 5 -> money + 20;
            case 4 -> money + 10;
            case 2 -> money - 10;
            case 1 -> 0;
            default -> money; // нужно так как у нас нет кейса для 3
        };

         */

        // Метод ТРИМ
        System.out.println("У меня есть загадка");
        System.out.println("Что это: желтый с рогами и полный зайцев?");
        System.out.println("Как думаешь?");
        String answer = sc.nextLine();
        System.out.println("введенное значение = " + answer);
        // троллейбус , Троллейбус, Nhjkktq,ec и т.д.
        String answerClean = answer.trim().toLowerCase();
        System.out.println("Введенный ответ: " + answerClean);
        switch (answerClean) {
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец угадал");
                break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался! Правильный ответ - Троллейбус");
            default:
                System.out.println("Ответ не верный, попробуй еще раз!");

        }

    }
}
