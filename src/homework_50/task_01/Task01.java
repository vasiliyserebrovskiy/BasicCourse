package homework_50.task_01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.04.2025)
 */
/*
Task 2
1 Получить и вывести на экран:
    текущую дату
    текущий год, месяц и день

2 Создать дату, например Ваш день рождения и вывести на экран

3 Создать две даты и проверить на равенство

4 Получить и вывести на экран:
    текущее время
    текущее время + 3 часа

5 Создать дату:
    которая на неделю позже сегодняшней
    которая была на год раньше сегодняшней используя метод minus
    которая на год позже сегодняшней
    tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task01 {

    public static void main(String[] args) {

        // 1 Получить и вывести на экран:
        //    текущую дату
        //    текущий год, месяц и день
        System.out.println("\n ===== Part 1 =====");
        LocalDate todayNow = LocalDate.now();
        System.out.println("Сегодня: " + todayNow);
        System.out.println("Текущий год: " + todayNow.getYear() + ", месяц: " + todayNow.getMonth() + "(" + todayNow.getMonthValue() + ")" + ", день: " + todayNow.getDayOfMonth());

        //2 Создать дату, например Ваш день рождения и вывести на экран
        System.out.println("\n ===== Part 2 =====");
        String myBirthDay = "12.12.1982";
        DateTimeFormatter myParser = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate myParsedBithDay = LocalDate.parse(myBirthDay, myParser);
        System.out.println("Мой ДР: " + myParsedBithDay);

        System.out.println("\n ===== Part 3 =====");
        //Создать две даты и проверить на равенство

        LocalDate date1 = LocalDate.of(2012, 9, 05);
        LocalDate date2 = LocalDate.of(2015, 8, 06);
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("Проверка дат на равенство: " + date1.equals(date2));

        System.out.println("\n ===== Part 4 =====");
        //4 Получить и вывести на экран:
        //    текущее время
        //    текущее время + 3 часа
        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время: " + localTime);
        System.out.println("Текущее время плюс 3 часа: " + localTime.plusHours(3));

        System.out.println("\n ===== Part 5 =====");
        //Создать дату:
        //    которая на неделю позже сегодняшней
        //    которая была на год раньше сегодняшней используя метод minus
        //    которая на год позже сегодняшней
        //    tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

        LocalDate nextWeekDate = LocalDate.now().plusWeeks(1);
        LocalDate lastYearDate = LocalDate.now().minusYears(1);
        LocalDate nextYearDate = LocalDate.now().plusYears(1);
        System.out.println("Через неделю будет: " + nextWeekDate);
        System.out.println("Год назад: " + lastYearDate);
        System.out.println("На год позже: " + nextYearDate);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Вчера находиться до сегодня: " + yesterday.isBefore(todayNow));
        System.out.println("Вчера находиться после сегодня: " + yesterday.isAfter(todayNow));
        System.out.println("Завтра находиться до сегодня: " + tomorrow.isBefore(todayNow));
        System.out.println("Завтра находиться после сегодня: " + tomorrow.isAfter(todayNow));


    }
}
