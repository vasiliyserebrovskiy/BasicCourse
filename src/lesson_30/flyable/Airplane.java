package lesson_30.flyable;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
// Если в классе не переопределены все методы из интерфейса, мы должны объявить такой клас абстрактным
public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
        if(amountPassengers < capacity) {
            amountPassengers++;
            return true;
        }
        return false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying!");
    }
}
