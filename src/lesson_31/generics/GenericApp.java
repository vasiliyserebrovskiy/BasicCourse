package lesson_31.generics;

import lesson_28.animals.Cat;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.03.2025)
 */
public class GenericApp {

    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(value.length());

        // Проверка типизации на уровне компиляции
        //box.setValue(20);
        box.setValue("New Value");

        System.out.println(box);

        System.out.println("\n===================");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());

        //Нельзя поместить другой тип данных, ошибка компиляции
//        catBox.setValue("String");
        catBox.setValue(null);

        // Не работаем с примитивными типами
        //SimpleBox<int> intBox = new GenericBox<>(5);
        // Используем классы обертки
        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);
        System.out.println("intBox " + intBox);

        int sum = intBox.getValue() + intBox2.getValue();
        System.out.println("sum = " + sum);

        // НЗа счет автоупаковки / распаковки не нужно думать о приведении типов
        int val = intBox.getValue();
        Integer integerVal = intBox.getValue();

    }
}
