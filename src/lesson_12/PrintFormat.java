package lesson_12;

public class PrintFormat {
    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", age = " + age + " Score = " + result);

        /*
            % - место для вставки значения переменной всегда начинается с %
            %d - целое число (digit)
            %f - число с плавающей точкой (float) 6 знаков после запятой по умолчанию
            %.3f - число знаков после запятой( тут 3)
            %s - строка (string)
            \n - перевод курсора(каретки)
            %n - символ новой строки, работает только в printf !!!!
         */
        System.out.printf("Name: %s, age = %d, Score = %.2f\n", name, age, result);
        System.out.println("World");
        System.out.println("Second line");

        // sout - println souf - printf



    }
}
