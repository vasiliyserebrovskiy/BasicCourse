package homework_26.devices;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class VacuumCleaner extends ElectronicDevice {

    private String type;
    private boolean washing;
    private boolean chargeable;

    public VacuumCleaner(String name, String manufacturer) {
        super(name, manufacturer);
    }

    public void cleanDustCollector() {
        System.out.println("Почистили пылесос");
    }

    public void charge() {
        if(chargeable) {
            System.out.println("Зарядили пылесос");
        } else {
            System.out.println("Пылесос не заряжаемый");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWashing() {
        return washing;
    }

    public void setWashing(boolean washing) {
        this.washing = washing;
    }

    public boolean isChargeable() {
        return chargeable;
    }

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }
    public void work() {
        System.out.println("Пылесосим!");
    }
}
