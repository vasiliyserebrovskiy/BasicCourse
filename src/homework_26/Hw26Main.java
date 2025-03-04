package homework_26;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class Hw26Main {


    public static void main(String[] args) {

        // Task 3:
        String result = Hw26Main.getStringAbbreviation();
        System.out.println(result);

        System.out.println("========== Task 1 ==========");
        System.out.println("===== Shape =====");
        Shape shape = new Shape("My Schape");
        shape.setColor("green");
        shape.getInfo();
        System.out.println("===== Rectangle ======");
        Rectangle rectangle = new Rectangle("My Rectangle");
        rectangle.setColor("red");
        rectangle.setDimension(10, 20);
        rectangle.getInfo();
        rectangle.calculateArea();
        System.out.println("===== Circle ======");
        Circle circle = new Circle("My Circle");
        circle.setColor("blue");
        circle.setRadius(20);
        circle.getInfo();
        circle.calculateArea();
        circle.setName("My new Circle");
        circle.getInfo();


    }

    /**
     * Task 3 * Опционально
     * Написать метод, который запрашивает у пользователя строку, состоящую из несколько слов и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
     *
     * @return String
     */
    public static String getStringAbbreviation() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Пожалуйста введите строку из несколькиз слов: ");
        String userString = sc.nextLine().trim();

        String[] words = userString.split("\\s+");
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
        }
        return sb.toString();
    }

}
