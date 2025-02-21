package homework_12;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Task 6 * (Опционально)
 * Потеря данных при преобразовании
 * Напишите программу, которая:
 * --------------------------------------------
 * Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
 * Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
 * Выводит значение smallNumber на экран.
 * Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */

public class Task_06 {
    public static void main(String[] args) {
        long bigNumber = 15000000000L;
        int smallNumber;

        smallNumber = (int) bigNumber;
        System.out.println("Значение smallNumber: " + smallNumber);

        System.out.println("Long: " + Long.toBinaryString(bigNumber));
        System.out.println("Int    : " + Integer.toBinaryString(smallNumber));

        System.out.println(Math.pow(2, 34));
        System.out.println(Math.pow(2, 33));
        /*
          Итоговое значение smallNumber = 2115098112

          long - 64 бита
          int - 32 бита

          при преобразовании long -> int старшие биты отбрасываются и остаются только младшие 32 бита, которые "влезают" в int.
          При преобразовании того, что "влезло" в 10е число происходит искажение значения и мы получаем 2115098112.

         */
    }
}
