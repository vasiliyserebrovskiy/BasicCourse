package lesson_15;

import java.util.Random;

// ctrl + alt(option) + O (Optimize)- удаление неиспользуемых import

/**
 * @author: Vasilii Serebrovskii
 * @date: 17.02.2025
 * @description: Краткое описание класса
 */
public class IfExample {
    public static void main(String[] args) {
        //Условный оператор if, позволяет выборочно выполнять блок кода
        // Оператор принятия решения, ветвления кода

        // if (условие) оператор; или {код исполнения если значение условия true}
        int age = 10;
        if (age >= 18) System.out.println("Вы совершенно летний");
        else System.out.println("Вам меньше 18");

        System.out.println("Продолжение выполнения программы");

        if (age > 11) { // если условие выдает true
            System.out.println("Блок if ");
            System.out.println("Вы уже не ребенок");
        } else { // если условие выдает false
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age = " + age);
        }
        System.out.println("========= Score =========");

        //Условно рандомное число
        Random rand = new Random();
        //Score
        int score = rand.nextInt(101);

        if (score >= 90) {
            System.out.println("Супер " + score);
        } else if (score >= 75) {
            System.out.println("Хорошо " + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно " + score);
        } else {
            System.out.println("Плохо " + score);
        }

        System.out.println("Продолжение программы");
        System.out.println("===== MIN ======");
        // Нахождение минимального значения из нескольких чисел
        int v1 = rand.nextInt(51); // Случайное число от 0 до 50 включительно
        int v2 = rand.nextInt(51);
        int v3 = rand.nextInt(51);

        System.out.println("Исходные числа: v1 = " + v1 +  " v2 = " + v2 + " v3 = " + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) {
            min = v3;
        }

        System.out.println("Минимальное число = " + min);


        // число от -25 до + 25 rand.nextInt(51) - 25;
        // -20 до 80 rand.nextInt(101) - 20;
        // java 17 or higher rand.nextInt(10,51);

    }
}
