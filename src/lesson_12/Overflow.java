package lesson_12;

public class Overflow {
    public static void main(String[] args) {

        // -128 до 127
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        // При добавлении 1 к максимальному значению мы получим минимальное число диапазона
        // Overflow
        byteVar++;
        System.out.println("byteVar = " + byteVar);
        byteVar--;
        System.out.println("byteVar = " + byteVar);

        short mySchort = 32767;
        System.out.println("mySchort = " + mySchort++);
        System.out.println("mySchort = " + mySchort);

    }
}
