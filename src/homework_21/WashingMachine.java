package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class WashingMachine {
    String manufacturer; // Производитель
    String type; // Фронтальная загрузка / вертикальная загрузка
    int volume;
    int maxLoad;
    int clothesIn;
    boolean isFull; // Полная ли стиральная машина
    boolean isClean; // Запускалась ли стиральная машина / для проверки какое там белье и была ли разгружена стиральная машина после стирки

    public WashingMachine(String manufacturer, String type, int volume) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.volume = volume;
        this.isFull = false;
        this.isClean = false;
        this.clothesIn = 0;
        if (volume > 5) {
            this.maxLoad = 10;
        } else {
            this.maxLoad = 5;
        }
    }

    public void info() {
        System.out.println("=====================");
        System.out.println("Стиральная машина: " + manufacturer + " объемом " + volume + " литров.");
        System.out.println("Тип стиральной машины: " + type);
        System.out.println("Максимальная загрузка: " + maxLoad);
        System.out.println("Машина полная: " + ((isFull) ? "Да" : "Нет"));
        System.out.println("Машина с чистым бельем: " + ((isClean) ? "Да" : "Нет"));
        System.out.println("=====================");
    }

    public void putClothesIn() {
        if (isClean) {
            System.out.println("Машина постирала и в ней чистое белье, ее нужно разгрузить!");
        } else {
            if (clothesIn == maxLoad) {
                isFull = true;
                System.out.println("Стиральная машина полная, необходима стирка!");
            } else {
                System.out.println("Добавили вещи в стиральную машину!");
                clothesIn++;
            }
        }
    }

    public void wash() {
        if (clothesIn < maxLoad / 2) {
            System.out.println("Машина полупустая. Стирка в данном режиме не экономна и запущена не будет.");
        } else {
            System.out.println("Стираем белье!");
            isClean = true;
        }
    }

    public void takeOutCleanLinen() {
        System.out.println("Разобрали стиральную машину");
        clothesIn = 0;
        isClean = false;
        isFull = false;
    }
}
