package homework_28.human;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class Human {

    private int runSpeed;
    private int restTime;
    protected String typeRunner = "Человек";

    public Human() {
        this(10,15);
//        this.runSpeed = 10;
//        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " бежит  со скорость " + runSpeed + " км/ч.");
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " отдыхает " + restTime + " минут.");
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    @Override
    public String toString() {
        return "Human{" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }
}
