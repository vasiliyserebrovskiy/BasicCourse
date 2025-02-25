package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class WashingMachineMain {
    public static void main(String[] args) {

        // Тестируем стиральную машину
        WashingMachine myWashingMachine = new WashingMachine("Bosch", "горизонтальная загрузка", 7);

        myWashingMachine.info();
        myWashingMachine.wash();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.info();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.putClothesIn();
        myWashingMachine.info();
        myWashingMachine.wash();
        myWashingMachine.putClothesIn();
        myWashingMachine.info();
        myWashingMachine.takeOutCleanLinen();
        myWashingMachine.info();

    }
}
