package lesson_42;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = {9, 5, 1, 2, 4, 11, 0};

        // apple < banana
        // Zebra < apple
        // Apple < apple большая буква, меньше маленькой (лексографический порядок)

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrary", 2025, 300);
        cars[5] = new Car("Ferrary", 2021, 250);

        printCars(cars);

        Arrays.sort(cars);

        // Есть интерфейс Comparable<T> (сравнимый)
        // Еще один интерфейс<T> - Comparator
        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);

        printCars(cars);

        System.out.println("=================");

        Arrays.sort(cars, new CarModelComparator());

        printCars(cars);

        System.out.println("=================");

        //Анонимный класс - это класс позволяющий создать объект на лету, без явного объявления нового класса

        // Очень часто используются, когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        printCars(cars);

        // Отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getYear() - car1.getYear();
            }
        });

        printCars(cars);

        System.out.println("=========================");
        // Сравнить машины по году выпуска в порядке возврастания, а если год совпадает, то такие машины сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear() - car2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                }
                return car2.getModel().compareTo(car1.getModel());
            }
        });

        printCars(cars);

        // Функциональный интерфейс - это интерфейс, который имеет ровно один абстрактный метод (метод, который нужно реализовать)
        // метод который нужно реализовывать ровно один. Остальные методы могут быть либо default, либо static.

        // Интерфейс Comparator является функциональным интерфейсом.

        /* Лямбда выражение :) Это краткий способ реализации анонимных функций (методов) в Java
            Компактный синтаксис для реализации функциональных интерфейсов

            (parameter) -> expression;
            или
            (parameter) -> {statements}

            Лямбда выражение во многих случаях, могут заменить анонимные классы и реализовывать на лету функциональные интерфейсы
         */


        //Сортировка по году в обратном порядке с лямбдой

        Arrays.sort(cars, (cars1, cars2) -> cars2.getYear() - cars1.getYear());

        printCars(cars);

        // Отсортировать машины по максимальной скорости, в порядке убывания если скорость совпадает, отсортировать по году в естественном порядке

        // мой вариант сходу.
        Arrays.sort(cars, (car1, car2) -> {
            int speedCompare = car2.getMaxSpeed() - car1.getMaxSpeed();
            if (speedCompare != 0) return speedCompare;
            return car1.getYear() - car2.getYear();
        });

        printCars(cars);

        //Через ссылку на интерфейс
        Comparator<Car> carComparator = (car1, car2) -> {
            // System.out.println(car1.getMaxSpeed() + " | " + car2.getMaxSpeed());
//            int speedCompare = car1.getMaxSpeed() - car2.getMaxSpeed();
            int speedCompare = Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()); // избегаем переполнения типов
            //System.out.println("car1 - car2 " + speedCompare);
            if (speedCompare == 0) {
                return Integer.compare(car1.getYear(), car2.getYear());
            }
            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);

        // Составные компараторы
        // Comparator - имеет набор статических и дефолтных методов, облегчающих написание сложных/составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнивать два объекта
        // отсортировать машины по модели в естественном порядке
        /*
        car -> car.getModel();
        Car::getModel();
         */


        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel()); // функция ключ
        Arrays.sort(cars, byModel);

        printCars(cars);

        //ссылка на метод - сокращенная запись лямбда выражения
        Arrays.sort(cars, Comparator.comparing(Car::getModel));

        printCars(cars);

        System.out.println("==========================");

        // специальные методы для сравнения примитивов, призванные избежать автоупаковки / автораспаковки
        //comparingInt, comparingLong, comparingDouble
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        printCars(cars);

        // Отсортировать по году выпуска в порядке убывания
        // Вторые компараторы - для указания вторичного параметра сортировки reverseOrder - обратный порядок сортировки || naturalOrder - прямой порядок сортировки
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.naturalOrder()));
        printCars(cars);

        //cars[5] = new Car(null, 2012, 250);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo))); //значения null будут признаны
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));
        printCars(cars);


        System.out.println("============================");
        //Составные компараторы
        // Отсортировать по модели: если модели равны то по убыванию года выпуска

        //Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(Comparator.comparing(String::toString))).thenComparing(Car::getYear, Comparator.reverseOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        //Отсортировать машины по году в обратном порядке и если год равен отсортировать по максимальной скорости
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getMaxSpeed));
        printCars(cars);

        //Comparator reversed()
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getMaxSpeed).reversed());
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear,Comparator.reverseOrder()).thenComparing(Car::getMaxSpeed).reversed());
        printCars(cars);

    }

    public static void printCars(Car[] cars) {
        System.out.println("================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("================");
    }
}
