package lesson_32.hw_31;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> integerList = new MagicArrayList<>();
        integerList.add(10);
        System.out.println("integerList = " + integerList);
        integerList.addAll(120, 250, 100, -100, -200, 0);
        System.out.println("integerList = " + integerList);

        Integer value = integerList.get(0);
        System.out.println("value = " + value);
        System.out.println("integerList.size()" + integerList.size());

        int index = integerList.indexOf(120);
        System.out.println("120 index = " + index);

        index = integerList.indexOf(250);
        System.out.println("index of 250 " + index);

        System.out.println("\n==========");

        System.out.println("integerList = " + integerList);
        System.out.println(integerList.remove(Integer.valueOf(0)));
        System.out.println("integerList = " + integerList);

        // NPE : из-за добавления null в качестве значения
        integerList.add(null);
        System.out.println("integerList = " + integerList);
        System.out.println(integerList.lastIndexOf(null));
        System.out.println(integerList.indexOf(null));

    }

}
