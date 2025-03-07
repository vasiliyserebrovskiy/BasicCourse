package lesson_29.children;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class App {

    public static void main(String[] args) {

        Parent parent = new Parent("John");
        System.out.println(parent.name);

        Child child = new Child();
        System.out.println(child.name);
        System.out.println(child.age);
        Child child2 = new Child("Child", 16);
        System.out.println(child2.name);
        System.out.println(child2.age);
        parent.show();
        child2.show();

    }
}
