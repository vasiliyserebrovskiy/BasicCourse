package lesson_27;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.03.2025)
 */
public class BusDriver {
    private static int idCounter = 101; // статическая переменная, для подсчета уникального id
    private final int id;

    private String name;
    private String license;

    public BusDriver(String name, String license) {
        this.id = idCounter++;
        this.name = name;
        this.license = license;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("BusDriver : {");
        //Цепочка вызовов = Method chaining
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
