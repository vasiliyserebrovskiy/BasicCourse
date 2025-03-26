package lesson_37.enums;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.03.2025)
 */
public class AppTrafic {

    public static void main(String[] args) {

        Colors color = Colors.RED;
        System.out.println("color = "+color);

        Colors[] colors = Colors.values(); // получаю массив всех значений ENUM

        for (Colors current : Colors.values()) {
            System.out.println(current);
        }

        // может нам понадобиться, возвращает константу ENUM по указанному имени в строке
        Colors red = Colors.valueOf("RED");

        // ENUM безопасно сравнивать оператором == equals не обязателен
        System.out.println(color == Colors.RED);

        // У каждой константы есть парядковый номер начиная с 0
        System.out.println("номер красного = "+color.ordinal());

        TraficLight traficLight = new TraficLight("SN001", "Berlin", Colors.YELLOW);

        System.out.println(traficLight);

    }
}
