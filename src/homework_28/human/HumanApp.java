package homework_28.human;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.03.2025)
 */

/**
 * Task 1:
 * ---- 1
 * Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи +
 * ---- 2
 * У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25; +
 * ---- 3
 * Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5 +
 * ---- 4
 * В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам +
 */

public class HumanApp {
    public static void main(String[] args) {

        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();

        System.out.println("===== Обычный человек =====");
        human.run();
        System.out.println("===== Спортсмен любитель =====");
        amateurAthlete.run();
        System.out.println("===== Спортсмен Профессионал =====");
        professionalAthlete.run();


    }
}
