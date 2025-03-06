package lesson_28.animals;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Cat extends Animal{

    //Уникальный функционал кота
    public void eat() {
        System.out.println("Кот кушает.");
    }
    //переопределение родительского метода
    @Override // Аннотация, указывает, что метод переопределяет родительский метод. Компилятор проверит, есть ли у родителя такой метод.(Если нет, то компилятор будет ругаться!!!!)
    public void voice() {
        System.out.println("Cat say MEOW");
    }
}
