package lesson_34.persons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail,startPassword);
    }

    /*
    Метод проверки валидного email
    1. Берем валидный email
    2. устанавливаемым его сетером person
    3. Проверяем что email изменился на новое значение
     */
    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);
        assertEquals(validEmail, person.getEmail());

    }

    /*
    1. Берем не валидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: объект не измениться (такой емэйл установлен не будет)
        3.1 у объекта person старый email(НЕ будет равно невалидный email) assertNotEquals()
        3.2 значение поля email у person должно сталось прежним
     */

    // по-умолчанию тестовые методы выполняются случайным образом(чтобы не писать зависимых тестов)
    // Определение последовательности выполнения тестов
    // Можем организовать последовательность тестов


}