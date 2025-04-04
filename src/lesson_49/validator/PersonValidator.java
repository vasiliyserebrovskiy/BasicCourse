package lesson_49.validator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.04.2025)
 */
public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {

        // throw - ключевое слово, используется для явного выброса исключения
        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Собака
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', (indexAt + 1));
        if (indexAt + 1 == dotIndexAfterAt) throw new EmailValidateException(". after @");

        //3. После точки два символа
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        //4. Алфавит
        for (char ch : email.toCharArray()) {
            // Проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch)
                    || ch == '-' || ch == '_' || ch == '.' || ch == '@';

            if (!isPass) throw new EmailValidateException("Illegal symbol");
        }
        //5. до собаки должен быть хотя бы один символ
        if (indexAt == 0) throw new EmailValidateException("no character before @");

        //6. Первый символ не число
        if (!Character.isAlphabetic(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

    }

}
