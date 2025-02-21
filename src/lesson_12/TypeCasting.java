package lesson_12;

public class TypeCasting {
    public static void main(String[] args) {
        /* Два способа преобразования данный
        1 неявное преобразование данных - автоматическое
        2 явное преобразование - кастинг
         */

        // Неявное преобразование, которое происходит автоматически когда значение меньшего
        // типа данных преобразуется в больший тип данных
        byte byteValue = 123;
        int intValue;

        intValue = byteValue; // неявное преобразование типа byte в тип int
        System.out.println("intValue = " + intValue);

        double doubleValue = intValue; // Неявное преобразование
        System.out.println("doubleValue = " + doubleValue);

        // Явное преобразование. Из большего типа данных в меньшее. Требуется явное преобразование типов,
        // так как существует вероятность потери данных

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2; // Явное преобразование из double в int
        System.out.println("doubleVal2 = " + doubleVal2);
        System.out.println("int1 = " + int1);

        short shortVal = (short) int1; // Явное преобразования из int в short
        System.out.println("shortVal = " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00; // Тип данных double вмещает гораздо больший диапазон значений,
        // в том числе и в целой части
        System.out.println("==============================================");
        // Преобразования в вычислениях
        int x = 20;
        int y = 7;
        double result;
        // 20 / 7 -> 2 (int) -> неявное преобразование из int в double -> 2.0
        result = x / y;
        System.out.println("result = " + result);

        /*
        Когда в формуле присутствует несколько типов данных, то все меньшие типы данных автоматически(неявно) приводятся к большим(более широкому типу).
         */

        result = x / 7.0;
        System.out.println("result d = " + result);

        // (float) 20 / 7 -> 20.0f / 7 -> 20.0f / 7.0f -> -> 2.85f... -> не явное, автоматическое, преобразование в 2.85d -> result
        result = (float) x / y;
        System.out.println("result f = " + result);

        result = x / (double)y;
        System.out.println("result d = " + result);

        // Приоритет математических операций
        // Как в математике. Если приоритет равный - операции выполняются слева на право
        /*
           1 () Сначала выполняется операция в скобках
           2 '* / %' - умножение, деление, остаток от деления
           3 '+ -' - сложение вычитание

         */
        int varC = 2 + 8 / 2;
        System.out.println("varC = " + varC);
        varC = (2 + 8) / 2;
        System.out.println("varC = " + varC);
        varC = 25 / (2 % 5) * 3;
        System.out.println("varC = " + varC);
        varC = 2 % 5;
        System.out.println("varC = " + varC);
    }
}
