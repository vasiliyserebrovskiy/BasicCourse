package homework_49.validator;

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

        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
        }

    }

    private boolean isEmailValid(String email) {
        if (email == null) return false;

        // 1. Собака
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', (indexAt + 1));
        if (indexAt + 1 == dotIndexAfterAt) return false;

        //3. После точки два символа
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) return false;

        //4. Алфавит
        for (char ch : email.toCharArray()) {
            // Проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch)
                    || ch == '-' || ch == '_' || ch == '.' || ch == '@';

            if (!isPass) return false;
        }
        //5. до собаки должен быть хотя бы один символ
        if (indexAt == 0) return false;

        //6. Первый символ не число
        if (!Character.isAlphabetic(email.charAt(0))) return false;

        return true;
    }

    public void setPassword(String password) {

        try {
            PersonValidator.validatePassword(password);
            System.out.println("Пароль прошел проверку");
            this.password = password;
        } catch (PasswordValidateException e) {
            System.out.println("Вы ввели некорректный password: " + e.getMessage());
        }

    }

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        // boolean isLength = password.length() >= 8;
        boolean isDigit = false,
                isLowerChar = false,
                isUpperChar = false,
                isSpecialSymbol = false;

        String specialSymbols = "!#%$@&*()[],.-";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerChar = true;
            if (Character.isUpperCase(ch)) isUpperChar = true;
            if (specialSymbols.indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        return isDigit && isLowerChar && isUpperChar && isSpecialSymbol;
    }

    @Override
    public String toString() {
        return String.format("Person { email = \"%s\", password = \"%s\" }", email, password);
    }
}
