package lesson_17;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.02.2025)
 */
public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "HeLlO";
        String str2 = "hello";

        boolean compare = str1.equalsIgnoreCase(str2);
        System.out.println(compare);
    }
}
