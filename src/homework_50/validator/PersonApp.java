package homework_50.validator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.04.2025)
 */
public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "qwerty");
        System.out.println("person: " + person);

        //Person person1 = new Person("john.gmail.com", "qwerty");
        //System.out.println("person1: "+ person1);

        person.setPassword(null);
        person.setPassword("qwertyui");
        person.setPassword("qwertyu1");
        person.setPassword("qWertyu1");
        person.setPassword("QWERTYU1");
        person.setPassword("qWe#tyu1");
        System.out.println("person password: " + person);


    }
}
