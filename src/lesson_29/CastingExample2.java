package lesson_29;

import lesson_28.animals.Animal;
import lesson_28.animals.Cat;
import lesson_28.animals.Dog;
import lesson_28.animals.Hamster;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
/*
    В Java объекты могут принадлежать одному классу Х и при этом могут быть приведены к другому типу если между классами есть связь наследования!
    Das heißt КАСТИНГ!
    Он бывает 2х видом
        1 восходящее преобразование (up casting) - преобразование объекта дочернего класса в тип родительского класса.
        2 низходящее преобразование (down casting) - преобразование объекта родительского класса в тип дочернего класса.
 */
public class CastingExample2 {

    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование
        // Восходящее происходит автоматически

        Animal animal = new Cat(); // неявное восходящее преобразование
        /*
           !!! ВАЖНО !
           (ТИП Ссылки и тип переменной) Тип ссылочной переменной определяет:
           1. Ссылки на объекты каких типов, могут храниться в этой переменной
           2. Список методов, которые можно вызвать, обращаясь к этой переменной
         */

        // ссылочная переменная может хранить объект своего класса или любого потомка(ребенка)


        // Какая реализация будет вызвана, определяется объектом, на который храниться ссылка
        animal.voice();

        Animal animal1 = new Hamster(); // Неявное автоматическое преобразование Hamster к типу Animal

        animal1.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();
        System.out.println("\n===================\n");
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        // Todo: Нисходящее преобразование
        System.out.println("\n==================================\n");

        int intX = 10;
        double doubleX = intX;
        System.out.println("doubleX = " + doubleX);
        intX = (int) doubleX;
        System.out.println("intX = " + intX);


        Animal animal0 = new Dog(); // Up casting восходящее не явное преобразование
        Dog dog = (Dog) animal0; //проблема down casting НЕ БЕЗОПАСНОЕ ПРЕОБРАЗОВАНИЕ
        System.out.println("dog = " + dog);
//        animal.bark(); // не вижу
        dog.bark();

        Animal cat = new Cat();
        // Получаем ClassCastExeption - ошибка компиляции
        // Dog dog1 = (Dog) cat;

        System.out.println("\n ========= \n");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            // Можно проверить тип объект, для избежания ошибок перед down casting
            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке " + i + "  is a cat");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // теперь можно дернуть специфический метод кота
            }
            System.out.println("=====\n");
            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }
        }

    }
}



