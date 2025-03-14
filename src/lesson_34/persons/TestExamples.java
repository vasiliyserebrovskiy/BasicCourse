package lesson_34.persons;

import homework_24.Calculator;

import lesson_27.Autobus;
import lesson_27.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    @BeforeEach // такой метод, будет выполняться перед каждым тестовым методом
    void setUp() {
        System.out.println("Метод beforeEach");
    }
    /*
    @BeforeAll (static) - выполниться один раз перед первым тестом
    @AfterEach - после каждого тестового метода
    @AfterAll (static) - после всех тестовых методов
    @Disabled - указывает что тест отключен и выполняться он не будет
     */

    @BeforeAll
    static void one() {
        System.out.println("Method BeforAll");
    }

    // @Test - указывает что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов.
    @Test
    public void testAddition() {
        double result = Calculator.addition(2, 3);
        System.out.println("Test addition!");
        // result хранит реальное(фактическое) значение
        // Ожидаемое 5.0

        // Методы проверки утверждений
        Assertions.assertEquals(5.0, result); // метод проверяет, равны ли два значения. Тест будет пройден если два значения равны.
        //assertEquals(expected, result)
        Assertions.assertNotEquals(0, result); // тест будет пройден если, неожидаемый результат не совпадет с "неожидаемым" результатом
        Assertions.assertTrue(result >= 4); // метод проверяет, что условие верно(возвращает true)
        assertEquals(10, 5 + 5); // статический импорт позволяет использовать методы, без обращения к классу

        assertFalse(result > 10); // проверяет что условие ложно

        assertNull(null); // тест будет пройден если объект равен null. Проверяет что объект null
        assertNotNull("String"); // проверяет что объект не равен null

    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Тест метода считается пройденным, если в методе нет ни одного ложного утверждения!
        // В том числе пустой(без утверждений) считается пройденным!
    }


    // Параметризованные тесты. Позволяют выполнить один и тот же тест с разными параметрами


    @ParameterizedTest
    @ValueSource(strings = {"apple","banana","kiwi", "chery"})
    public void testFruits(String fruit) {
        System.out.println("Current value = " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() >= 4);

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    public void testStatic(int value) {
        // Значения static полей не сбрасываются
        System.out.println("static value = " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "111"), 10);
        System.out.println(bus);
    }

    // Источник данных в формате CSV - табличный формат
    // файл в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit) {
        System.out.println("Stream current value = " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana","kiwi", "chery"); // В поток можно впихнуть null
    }


    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("current value " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals );
        int result = value * value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,16,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String email) {
        System.out.println("Person = " + person);
        System.out.println("Email = " + email);
    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@tes.com", "Passw0rd!");
        return Stream.of(
                Arguments.of(person, "newTest@Test.com"),
                Arguments.of(new Person("mail@mail.com", "Passw0rd!"), "pass.com")
        );
    }
}