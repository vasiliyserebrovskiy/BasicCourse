package homework_24;


/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */
public class Hw24Main {
    public static void main(String[] args) {
        /*System.out.println("========== Test Calculator ==========\n");
        double result = Calculator.addition(10, 20);
        System.out.println("1 Результат операции 10 + 20 = " + result);

        result = Calculator.subtraction(10, 30);
        System.out.println("2 Результат операции 10 - 30 = " + result);

        result = Calculator.multiplication(10, 30);
        System.out.println("3 Результат операции 10 - 30 = " + result);

        result = Calculator.division(10, 0);
        System.out.println("4 Результат операции 10 / 0 = " + result);

        result = Calculator.division(10, 3);
        System.out.println("5 Результат операции 10 / 0 = " + result);*/

        System.out.println("\n ========== Test Dog  ==========\n");

//        Dog myDog = new Dog("Palkan", 50);
//        System.out.println(myDog);
//        myDog.jump();
//        myDog.jumpBarrier(70);
//        System.out.println(myDog);
//        myDog.jumpBarrier(75);
//        System.out.println(myDog);
//        myDog.jumpBarrier(100);
//        System.out.println(myDog);
//        myDog.jumpBarrier(105);
//        System.out.println(myDog);
//        System.out.println("======================");
//        Dog myDog2 = new Dog("Mysia", 0);
//        System.out.println(myDog2);
//        myDog2.jump();
//        myDog2.training();
//        System.out.println(myDog2);
//        myDog2.training();
//        myDog2.training();
//        myDog2.jumpBarrier(20);
//        myDog2.jumpBarrier(30);
//        System.out.println("======================");
//        Dog myDog3 = new Dog("Miser", -10);
//        System.out.println(myDog3);
//        myDog3.jumpBarrier(20);
//        System.out.println(myDog3);
//        myDog3.jumpBarrier(30);
//        System.out.println("Максимальная высота прыжка собаки myDog3 = " + myDog3.getJumpHeight());

//        Dog myDog = new Dog("Laska", 33);
//        System.out.println(myDog);
//        myDog.jumpBarrier(65);
//        System.out.println(myDog);

        double x1 = 10.0;
        double resultat = x1 / 0;
        System.out.println("10 / 0 = " + resultat);

        double inf1 = 1.0 / 0;
        double inf2 = 10000.0 / 0;

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);
        System.out.println("10.0 / 10.0 = " + (10.0 / 10.0));
        double res2 = inf1 / inf2;
        System.out.println("res2 =  " + res2);
        // Infiniti - бесконечность
        // NaN - ничто, нет значения.
        // Все операции с Infinity возвращают NaN так как а не знаю что будет
        System.out.println(Calculator.division(10 , 0));

    }
}
