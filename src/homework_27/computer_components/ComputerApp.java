package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class ComputerApp {
    public static void main(String[] args) {

        Storage storage = new Storage("Western Digital", "HDD", 500);
        Storage storage2 = new Storage("Seagate", "SSD", 1000);

        Computer computer = new Computer("My Computer", storage);

        computer.computerOn();
        System.out.println(computer);
        computer.computerOff();
        computer.changeStorage(storage2);
        computer.computerOn();
        System.out.println(computer);

        System.out.println(computer.getMemory());
        System.out.println(computer.getProcessor());
        System.out.println(computer.getStorage());

    }
}
