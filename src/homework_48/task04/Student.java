package homework_48.task04;

import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.04.2025)
 */
public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade; // средняя оценка

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("{%s : %d : %s : %d : %.2f}", name, age, major, year, grade);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && year == student.year && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name) && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, major, year, grade);
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
