package homework_35.task_03;


import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.02.2025)
 */
public class MyArrayList<T> implements MyList<T> {
    private T[] array; // null
    private int cursor; // по умолчанию получит значение 0

    public MyArrayList() {
        // Стирание типов. На практике не возможно создать объект типа Т
        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    // Конструктор с входным массивом в качестве параметров
    public MyArrayList(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            addAll(array);
        }
    }

    //Метод добавления в массив одного элемента
    @Override
    public void add(T value) {

        if (cursor == array.length) {
            // надо расширить текущий массив, перед добавлением нового элемента
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива - доступно только в рамках класса!
    private void expandArray() {

        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Добавление в массив нескольких элементов
    @Override
    public void addAll(T... values) {

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    @Override
    public int size() {
        return cursor;
    }


    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (Objects.equals(array[i], value)) return i; // Позволяет безопасно искать и сравнивать null
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (Objects.equals(array[i], value)) return i; // Позволяет безопасно искать и сравнивать null
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {

        if (cursor == 0) return null;
        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz = " + clazz);
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        return result;
    }

    @Override
    public boolean remove(T value) {
        int indexOfValue = indexOf(value);

        if (indexOfValue >= 0) {
            remove(indexOfValue);
            return true;
        }
        return false;
    }

    @Override
    public T remove(int index) {

        if (index >= 0 && index < cursor) {
            T value = array[index]; // запомнить удаляемое значение

            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }


    @Override
    public T get(int index) {

        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }

    @Override
    public void set(int index, T value) {

        if (index >= 0 && index < cursor) {
            array[index] = value;
            return;
        }
        System.out.println("Указан неверный индекс.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (cursor == 0) return "[]";
        sb.append("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append(i < cursor - 1 ? ", " : "]");
        }
        return sb.toString();
    }

    // Не возможно вернуть объект типа интерфейс.
    // Если тип возвращаемого значения имеет тип "Интерфейс" это означает, что я должен вернуть экземпляр объекта этого класса,
    // который имплементировал интерфейс.
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            return array[currentIndex++];
        }

        @Override
        public void remove() {
            // После удаления, сдвигаем массив на 1 объект влево
            for (int i = currentIndex - 1; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--cursor] = null; // обнуляем ссылку на последний элемент
            currentIndex--; // откатываем индекс итератора, на одну позицию.
        }
    } // End of class MyItterator

}

/*
 1. добавлять в массив элемент (не думаю об индексах, о размере массива) ++
 2. Динамическое изменение размера, внутреннего массива. ++
 3. Вернуть строковое представление массива (все элементы массива в виде строки) ++
 4. Добавить в массив сразу несколько значений ++
 5. Текущее кол-во элементов в массиве ++
 6. получить элемент по индексу ++
 7. удалить элемент по индексу. Возвращает старое значение ++
 8. удаление по значению ++
 9. поиск по значению возвращать индекс (возвращает значение первого найденного элемента/ индекс первого вхождения) ++
 10. Индекс последнего вхождения ++
 11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из обычного массива ++
 12. Написать метод, который вернет массив, состоящий из элементов магического массива ++
 */