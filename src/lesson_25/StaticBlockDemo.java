package lesson_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.03.2025)
 */
public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10; // Инициализация значения
    // Инициализация значения, если нужно записать конкретное значение по умолчанию

    // Статический блок инициализации
    // В нем могут быть проинициализированы статические поля класса(присвоение начальных значений)
    // Статический блок инициализации
    static {
        System.out.println("Static block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }
    // Статических блоков может быть несколько
    // Инициализируются сверху вниз
    // Переменные инициализируются сверху вниз
    static {
        System.out.println("Second static");
    }

    // НЕ статические блоки инициализации (блок инициализации)
    // Выполняются при КАЖДОМ создании объекта
    // вызываются до конструктора
    // Обычно пишуться между полями и конструктором
    // Позволяют избегать дублирования кода в конструкторах, если нужно что-то общее всегда инициализировать
    // Их тоже может быть несколько, но не понятно зачем(вызываются последовательно сверху вниз)
    {
        System.out.println("Non static block RUN");
        if (counter == 0) {
            this.capacity = 50;
        }
        this.title = "DEFAULT";
    }

    //Default constructor
    public StaticBlockDemo() {
        System.out.println("Constructor RUN.");

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";
    }

    // Конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Constructor 2 RUN.");

        this.title = title;
    }

    public String toString() {
        return String.format("Title: %s, Capacity: %d, counter: %d",
                title,capacity,counter);
    }

}
