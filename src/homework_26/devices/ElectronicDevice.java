package homework_26.devices;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class ElectronicDevice {
    protected String name;
    protected String manufacturer;

    public ElectronicDevice(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void deviceOn() {
        System.out.println("Устройство включено");
    }

    public void deviceOff() {
        System.out.println("Устройство выключено");
    }

    public String toString() {
        return String.format("Имя устройства: %s, производитель: %s", name, manufacturer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
