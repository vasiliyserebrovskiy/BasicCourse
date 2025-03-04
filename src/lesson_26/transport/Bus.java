package lesson_26.transport;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
// extends -> наследование! Bus наследуется от Vehicle
// Smartphone is - a Vechicle -> если высказывание не верное, то наследованение применять нельзя!
// Bus is-a Vihecle -> верно и можно применить наследование
public class Bus extends Vehicle {
    private int capacity;
    private int countPassengers;

    // Так выглядит конструктор по-умолчанию для класса-потомка
//    public Bus() {
//        // ключевое слово super это обращение к родительскому классу
//        //super() - вызов конструктора родительского класса
//        super();
//    }
    // Конструктор
    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомке, нет явного вызова конструктора родителя,
        // то автоматически будет вызван пустой конструктор родителя.
        super(model, year); // вызов родительского конструктора, принимающего модель и год
        // вызов конструктора родителя, должен быть первой строчкой, исполняемого кода
        this.capacity = capacity;
    }

    public boolean takePassanger() {
        //Проверить есть ли свободное место, если есть - посадить увеличить кол-во пассажиров в автобуесе
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model); // имею доступ к полю родителя,
            // если поле имеет модификатор protected
            //System.out.println("Пассажир зашел в автобус: " + getModel()); // в противном случае через геттер. У наследников нет прямого доступа
            return true;
        }
        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров.\n",model, countPassengers);
        return false;
    }

    public boolean dropPassangers() {
        // TODO: дописать реализацию.
        return false;
    }

    //Геттерына новые свойства
    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
