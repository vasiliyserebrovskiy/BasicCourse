package lesson_32.methods;

import lesson_32.hw_31.MyList;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
public class Utils {

    // поменять местами два элемента
    public static <T> void swap(T[] array, int idx1, int idx2) {

        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Метод который возвращает первый элемент в списке
    public static <T> T getFirst(MyList<T> list) {

        if (list.isEmpty()) return null;

        return list.get(0);
    }

    // Ограничение сверху Upper Bound
    // Ограничить диапазон принимаемых типов данных
    // <T extends SomeClass> - это значит, что тип T должен быть либо классом SomeClass либо его потомком!
    public static <T extends Number> int sumElements(T... elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }

        return sum;
    }

    // ? - WildCard - "неизвестный" или любой тип
    //? extends Number - и это будет значить любой тип являющийся наследником Number
    public static double listSum(MyList<? extends Number> listNumbers) {
        double sum = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            sum += listNumbers.get(i).doubleValue();
        }

        return sum;
    }

    // Oграничение снизу LowBound
    // super Integer - ограничение снизу, сюда можно передать только Integer и его родителей. Работаем с неизвесным типом, который
    // является классом Integer или его родителем (суперклассом)
    public static void addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("list =" + list);
    }


}
