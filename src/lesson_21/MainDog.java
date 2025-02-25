package lesson_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);
        dog.info();

        dog.run();
        dog.run();
        dog.run();
        dog.info();



    }
}
