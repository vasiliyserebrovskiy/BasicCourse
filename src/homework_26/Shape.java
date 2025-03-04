package homework_26;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */

/**
 * ask 1
 * Иерархия классов “Фигуры”
 * Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
 * -----------------------------------
 * При создании классов не забудьте о конструкторах
 * Базовый класс Shape
 * Создайте класс Shape.
 * Добавьте поле name типа String, которое хранит название фигуры.
 * Создайте метод displayInfo(), который выводит на экран значение поля name.
 * ----------------------------
 * Дополнительное задание (по желанию):
 * Добавьте в класс Shape поле color типа String и метод setColor(String color). +
 * Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo(). +
 */
public class Shape {
    protected String name;
    protected String color;

    //Конструктор
    public Shape(String name) {
        this.name = name;
    }

    //Метод displayInfo();
    public void getInfo() {
        System.out.printf("Фигура c именем: %s имеет цвет: %s\n",name, color);
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        if (color.length() == 0 || color == null) {
            System.out.println("Неверное значение поля color!");
            return;
        }
        this.color = color;
    }
}
