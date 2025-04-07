package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.04.2025)
 */
public class JavaTimeApi {
    //Java Time Api / java.time
    /*
        util.Date. - базовая функциональность(не очень удобный)
        util.Calendar - календарь
        text.SimpleDateFormat
        Joda-Time - сторонняя разработка отдельная штука (Была выкуплена Oracle и стала Java Time Api)
     */
    public static void main(String[] args) {

        //LocalDate - представляет дату (год, месяц, день) без времени

        LocalDate date = LocalDate.now(); //возвращает текущую дату
        System.out.println("date: " + date);

        // Прибавить 1 день к дате
        //date имутабельный (как и String в Java)
        LocalDate tomorrow = date.plusDays(1); // Добавляем некоторое количество дней(в нашем случае +1 день)
        System.out.println("tomorrow: " + tomorrow);

        System.out.println("Можно добавлять недели: " + date.plusWeeks(4)); // добавлем 4 недели
        System.out.println("date.minusMonths(2) : " + date.minusMonths(2));

        LocalDate date1 = LocalDate.of(2002, 2, 15); //Установить дату (год месяц число)
        System.out.println("date1: " + date1);

        // Можно использовать ENUM с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1 mit ENUM: " + date1);


        System.out.println("Год: " + date.getYear() + "месяц: " + date.getMonth() + "; месяц цифра: " + date.getMonthValue());
        System.out.println("Число: " + date.getDayOfMonth() + "; день недели: " + date.getDayOfWeek() + "; день года: " + date.getDayOfYear()); // взять день месяца

        System.out.println("Сколько дней в месяце(по указанной дате): " + date.lengthOfMonth() + "; дней в году: " + date.lengthOfYear() + "; был ли год високосным: " + date.isLeapYear());

        // Преобразование строки в дату
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2.getDayOfMonth() + ":" + date2.getMonthValue() + ":" + date2.getYear());

        System.out.println("======================== Local Time ===================");
        // LocalTime - представляет время, у которого есть часы/минуты/секунду и наносекунды
        LocalTime time = LocalTime.now(); //возвращает текущее время
        System.out.println("Time: " + time);

        LocalTime time1 = LocalTime.of(21, 33); // передаем часы + минуты
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);
        System.out.println("time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час
        System.out.println("time2 : now + 1 H: " + time2);
        System.out.println("time + 1 and 5: " + time.plusMinutes(65)); // добавляем час и 5 минут
        System.out.println("time.minusSeconds(30: " + time.minusSeconds(30));

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano());

        String timeString = "12:13:45";
        LocalTime parsTime = LocalTime.parse(timeString); // Четкий формат парсинга, только с :. Иначе ошибка будет
        System.out.println("parseTime: " + parsTime);

        System.out.println("====== Local Date Time =======");

        // LocalDateTime - представляет дату и время без учета часового пояса!
        LocalDateTime now = LocalDateTime.now(); // текущая дата и время
        System.out.println("Дата и время: " + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);

        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek());
        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek().getValue());

        System.out.println("dateTime.plusHours(1):" + dateTime.plusHours(1));
        System.out.println("dateTime.minusYear(1):" + dateTime.minusYears(1));

        System.out.println("====== ZoneDateTime =======");
        // ZoneDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("ZoneDateTime: " + zoneDateTime + " : " + zoneDateTime.getZone());

        System.out.println("\n ============== isAfter, isBefore, until, equals ================");
        LocalDate date3 = LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        // isAfter, isBefore, until, equals есть у всех объектов, продоставляющих дату и время

        // boolean isAfter - проверяет что текущий объект после(позже) указанного объекта
        boolean isAfter = date3.isAfter(date4);

        System.out.println("isAfter:" + isAfter);

        // isBefore - проверяет что текущий объект до или раньше указанного объекта
        boolean isBefore = date3.isBefore(date4);
        System.out.println("isBefore:" + isBefore);

        // equlas - проверяет на равенство
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        //long until - измеряет время между текущим и указанным объектом даты/времени
        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);

        System.out.println("dateTime2.until(dateTime1) SECONDS: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));
        System.out.println("dateTime2.until(dateTime1) MINUTES: " + dateTime2.until(dateTime1, ChronoUnit.MINUTES));
        System.out.println("dateTime2.until(dateTime1) DAYS: " + dateTime2.until(dateTime1, ChronoUnit.DAYS));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS); // прибавить 10 дней
        System.out.println("dateTime3: " + dateTime3);
        dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES); // прибавить 10 дней
        System.out.println("dateTim3 2: " + dateTime3);

        // метод ChronoUnit - long  .between

        long hoursBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n ====== instant, duration, period =======");

        // instant - представляет собой точку на временной шкале в грегорианском календаре с точностью до наносекунд.
        // Unix epoch (Epoch time)- Эпоха юникс.
        // Началась с 1 Января 1970 года
        // Вычисляет сколько прошло миллисекунд с 1 Января 1970 года. Instant класс в JavaTime - основан на количестве секунд и наносекунд прощедших с 1 Января 1970 года.

        Instant nowInstant = Instant.now();
        long millis = nowInstant.toEpochMilli(); // получаем кол-во миллесекунд с 1970-01-01
        System.out.println("millis: " + millis);
        Instant instant = Instant.ofEpochMilli(millis); // получить из миллисекунд
        System.out.println(instant);

        // Duration, Period - представляют собой отрезки времени(временные интервалы), используются для храниения, различных типов временных интервалов(временных единиц)
        // Duration - что-то короткое, продолжительность в секундах и наносекундах
        // Period - разница, продолжительность в днях/месяцах/годах

        System.out.println("===== DateTimeFormater ======");

        //DateTimeFormater - форматирование даты и времени

        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        System.out.println("LDT now: " + nowLocalDateTime);

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        String formatedString = nowLocalDateTime.format(formater);
        System.out.println("formatedString: " + formatedString);

        /*
        y - год
        M - месяц
        d- день

        H - 24 часа формат
        h - 12 часовой формат, флаг а для отображения 'am', 'pm'
        m - минута
        s - секунда

        Количество повторений символа, определяет формат отображения значения.
        yyyy - четырехзначный год
        yy - два последних значения(2х значный год) '23' для 2023 года
        М - месяц в сыром формате -> 2 будет отображаться как 2 а 12 как 12
        ММ - месяц в 2-х значном формате -> 2 будет отображаться как 02 а 12 как 12
        d - сырой номер дня -> 3 или 29
        dd - двухзначный номер дня -> 07 или 29


         */
        //Есть строка с датой - создать объект LocalDateTime соответствующий этой дате
        String dateFormatParse = "23-10-26 19:15";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateFormatParse, formatter1);

        System.out.println("parseDate: " + parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());

        System.out.println("==== TASK 1 =======");

        String myString = "15-12-2022 20-46";
        DateTimeFormatter myFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime myParseDateTime = LocalDateTime.parse(myString, myFormater);
        System.out.println("myParseDateTime: " + myParseDateTime);
        System.out.println("месяц = " + myParseDateTime.getMonth() + ", день = " + myParseDateTime.getDayOfWeek() + ", час = " + myParseDateTime.getHour());


        // 13-01-2023 20-46
        String newDT = "13-01-2023 20-46";
        LocalDateTime newDTValue = LocalDateTime.parse(newDT, myFormater);
        System.out.println("newDTValue.getDayOfWeek(): "+ newDTValue.getDayOfWeek());
        System.out.println(ChronoUnit.DAYS.between(myParseDateTime, newDTValue));


    }

}
