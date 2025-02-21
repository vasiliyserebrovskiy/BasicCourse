package lesson_14;

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        // Ссылочный тип данных. В переменных str(1-4) храниться ссылка на адрес в памяти, где храниться объект типа String, он же значения
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        boolean b1 = str1 == str2;

        // Важно!!!
        // Оператор == сравнивает значения, которые хранятся в переменных

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);
        System.out.println("str1 == str2 :" + b1); //true
        System.out.println("str1 == str3 :" + (str1 == str3)); //false
        System.out.println("str1 == str4 :" + (str1 == str4)); //false
        System.out.println("str2 == str4 :" + (str2 == str4)); //false

        // ВАЖНО: для сравнения строк по их значению мы должны использовать метод equals()
        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2) :" + b2); //true
        System.out.println("str1.equals(str3) :" + str1.equals(str3)); //false
        System.out.println("str1.equals(str4) :" + str1.equals(str4)); //true
        System.out.println("str2.equals(str4) :" + str2.equals(str4)); //true

        //мы можем сравнивать значения игнорируя регистр
        System.out.println("str1.equals(str3) :" + str1.equalsIgnoreCase(str3)); //true по значению

    }
}
