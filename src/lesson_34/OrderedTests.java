package lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (14.03.2025)
 */
// 1 ставим нотацию, что будем упорядочивать тесты
    // Порядок будет определяться аннотацией @Order()
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
    // по-умолчанию тестовые методы выполняются случайным образом(чтобы не писать зависимых тестов)
    // Определение последовательности выполнения тестов
    // Можем организовать последовательность тестов


    @Test
    @Order(10)
    void firstTest() {
        System.out.println("First test");
    }

    @Test
    @Order(20)
    void secondTest() {
        System.out.println("Second test");
    }

    @Test
    @Order(15)
    void thirdTest() {
        System.out.println("Third test");
    }

    @Test

    void randomTest() {
        System.out.println("Random Test");
    }
}
