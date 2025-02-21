package homework_12;

/**
 * Task 1
 * Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
 * Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
 * Выведите на экран значение переменной.
 * Сколько программа отбросила в остаток при операции деления?
 */
public class Task_01 {
    public static void main(String[] args) {
        int myNumber1 = 0;
        int myNumber2 = 1;
        int myNumber3 = 2;
        int myNumber4 = 3;
        int result, ostatok;

        result = (myNumber1 + myNumber2 + myNumber3 + myNumber4) / 4;
        ostatok = (myNumber1 + myNumber2 + myNumber3 + myNumber4) % 4;
        System.out.println("Среднее арифметическое чисел = " + result);
        System.out.println("Остаток от деления = " + ostatok);
        // Остаток от деления 2
        // При первом делении отбросили 0.5
        // В Java от типа переменных зависит результат операции деления! В данном случае все переменные имеют тип int
        // Результатом деления int / int всегда будет int. Остаток отбрасывается без округления вверх.
    }
}
