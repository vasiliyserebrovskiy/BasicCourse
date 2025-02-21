package lesson_13;

public class CharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменная содержит символ A в латинской раскладке
        char a1 = 65; // Будет хранить букву A, символ соответствующей коду 65 в 10й системе счисления
        char a2 = 0x41; // В 16м формате без ведущих нулей
        // a2 = 0x0041;
        char a3 = '\u0041'; // Еще один способ, задать код числа в 16м формате
        char x = '\u15EE';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        System.out.println("==========================\n");

        char letter = 'A';
        letter++; // Увеличение кода символа на 1
        System.out.println("letter: " + letter);

        char digit = 48; // 48 - символ 0
        System.out.println("digit: " + digit);

        digit += 5;
        System.out.println("digit: " + digit);
        /*
        0 ... 9 - соответствуют коду 48 - 57
        a ... z - соответствуют коду 97 - 122
        A ... Z - соответствуют коду 65 - 90
         */
        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 4);

        char x1 = 12853;
        System.out.println("x1 = " + x1);

        // Чтобы получить 10й код символа в 10й системе счисления, нужно привести тип char к типу int
        System.out.println("int из char -> 10 код символа: " + (int) digit);
        // второй способ
        System.out.println("Второй способ : " + (0 + digit));
    }
}
