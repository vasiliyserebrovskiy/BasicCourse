package lesson_23;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.02.2025)
 */
public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", 8, 5);
        cat.sayMeow();
        System.out.println(cat.toString());

        // System.out.println(cat.age); // age -> private

        //  cat.age = -1000; // age -> private
        // cat.weight = 1500;

        //cat.name = null;
        System.out.println(cat.toString());

        // cat.testMethod(); // testMethod() -> private

        Cat cat2 = new Cat(null, 150, -20);
        System.out.println(cat2.toString());
        System.out.println("\n========================");

        int catAge = cat.getAge();
        System.out.println("В следующем году коту будет = " + (catAge + 1));
        System.out.println("Вес кота = " + cat.getWeight());
        System.out.println("Имя кота = " + cat.getName());

        cat.setAge(15);
        cat.setAge(-10);
        System.out.println(cat.toString());

        cat.setWeight(20);
        System.out.println(cat.toString());
        cat.setWeight(-10);
        System.out.println(cat.toString());

        cat.isProtected = true;
        System.out.println("isProtected = " + cat.isProtected);
        cat.isDefault = false;
        System.out.println("isDefault = " + cat.isDefault);


    }
}
