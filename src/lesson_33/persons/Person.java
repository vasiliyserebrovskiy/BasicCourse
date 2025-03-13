package lesson_33.persons;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.03.2025)
 */
public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    test@mail.com.net
    1. Должна быть @ и только одна
    2. точка после собаки
    3. после последней точки есть два или более символов
    4. Алфавит, цифры, '-','_', '@', '.'
    5. До собаки должен быть хотя бы 1 символ
    6. первый символ - должен быть буквой
     */
    private boolean isEmailValid(String email) {
        // 1. Собака
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;
        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;
        //3. После точки два символа
        int lastDotIndex = email.lastIndexOf('.');
        //if (email.length() - lastDotIndex <= 2) return false;
        if (lastDotIndex >= email.length() - 2) return false;
        //4. Алфавит
        /* проверяю текущий символ. Если нахожу хоть один не подходящий возвращаю false
         */
        // У строки String еть метод. toCharArray - возвращает массив чаров
        for (char ch : email.toCharArray()) {
            // Проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch)
                    || ch == '-' || ch == '_' || ch == '.' || ch == '@';

            // если не подходит (isPass = false) возвращаем false
            if (!isPass) return false;
        }
        //5. до собаки должен быть хотябы один символ
        if (indexAt == 0) return false;
        if (!Character.isAlphabetic(email.charAt(0))) return false;
        //6. Первый символ не число

        return true;
    }

    /*
        Требования к паролю:
        1. Длина пароля >= 8
        2. Должна быть 1 цифра
        3. Должна быть минимум одна маленькая буква Character.isLowerCase()
        4. Должна быть минимум одна большая буква Character.isUpperCase()
        5. Должен быть спец символ - "!", "%","()[];-$@"

        Пароль должен удовлетворять всем требованиям сразу
        5 булеан переменных на каждый случай
        и пароль будет подходить только если все 5 имеют тру

     */

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {
        boolean isLength = password.length() >= 8;
        boolean isDigit = false;
        boolean isLowerChar = false;
        boolean isUpperChar = false;
        boolean isSpecialSymbol = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerChar = true;
            if (Character.isUpperCase(ch)) isUpperChar = true;
            if ("!%-$@()[];".indexOf(ch) != -1) isSpecialSymbol = true;
            if (isDigit && isLowerChar && isUpperChar && isSpecialSymbol) break;
        }

        return isLength && isDigit && isLowerChar && isUpperChar && isSpecialSymbol;
    }

    @Override
    public String toString() {
        return "Person {" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
