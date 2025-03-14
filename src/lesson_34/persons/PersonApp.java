package lesson_34.persons;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.03.2025)
 */
/*
Task 1
Написать в классе Person метод для проверки валидности пароля
Требования к паролю:
Длина пароля >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква -> Character.isLowerCase()
Должна быть мин 1 большая буква
Должна быть мин 1 специальный символ: "!#%$@&*()[],.-"
 */
public class PersonApp {
    public static void main(String[] args) {

        //Person person = new Person("test@mail.net", "%passWord1"); // qwerty1!Q
        Person person = new Person("test@mail.net", "!passWord3");

        System.out.println(person);


    }
}
