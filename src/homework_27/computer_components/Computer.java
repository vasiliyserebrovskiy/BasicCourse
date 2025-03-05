package homework_27.computer_components;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Computer {
    private String name;
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String name, Storage storage) {
        this.name = name;
        this.storage = storage;
        this.processor = new Processor("Intel", "Core i7", 8);
        this.memory = new Memory("Kingston", "DDR", 5);
    }

    public void changeStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Жесткий диск заменен.");
    }

    public void computerOn() {
        System.out.println("Компьютер включен.");
    }

    public void computerOff() {
        System.out.println("Компьютер выключен.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("------------------------------\n");
        sb.append("Компьютер с именем: ").append(name).append("\n");
        sb.append("Процессор: { ").append(processor.toString()).append(" }\n");
        sb.append("Память: { ").append(memory.toString()).append(" }\n");
        sb.append("Диск: { ").append(storage.toString()).append(" }\n");
        sb.append("------------------------------");

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}
