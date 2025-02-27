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
        magic.add(20,30,40);
        System.out.println(magic.toString());
        magic.test();

        int[] fromMagic = magic.toArray();
        System.out.println("from magic = " + Arrays.toString(fromMagic));

        System.out.println("\n======================== remove");
        System.out.println(magic.removeByValue(30));
        System.out.println(magic.toString());

        System.out.println("Индекс элемента 10 с конца = " + magic.lastIndexOf(10));

    }
}
