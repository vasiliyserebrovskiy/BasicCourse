package lesson_28.animals;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Dog extends Animal{

    //То что дописывается сюда, если мы не переопределяем метод
    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + " | Dog. Дополнение реализации";
    }
}
