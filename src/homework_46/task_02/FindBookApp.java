package homework_46.task_02;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.04.2025)
 */
/*
Task 2
Поиск книги в библиотеке
Создайте класс Library, в котором хранится список книг. У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:

Создайте класс Book с полями title и author, и сделайте для них геттеры. +
Создайте класс Library, в котором будет список книг. +
Реализуйте метод findBookByTitle, который ищет книгу по названию. +
В main() методе попробуйте:
Найти книгу, которая точно есть. +
Найти книгу, которой нет. +
Вывести информацию о книге, если она найдена. +
Вывести "Книга не найдена", если её нет. +
 */
public class FindBookApp {

    public static void main(String[] args) {

        Library myLibrary = new Library();

        //myLibrary.printLibrary();

        Optional<Book> book = myLibrary.findBookByTitle("Test 1");

        System.out.println("===== Успешный поиск книги =====\n");
        if (book.isPresent()) {
            Book findedBook = book.get();
            System.out.println("Найдена книга: " + findedBook);
            System.out.println("Название книги: " + findedBook.getTitle() + ", автор: " + findedBook.getAuthor());
        } else {
            System.out.println("К сожалению, книга не найдена.");
        }
        System.out.println("\n===== Не успешный поиск книги =====\n");

        book = myLibrary.findBookByTitle("Test 17");
        if (book.isPresent()) {
            Book findedBook = book.get();
            System.out.println("Найдена книга: " + findedBook);
            System.out.println("Название книги: " + findedBook.getTitle() + ", автор: " + findedBook.getAuthor());
        } else {
            System.out.println("К сожалению, книга не найдена.");
        }

    }
}
