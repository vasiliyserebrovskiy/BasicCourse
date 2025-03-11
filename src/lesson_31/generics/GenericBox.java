package lesson_31.generics;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.03.2025)
 */

//Мы создаем универсальный класс, и не указываем конкретный тип данных, с которым он работает
    // Мы хотим это решить/определить при создании каждого объекта

    // Generic работают только с объектами - т.е. со ссылочными типами данных

public class GenericBox <T>{ // символ заполнитель T - от слова type, E - element, K,V - key,value
    // <Т> - означает, что вместо Т будет подставлен конкретный тип данных
    private T value; // T - параметр типа

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox {" +
                "value=" + value +
                '}';
    }
}
