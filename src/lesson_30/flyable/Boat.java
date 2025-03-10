package lesson_30.flyable;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class Boat implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Лодка плывет!");
    }
}
