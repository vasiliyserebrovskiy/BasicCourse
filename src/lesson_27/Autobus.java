package lesson_27;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
/*
    Ассоциация - это связь, при которой один объект связан с другим объектом. Это наиболее общая форма связи

    Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое", где часть может существовать отдельно от целого.

    Композиция - это более жесткая форма агрегации (также отношение "часть - целое"), НО где часть не может существовать без целого!

    Обычно, часть создается вместе с целым, и если целое уничтожается, то и часть также уничтожается. (жизненные циклы объектов)

    Ассоциация (в том числе и Агрегация, и Композиция) реализуются через создание ссылок в классе на другие объекты.
    Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

    Ассоциация - это отношение между двумя классами, где один класс использует другой класс в качестве одного из своих полей.

    Автобус содержит водителя. HAS-A - Агрегация. Водитель может существовать отдельно от автобуса.
    Автобус содержит автопилот. HAS-A - Композиция. Автопилот не может существовать без автобуса, является неотъемлемой частью автобуса.
    Жесткая связь. Часть создается вместе с целым

    Важные аспекты ассоциации.

    Направленность ассоцийции. Ассоциация может быть однонаправленная или двунаправленная.

    Координальность связи. Определяет сколько объектов одного класса, может быть ассоциировано с объектами другого класса.
    One-to-One (один к одному)
    One-to-Many (один ко многим)
    Many-to-Many (многие ко многим)

    1 : 1 -> Автобус и двигатель. Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходиться ровно один автобус.
    One-to-Many -> Автобус и список пасажиров.
    Many-to-Many -> Список автобусов и список автобусных остановок.
    Каждый автобус останавливается на многих остановках.
    И на каждой остановке может обслуживаться множество автобусов.

 */
public class Autobus {

    private static int count = 1;
    // Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // агрегация
    private Autopilot autopilot; // композиция

    private final int capacity;
    private int countPassangers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = count++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    public void showListPassengers() {

        if (countPassangers == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassangers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassangers - 1) ? "," : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        // 1 надо проверить свободные места
        // 2 находиться ли пассажир уже в автобусе
        // 3 если есть место и пассажир не в автобусе - посадка
        // 3.1 берем на борт
        // 3.2 Увеличиваем кол-во пасажиров
        // 3.3 Возврат true
        // 4 сообщение об ошибке и возвращаем false
        if (countPassangers < capacity) {
            // места есть
            // надо проверить пункт 2
            if (isPassengerInBus(passenger)) {
                // вернул true - пассажир уже в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе c id %d \n", passenger.getId(), this.id);
                return false;
            }
            // Сажаем пассажира на борт
            passengers[countPassangers] = passenger;
            countPassangers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус c id %d \n", passenger.getId(), this.id);
            return true;
        }
        //Свободных мест в автобусе нет
        System.out.println("В автобусе с id " + this.id + " свободного места нет.");
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassangers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        return false; // нет такого пассажира
    }

    //getters
    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassangers() {
        return countPassangers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    //setters
    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Autobus {" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                '}';
    }

}
