package homework_30.triathlete;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class Triathlete implements Runner, Swimmer {

    private String name;
    private int age;
    private int participantNumber;
    private static int number = 100;

    private Triathlete(String name, int age) {
        this.name = name;
        this.age = age;
        this.participantNumber = ++number;
    }

    public static Triathlete registerTriathlete(String name, int age) {
        if (name == null || name.length() == 0) {
            System.out.println("Имя спортсмена не может быть пустым или отсутствовать.");
            return null;
        } else if (age < 0 || age > 120) {
            System.out.println("Указан некорректный возраст спортсмена.");
            return null;
        } else {
            return new Triathlete(name, age);
        }
    }

    @Override
    public void run() {
        System.out.printf("Спортсмен с именем %s бежит под номером %d\n", name, participantNumber);
    }

    @Override
    public void swimm() {
        System.out.printf("Спортсмен с именем %s плывет под номером %d\n", name, participantNumber);
    }

    @Override
    public String toString() {
        return String.format("Участник: Имя: %s, Возраст: %s, Стартовый номер: %d\n", name, age, participantNumber);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getParticipantNumber() {
        return participantNumber;
    }

}
