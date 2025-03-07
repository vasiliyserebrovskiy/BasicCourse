package lesson_29.children;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
// Класс помеченный словом final нельзя наследовать
public class Parent {

     String name;
    // Так как нет ни одного конструктора, автоматически добавляется пустой конструктор!

//    public Parent() {
//        //все поля инициализируются значениями по-умолчанию
//    }
    // Есть свой конструктор -> конструктор по-умолчанию не выдается автоматически,
    // поэтому у наследника начинаются проблемы
    public Parent(String name) {
        this.name = name;
    }

    // final - нельзя переопределить в наследнике метод с пометкой final
    void show() {
        System.out.println("Show must go on!");
    }
}
