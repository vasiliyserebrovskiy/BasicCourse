package homework_32.task_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList<U>, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.

 */
public class Task_02_App {
    public static void main(String[] args) {

        MyList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);

    }
    // правильнее использовать ссылки интерфейса а не класса. Поэтому MyList, хотя можно и MyArrayList.
    public static <T,U> void printTwoLists(MyList<T> firstArray, MyList<U> secondArray) {
        for (int i = 0; i < firstArray.size(); i++) {
            System.out.println(firstArray.get(i));
        }
        for (int i = 0; i < secondArray.size(); i++) {
            System.out.println(secondArray.get(i));
        }

    }

}
