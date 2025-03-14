package lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (14.03.2025)
 */
// Тесты будут выполнять в алфавитном порядке, названий тестовых методов
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {

    @Test
    void testB() {
        System.out.println("test B");
    }

    @Test
    void testA() {
        System.out.println("Test A");
    }

    @Test
    void testZ() {
        System.out.println("test Z");
    }

    @Test
    void testL() {
        System.out.println("Test L");
    }
}
