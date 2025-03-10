package lesson_30.interfaces;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class Presentation implements ColorPrintable {
    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String thema) {
        this.title = title;
        this.author = author;
        this.theme = thema;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентацию в цвете: Автор: %s, Title: %s, Theme: %s\n", author,title, theme);
    }

    @Override
    public void print() {
        System.out.printf("Печать ЧБ презентации %s автор: %s\n", title, author);
    }
}
