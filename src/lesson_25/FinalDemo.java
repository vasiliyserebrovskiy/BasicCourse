package lesson_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */
public class FinalDemo {
    // ключевое значение final. Оно может применяться к классам, членам классов( методам и полям ), переменным (в том числе к аргументам метода)
    // Для примитивных типов данных, помеченных как final - это будет значить, что после инициализации этой переменной(присвоение первого значения),
    // изменить ее значение не возможно, нельзя.
    private final int capacity; //= 10; // ни в конструкторе ни в блоках инициализации, нигде изменить нельзя

    // ссылочный тип данных. Нельзя изменить значение переменной(не возможно привезать или отвязать новый объект)
    // состояние объекта, я могу изменять
    private final int[] ints = new int[5]; // [0, 0, 0, 0, 0]

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // this.capacity++; // нельзя изменить значение final переменной

        // Нельзя присвоит ссылку на другой объект или null
        //this.ints = new int[2];
        //this.ints = null;
        // состояние пожалуйста. Значения этих 5 элементов можно менять
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }
    // Параметры метода могут быть final.
    // Внутри метода, невозможно изменить значение этой переменной
    public void finalArguments(final int x, final int [] array) {
        // незя поменять значение
        //x++;

        // немогу присвоить новую ссылку
        // array = new int[4];
        // могу изменять состояние объекта
        array[0] = x;
        array[1] = 1000;
    }

    // сеттеры на финальные поля не генерируются
    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
