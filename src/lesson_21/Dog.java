package lesson_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++; // увеличиваем вес на 1 кг
    }

    public void run() {
        /*
        1 Достаточен ли вес собаки для пробежки
        2 если нет - не бежать, собака сначала должна поесть
         */
        while (weight < 3 ) {
            System.out.println("Сорян, я слишком худая и голодная, бежать не могу. Надо поесть!!!");
            System.out.println("Мой вес сейчас: " + weight);

            eat();
        }
        System.out.println("Я бегу!");
        this.weight -= 2; // уменьшаем вес на 2
        System.out.println("Вес после пробежки: " + weight);
        System.out.println("===========\n");

    }

    public void info() {
        System.out.println("Я собака: " + name + ". Мой вес равен: " + weight);
    }

}
