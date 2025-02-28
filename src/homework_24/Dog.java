package homework_24;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (28.02.2025)
 */

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
public class Dog {
    private String name;
    private int jumpHeight; // высоту прыжка будем измерять в сантиметрах, поэтому берем int
    private int maxJumpHeight;

    // Конструктор
    public Dog(String name, int jumpHeight) {
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
        // за тренировку высота прыжка увеличивается максимум на 10 см
        // Проверка возможности тренироваться
        if (jumpHeight < maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("Потренировались прыгать!");
        } else {
            System.out.println("Достигнута максимально возможная высота прыжка в " + jumpHeight + " см");
        }
    }

    // Метод взять барьер
    public void jumpBarrier(int height) {
        // можем взять барьер
        if (jumpHeight >= height) {
            System.out.println("Собака взяла барьер " + height + " см.");
        } else {
            if (maxJumpHeight >= height) {
                //Идем тренироваться
                while (jumpHeight < height) {
                    training();
                }
                System.out.println("После тренировок, собака взяла барьер в " + height + " см");
            } else {
                System.out.println("К сожалению, собака не сможет преодолеть барьер высотой " + height + " см");
                System.out.println("Максимальная высота прыжка собаки " + maxJumpHeight + " см");
            }
        }
    }

    public String toString() {
        return String.format("Имя собаки: %s, максимальная высота прыжка собаки: %d см", name, jumpHeight);
    }
}
