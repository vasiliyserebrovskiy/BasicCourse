package lesson_18;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.02.2025)
 */
public class MethodWithReturn {
    public static void main(String[] args) {
        // Возвращаемое значение, это результат, которое метод возвращает обратно, вызывающему его коду, после своего выполнения(завершения).
        // Это способ, передать результат вычислений метода, в другие части программы
        int sum = 10 + 5;
        System.out.println("Сумма чисел 10 + 5 = " + sum);
        int sum2 = calculateSum(20, 123);
        System.out.println("sum2 = " + sum2);

        sum = calculateSum(10, 5) + calculateSum(20, 30);
        System.out.println("sum = " + sum);


        //Сигнатура - совокупность название метода + его параметры
        //------------------------------так, поговорили про сигнатуры


        // Написать метод, возвращающий 2 в степени х. метод получает в качестве параметра x

        System.out.println("\n============================\n");
        double pow = powTwo(3);
        System.out.println("pow 3 = " + pow);
        System.out.println("pow 0 = " + powTwo(0));
        System.out.println("pow -3 = " + powTwo(-3));
        // --------------------------------
      //  int x = test(5);
       // double y = test(10.0);

       // test2(5);
       // test2(-10);
       // test2(3);

    } // End main

    //powerTwo
    public static double powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2;
        boolean isPossitive = x >= 0;

        // если х отрицательный - отбросить знак числа
        if (x < 0) x *= -1;

        // Вычисляем 2 ^ |x|
        double result = 1;

        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        /*if (isPossitive) return result;
        else return 1/result;*/

        return (isPossitive) ? result : 1 / result;
    }

    public static void test2(int x) {
        //не печатать значения если x = 3
        if (x == 3) return; // в void методах может использоваться пустой return, return без значения

        // печатаем от 0 до х
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    //Method sum
    public static int test(int i) {
        return -1;
    }

    public static double test(double d) {
        return -10.0;
    }


    public static int calculateSum(int a, int b) {
        int result = a + b;
        return result; // return - оператор, заканчвающий работу метода и возвращающий результат(значение)
    }


} // end class
