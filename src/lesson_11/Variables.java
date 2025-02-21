package lesson_11;

public class Variables {
    public static void main(String[] args) {

//        Java строго типизированный язык программирования. Python - динамически типезированный язык

        // Python x = 10 # Python сам определяет тип переменной
        /*
        Строгая типизация означает, что каждая переменная должна иметь определенный тип данных, который не может измениться
        тип данных определяет какие значения храняться в переменной и какие операции можно выполнять с переменной
         */

        int myFirstVariable; // Декларация / Объявление переменной типа инт

        myFirstVariable = 1; // Присвоение значения - инициализация переменной(первое присвоение значения)

        System.out.println("Значение превой переменной = " + myFirstVariable);

        int mySecondVariable = 25; //Объявление и инициализация в одной строке

        System.out.println("mySecondVariable = " + mySecondVariable);

        mySecondVariable = 55;
        System.out.println("Еще раз mySecondVariable = " + mySecondVariable);

        byte byteVar = 125;
        System.out.println("My byteVar = " + byteVar);

        //Знак _ в Java позволяет разделять разряды в числах, для нашего удобства
        long longVariable = 2_100_000_000_000_000_000L; //L в конце числа, говорит компилятору что тут long
        System.out.println("Long Variable = "+longVariable);

        //В коде любое целое число, воспринимается компилятором, как число в формате int

        double doubleVar = 10.352363; // . - разделитель дробной и целой части
        System.out.println(doubleVar);

        //Число написанное с . компилятором воспринимается как double!
        float myFloat = 53.34556f; // f - указывает компилятору что тип float

    }
}
