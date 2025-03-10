package lesson_30.interfaces;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class App {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита","М.Булгаков");

        book.print();
        book.defaultMethod();

        Journal journal = new Journal("Cosmopolitan", 154);
        System.out.println("====================");
        journal.print();
        journal.defaultMethod();
        System.out.println("====================");
        //Может появиться ссылка на интерфейс
        // Тип ссылки типа интерфейс, набор методов доступных по ссылке - методы, которые прописаны в интерфейсе
        // А объект класса, который реализовал данный интерфейс
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки
        Printable printable2 = new Book("Философия Java", "Б. Эккель");
        printable2.print();
        System.out.println("====================");
        Printable.testStatic("Hello");

        System.out.println("====================");

        ColorPrintable presentation = new Presentation("Inheritance","Noname","Inheritance in OOP");

        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();
    }
}
