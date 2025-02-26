package lesson_22;

import java.util.Arrays;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.02.2025)
 */
public class MagicArray {
    int[] array; // null
    int cursor; // по умолчанию получит значение 0

    // Методы, расширяющие функционал массива
    public MagicArray() {
        this.array = new int[10];
    }

    // Конструктор с входным массивом
    public MagicArray(int[] array) {
        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                this.array[i] = array[i];
            }
            this.cursor = array.length;
        }
    }

    //Метод добавления в массив одного элемента
    public void add(int value) {

        if (cursor == array.length) {
            // надо расширить текущий массив массив, перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор равен " + cursor);
        /*
        1 создать новый массив в два раза большей длинны
        2 скопировать все элементы из старого массива
        3 перебросить ссылку
         */
        //1 Создаем
        int[] newArray = new int[array.length * 2];

        //2 Копируем
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        //3 Переброс ссылки
        array = newArray;

    }

    // Добавление в массив нескольких элементов
    void add(int... numbers) {
        // ... - секвенция numbers - любое кол-во int от 0 до ***
        // numbers - последовательность int'ов - обрабатываем как массив
//        System.out.println("Принял несколько int " + numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("0 элемент nymbers " + numbers[0]);

        // перебираем все значения, для каждого вызываем метод add()
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }

    // Метод возврата строки, с элементами массива
    // [5, 20, 45]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        //result += "]";

        return result;
    }

    // Вывод кол-ва элементов массива
    int size() {
        return cursor;
    }

    // получить элемент по индексу
    int getElement(int index) {
        // проконтролировать входящий индекс
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        //Fixme Указать место кода с ошибкой / проблемой

        // Код, если индекс не корректный
        // Хорошего решения нет
        return -2_147_483_647;
        //Todo Поправить обработку некорректного индекса
    }

    // Удалить элемент по индексу. Возвращает старое значение
    int remove(int index) {
        /*
        1 проверим индекс на валидность
        2 удалить значение по индексу
        3 передвинуть курсор, так как кол-во элементов уменьшилось
        4 вернуть старое значение
         */
        if (index >= 0 && index < cursor) {
            int value = array[index]; // запомнить удаляемое значение

            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value; // возвращаем старое значение
        }
        // Todo поправить возвращаемое значение
        return -2_147_483_647;
    }

    // поиск по значению возвращать индекс
    // {1, 100, 5, 25, 35} -> indexOf(5) = 2 | indexOf(50) = -1
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i; // элемент найден
        }
        return -1;
    }

    // Индекс последнего вхождения
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(6)
    int lastIndexOf(int number) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    // Удаление по значению: возвращает boolean : если что-то было удалено вернуть true
    boolean removeByValue(int value) {
        int indexOfValue = indexOf(value);
        if (indexOfValue > 0) {
            remove(indexOfValue);
            return true;
        }
        return false;
    }

    public void test() {
        System.out.println(Arrays.toString(array));
    }

}

/*
 1. добавлять в массив элемент (не думаю об индексах, о размере массива) ++
 2. Динамическое изменение размера, внутреннего массива. ++
 3. Вернуть строковое представление массива (все элементы массива в виде строки) ++
 4. Добавить в массив сразу несколько значений ++
 5. Текущее кол-во элементов в массиве ++
 6. получить элемент по индексу ++
 7. удалить элемент по индексу. Возвращает старое значение ++
 - 8. удаление по значению
 9. поиск по значению возвращать индекс (возвращает значение первого найденного элемента/ индекс первого вхождения) ++
 - 10. Индекс последнего вхождения
 - 11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из обычного массива
 */