package lesson_49.validator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.04.2025)
 */
public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "qwerty");
        System.out.println("person: "+ person);

        Person person1 = new Person("john.gmail.com", "qwerty");
        System.out.println("person1: "+ person1);



    }
}
