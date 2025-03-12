package lesson_32.methods;

import jdk.jshell.execution.Util;
import lesson_32.hw_31.MagicArrayList;
import lesson_32.hw_31.MyList;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
public class MethodsApp {
    public static void main(String[] args) {

        Integer[] integers = {0, 1, 2, 3, 4, 5, 6};
        Utils.swap(integers, 2, 5);
        System.out.println(Arrays.toString(integers));


        String[] strings = {"Hello", "Java", "World", "JS"};
        Utils.swap(strings, 1, 2);
        System.out.println(Arrays.toString(strings));

        int[] intArray = {1, 2, 3, 4, 5, 6};
        //Utils.swap(intArray, 1, 2);

        MyList<Double> doubleList = new MagicArrayList<>(new Double[]{1.5,2.5,3.5});
        Double firstValue = Utils.getFirst(doubleList);
        System.out.println("firstValue = " + firstValue);

        MyList<String> stringList = new MagicArrayList<>(strings);
        System.out.println(Utils.getFirst(stringList));

        System.out.println("\n================");
        //int sum = Utils.sumElements("Hello", "World"); нельзя впихнуть строку - типа безопасность
        int sum = Utils.sumElements(1, 3.5, 10, 11.5, 1.1);
        System.out.println("sum = " + sum);

        double sumDouble = Utils.listSum(doubleList);
        System.out.println("sumDouble = "+sumDouble);

        System.out.println("/n=======");

        MyList<Integer> integersList = new MagicArrayList<>(integers);
        Utils.addNumbers(integersList);

    }
}
