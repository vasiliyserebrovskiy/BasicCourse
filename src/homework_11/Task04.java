package homework_11;

/**
 * Task 3 * (Опционально)
 * Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.
 * <p>
 * Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
 * <p>
 * Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
 * Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */

public class Task04 {
    public static void main(String[] args) {
        int priceA = 1000;
        int priceB = 500;
        int discountSize = 10; // 10% на всю покупку, если покупаются оба товара

        double discount = (double) (priceA + priceB) * discountSize / 100;
        double totalPrice = priceA + priceB - discount;
        System.out.println("Сумма скидки для этой покупки = " + discount + " Euro");
        System.out.println("Итоговая сумма покупки = " + totalPrice);

    }
}
