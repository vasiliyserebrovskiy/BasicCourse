package homework_46.task_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.04.2025)
 */
public class Library {

    private List<Book> booksList = new ArrayList<>();

    public Library() {
        addBooks();
    }

    private void addBooks() {
        booksList = Arrays.asList(
                new Book("Test 1", "Test 1"),
                new Book("Test 2", "Test 2"),
                new Book("Test 3", "Test 3"),
                new Book("Test 4", "Test 4"),
                new Book("Test 5", "Test 5")
        );
    }

    public Optional<Book> findBookByTitle(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void printLibrary() {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }
}
