package homework_34.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    // Testing method setEmail()

    // Test validEmail
    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail) {
        person.setEmail(validEmail);
        assertEquals(validEmail, person.getEmail());
    }

    // Test notValidEmail
    @ParameterizedTest
    @MethodSource("emailNotValidDataArguments")
    void testNotValidEmailSet(String notValidEmail) {
        person.setEmail(notValidEmail);
        assertNotEquals(notValidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> emailNotValidDataArguments() {
        return Stream.of("test#gmail.com", "test@.gmail.com", "test@gmail.co.m", "test@gmail.com.", "1test@gmail.com",
                "test%test@gmail.com", "test@test@gmail.com", "@test.mail.com", "te#st@gmail.co.m", "te&st@gmail.com", "te!st@gmail.com",
                "tеst@gmail.com.", "test@gm&ail.com", "test@gmail.co*m", "!test@gmail.com.", "test@+gmail.com");
    }

    // Testing method setPassword()
    //Test validPassword
    @ParameterizedTest
    @ValueSource(strings = {"P@ssw0rd", "Qwer@ty1", "Hb2op$is1"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        assertEquals(validPassword, person.getPassword());
    }

    //Test notValidPassword
    @ParameterizedTest
    @MethodSource("passwordNotValidDataArguments")
    void testNotValidPasswordSet(String notValidPassword) {
        person.setPassword(notValidPassword);
        assertNotEquals(notValidPassword, person.getPassword());
        assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> passwordNotValidDataArguments() {
        return Stream.of("password", "Password", "P@SSW0RD", "p@ssw0rd", "P@ssword", "P@ssw0r", "12345678",
                "12345cV6", "@#$%ˆwA", "WR#%76T3", "1@v", "18G_s1");
    }

}