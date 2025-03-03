package homework_25;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */

import java.util.Random;

/**
 * Task 2 * (Опционально)
 * Написать класс Собака (Dog).
 * -----------------------------
 * Каждая Собака обязательно должна иметь имя и высоту прыжка +
 * Должна уметь прыгать и должна уметь тренироваться. +
 * За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров +
 * Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка. +
 * Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает.
 * Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
 * Если да -> идем тренироваться -> берет барьер +
 */
public class DogModified {
    private String name;
    private int jumpHeight; // высоту прыжка будем измерять в сантиметрах, поэтому берем int
    private int maxJumpHeight;
    private static Random random = new Random();

    // Массив случайных барьеров
    public static final int[] barriers = new int[7];

    // Инициализация случайных барьеров
    static {
        for (int i = 0; i < 7; i++) {
            barriers[i] = random.nextInt(101) + 70; // Заполнить массив случайными значениями от 70 до 170.

        }
    }

    // Конструктор
    public DogModified(String name, int jumpHeight) {
        this.name = name;

        if (jumpHeight == 0) { // равно нулю, если собака еще не умеет прыгать
            this.jumpHeight = 0;
            this.maxJumpHeight = 20; // Полагаю, что любая собака может научиться прыгать. Допустимый максимум опционален.
        } else if (jumpHeight < 0) { // Todo: так не правильно, по хорошему нужно выдавать ошибку: создание такой собаки не возможно
            this.jumpHeight = 0;
            this.maxJumpHeight = 20;
        } else {
            this.jumpHeight = jumpHeight;
            this.maxJumpHeight = jumpHeight * 2;
        }
    }

    // Конструктор с автоматическим заполнением параметра высоты прыжка собаки
    public DogModified(String name) {
        this.name = name;
        int randomHight = random.nextInt(51) + 30; // со случайным прыжком от 30 до 80
        this.jumpHeight = randomHight;
        this.maxJumpHeight = randomHight * 2;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    // Метод для прыжка
    public void jump() {
        if (jumpHeight == 0) {
            System.out.println("К сожалению, собака не умеет прыгать!");
        } else {
            System.out.println("Собака прыгнула на высоту " + jumpHeight + " см.");
        }
    }

    //Метод для тренировки
    public void training() {

        if (jumpHeight < maxJumpHeight) {
            jumpHeight += 10;
            if (jumpHeight > maxJumpHeight) jumpHeight = maxJumpHeight;
        }
    }

    // Метод взять барьер. Модифицируем данный метод: Вернет true если собака взяла барьер, вернет false если не взяла барьер
    public boolean jumpBarrier(int height) {

        if (jumpHeight >= height) {
            return true;
        } else {
            if (maxJumpHeight >= height) {
                //Идем тренироваться
                while (jumpHeight < height) {
                    training();
                }
                return true;
            } else {
                return false;
            }
        }
    }

    // Метод вывода информации о наших собаках
    public static void printDogsInfo(DogModified[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Собака " + i + " : " + dogs[i]);

        }
    }

    public String toString() {
        return String.format("Имя собаки: %s, максимальная высота прыжка собаки: %d см", name, jumpHeight);
    }
}
