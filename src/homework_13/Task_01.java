package homework_13;

import java.util.Scanner;

/**
 * Task 1
 * Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
 * Используя Scanner, сохраните имя в переменную типа String.
 * Выведите на экран количество символов в имени пользователя.
 * Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
 * Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println("В вашем имени " + name.length() + " символов.");
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        System.out.println("Десятичный код первой буквы вашего имени = " + (int) firstLetter);
        System.out.println("Десятичный код последней буквы вашего имени = " + (int) lastLetter);
        
    }
}
