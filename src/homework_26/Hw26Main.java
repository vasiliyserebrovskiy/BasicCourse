package homework_26;

import java.util.Locale;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class Hw26Main {

    public static String getStringAbbreviation(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String myString = "Научно исследовательский институт чародейства и мастерства";

        String result = Hw26Main.getStringAbbreviation(myString);
        System.out.println(result);

    }
}
