package lesson_28.animals;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Hamster extends Animal{
    //ничего не переопределяем в хомяке, получаем все от родителя по наследству


    @Override
    public String toString() {
        return "Hamster!";
    }
}
