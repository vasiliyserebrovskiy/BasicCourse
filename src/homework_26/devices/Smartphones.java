package homework_26.devices;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class Smartphones extends ElectronicDevice{
    private String displayResolution; // 2560 x 1440
    private String processorType; //

    public Smartphones(String name, String manufacturer) {
        super(name, manufacturer);
    }

    public void restart() {
        System.out.println("Выполнена перезагрузка телефона.");
    }

    public void updateOS() {
        System.out.println("Выполнено обновление системы");
    }

    public void makeCall() {
        System.out.println("Звоним");
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
