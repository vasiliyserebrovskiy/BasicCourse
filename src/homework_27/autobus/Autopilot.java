package homework_27.autobus;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class Autopilot {
    private String softwareVersion;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String toString() {
        return String.format("Autopilot: { SV: %s}", softwareVersion);
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
