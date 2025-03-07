package lesson_29.children;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class Child extends Parent{
    // Скопировано из родителя
    // private String name;
     int age;

     // Если нет ни одного конструктора - будет добавлен конструктор вида
//    public Child() {
//        //Вызывается пустой конструктор родителя
//        super();
//    }
    public Child() {
        //Сначала я должен создать объект родителя
//        super(); // Java пытается вызвать пустой конструктор родителя добавляя вызов пустого конструктора
        super("Default");
        this.age = 20;
    }

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void show() {
        System.out.println("Another show");;
    }
}
