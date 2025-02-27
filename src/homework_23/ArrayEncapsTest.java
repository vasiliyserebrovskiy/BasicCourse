package homework_23;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.02.2025)
 */
public class ArrayEncapsTest {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        // System.out.println(magic.toString());
        magic.test();

        magic.add(10);

        test[3] = 1000;

        magic.test();
        magic.add(20, 30, 40);
        System.out.println(magic.toString());
        magic.test();

        int[] fromMagic = magic.toArray();
        System.out.println("from magic = " + Arrays.toString(fromMagic));

        System.out.println("\n======================== remove");
        System.out.println(magic.removeByValue(30));
        System.out.println(magic.toString());

        System.out.println("Индекс элемента 10 с конца = " + magic.lastIndexOf(10));
        System.out.println("Размер массива = " + magic.getCursor());

        int[] newArray = magic.getArray();
        System.out.println(Arrays.toString(newArray));
        int[] newArray2 = magic.toArray();
        System.out.println(Arrays.toString(newArray2));


        System.out.println("\n ============ Test Class Employee ===============");

        Employee employee1 = new Employee("Иванов Иван Иванович", 55);
        Employee employee2 = new Employee("Горбунков Семён Семёнович", 60, 2500);
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        employee1.setSalary(1850.50);
        employee2.setAge(150);
        System.out.println("==============================");
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("==============================");
        employee1.setName(null);
        employee2.setName("");
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("==============================");
        employee1.setName("Сидоров Иван Иванович");
        employee2.setName("Горбунков Семён Сергеевич");
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        employee2.recountSalary(20);
        System.out.println("==============================");
        System.out.println("Добавили 20% к зарплате " + employee2);
        employee2.recountSalary(-30);
        System.out.println("==============================");
        System.out.println("Отобрали 30% с зарплаты " + employee2);
        employee2.recountSalary(-130);
        System.out.println("==============================");
        System.out.println("Отобрали 130% с зарплаты " + employee2);
        employee2.recountSalary(130);
        System.out.println("==============================");
        System.out.println("Отобрали 30% с зарплаты " + employee2);


    }
}
