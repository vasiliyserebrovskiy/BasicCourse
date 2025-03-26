package homework_42.task_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return this.name.compareTo(sportsman.getName());
    }
}
