package lesson_30.interfaces;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
// Если клас реализует интерфейс, то он обязан реализовать все абстрактные методы, объявленные в интерфейсе.
public class Book implements Printable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title,author);
    }
}
