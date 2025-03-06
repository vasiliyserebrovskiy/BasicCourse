package lesson_28.animals;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice(); // Унаследован от animal
        System.out.println(cat.toString());

        cat.eat();

        Dog dog = new Dog();
        dog.voice(); // Если в потомке не переопределен метод, будет вызван метод родителя!

        System.out.println(dog);

        System.out.println("\n ====================");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster);

        Object object = new Object();

    }
}
