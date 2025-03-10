package lesson_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */
/*
    В Java константа переменная, изменить которую неможет ни один объект в котором она находиться.
   Такая переменная создается и инициализируется один раз, для всех экземпляров класса.
   В Java константой считается не та переменная, которую нельзя изменить в рамках одного объекта.

    static - делает переменную единственной, для всех экземпляров,
    а final делает ее не изменяемой.
 */
public class ConstantDemo {

    public static final double PI = 3.1415926; // Имена констант, пишуться капсом. Ну просто так принято)
    public static final int[] ints = new int[5]; // не является константой. Так как элементы массива можно менять.
    //( состояние объекта может быть изменено)
    public static final String COUNTRY = "Germany"; // константа, невозможно изменить состояние строки и состояние объекта
    public static final String[] colors = {"blue", "red", "green"}; // не константа, так как значени в массиве можно изменить!

    public static double doublePiSqrt() {
        return 2 * PI * PI;
    }
}
