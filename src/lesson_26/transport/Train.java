package lesson_26.transport;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
// Train is-a Bus : НЕЕЕЕЕТ! НЕ ВЕРНО. Не можем наследовать от Bus.
public class Train extends Vehicle{

    private int capasity;
    private int countPassengers = 0;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }

    private void calculateCapacity() {
        this.capasity = countWagons * wagonCapacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
        // Set CountPassangers если вагоны отцепили, то вместе с пассажирами.
    }
}
