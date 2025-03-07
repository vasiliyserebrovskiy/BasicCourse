package homework_28.human;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */
public class ProfessionalAthlete extends Human {

    {
        typeRunner = "Профессионал";
    }

    public ProfessionalAthlete() {
        super(25,5);
    }

    public ProfessionalAthlete(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    /* @Override
    public void run() {
        System.out.println("Бежим со скорость 25 км/ч.");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Отдыхаем 5 минут.");
    }*/

}
