package lesson_24.power;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
/*
Массив объектов (массив ссылочных данных)
 */

public class PersonApp {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Read, Music");
        System.out.println(john);

        Person[] people = new Person[5]; // Создаем массив для 5 человек(5 ссылок на объекты типа Person)

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("\n=============\n");

        System.out.println("people[0] = " + people[0]);
        System.out.println(people[0].getName());

        people[0].setName("Peter");
        System.out.println(people[0]);
        System.out.println(garry);

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println(people[i].getName());
            } else {
                System.out.println("NULL!!!");
            }
        }

        System.out.println("\n================\n");
        Person test = new Person("test", 50, "coding");

        people[2] = test;
        people[2].setName("Test1");
        test.setAge(52);
        System.out.println(test);

        test = null;
        System.out.println(people[2].getHobby());

        test = people[1];
        System.out.println(test);

        /*Person deleteMe = new Person("deleteMe", 0, "crasching");
        deleteMe = null; // придет garbage collector и сотрет*/












    }
}
