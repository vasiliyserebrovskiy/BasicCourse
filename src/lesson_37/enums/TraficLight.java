package lesson_37.enums;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.03.2025)
 */
public class TraficLight {
    private String serialNumber;
    private String location;

    //Red, Yello, Green
    private Colors light;

    public TraficLight(String serialNumber, String location, Colors light) {
        this.serialNumber = serialNumber;
        this.location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TraficLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", location='" + location + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
