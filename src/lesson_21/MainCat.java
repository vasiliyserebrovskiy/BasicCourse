package lesson_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class MainCat {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создание объекта класса кот
        // всегда при вызове new, физически в памяти создается новый объект, в данном случае типа cat
        // 1. Физически в памяти создается объект типа Cat
        // 2 Вызывается конструктор, для инициализации свойств объекта, т.е. заполнение полей значениями
        /*
            При создании объекта класса все его поля инициализируются какими-то значениями.
            Поведение по умолчанию (если не задано другое поведение) поля инициализируются значениями по умолчанию для своего типа данных
            для числовых -> 0 / 0.0
            для boolean -> false
            для всех ссылочных, в том числе String -> null
         */

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя кота: " + catName);

        System.out.println("Возраст: " + cat.age);

        Cat cat1 = new Cat("Max"); // Будет создан новый объект класса cat.
        // Строка, которая была передана в конструктор будет присвоена свойству name объекта класса.

        System.out.println("Имя кота 2: " + cat1.name);
        System.out.println("Возраст кота 2: " + cat1.age);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("\n=============\n");
        Cat cat2 = new Cat("Diamand", "red");
        //System.out.println("Имя кота 3: " + cat3.name);
        //System.out.println("Цвет кота 3: " + cat3.color);
        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("Имя = "+barsik.name);
        System.out.println("Возраст = "+barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;

        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("barsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("\n==========\n");
        catClone = new Cat("Kratos", "Black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // ничто в переменной!!! Нет привязки к объекту
        // У null нельзя вызвать метод, присвоить или получить значение поля/свойства NPE (NullPointerException)
//        catClone.whoAmI(); // NullPointerException !!!!
//        catClone.age = 44; // NullPointerException !!!!

        //Проверка на null

        if (catClone != null) {
            catClone.whoAmI();
        } else {
            System.out.println("В переменной храниться null!");
        }

    }
}
