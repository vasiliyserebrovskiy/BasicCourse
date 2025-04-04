package lesson_49;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.04.2025)
 */
public class ExceptionsExample {

    public static void main(String[] args) {


        //Ошибки компиляции -это ошибки, которые возникают в момент компиляции
//        int a = "Java";
//        int a = 10

        // Ошибки Runtime (во время выполнения) -> Exception Исключения - представляют собой события, которые могут возникнуть в процессе выполнения программы
        // и нарушить ее нормальное выполнение.
        // Исключения в Java является объектом определенного класса, который наследуется от класса Throwable.
        // Обработка ошибок - предусмотреть возможность появления Exception (объекта определенного класса)
        // и написать какой-то код, который будет выполнен в этом случае.
        /*
        try-catch

        try {
            //код который может вызвать исключение
        } catch (тип исключения ExceptionType name) {
            // код для обработки исключения. Код, который выполниться при возникновении ошибки определенного класса.
        } catch (AnotherExceptionType ex2) {
            // код обработки другого кода ошибки
        } finally {
            // код который выполниться в любом случае, вне зависимости от того было ли исключение или нет. (перед выходом из блока try-catch)
        }

         */

        int[] array = {1, 23, 4};
//        array[10]=100; //ArrayIndexOutOfBoundsException

        try {
            array[10] = 10;
            System.out.println("Try to continue.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Какая-то ошибка");
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
        // Пишите несколько кэтчей от точного к более общему.
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Что-то не так с индексом: " + e.getMessage());
//        }

        System.out.println("Продолжение работы программы");

        System.err.println("Печатаю в потоке ошибок");

        System.out.println("==================");
        // Проверяемые(checked Exception) и непроверяемые исключения
        // Проверяемые(checked Exception) - исключения, наличие которых мы обязаны проверить и обработать в своем коде.
        // Непроверяемые исключения - это исключения, возможность появления которых я не обязан обрабатывать в коде.

        String result = getUrlString();
        System.out.println("result: " + result);

        System.out.println("==============\n");
        String result2;

        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
            result2 = "http://google.com";
        }

        System.out.println("result2: " + result2);

    }

    // Первый метод try-catch
    private static String getUrlString() {
        URL myUrl = null;
        //бросает проверяемое исключение

        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "https://google.com";
        }

        return myUrl.toString();
    }
    //Второй путь: передать обязанность тому, кто вызывает метод throws
    // throws используется в сигнатуре метода, для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = new URL("http://example.com");
        return myUrl.toString();
    }

}
