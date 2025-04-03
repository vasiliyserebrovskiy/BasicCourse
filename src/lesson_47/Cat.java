package lesson_47;

import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.04.2025)
 */
public class Cat {
    private String name;
    private int weight;
    private String color;

    public Cat(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        //System.out.println("call get name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, color);
    }
}
