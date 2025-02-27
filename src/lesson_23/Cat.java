package lesson_23;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.02.2025)
 */
public class Cat {
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и Сеттеры - публичные методы, дающие возможность получать или изменять значения полей класса
    // Геттер для поля age
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    // Сеттеры

    //Возможный сеттер для имени, но не даем такой возможности
    /*public void setName(String name) {
        if (name != null) this.name = name;
    }*/

    public void setAge(int age) {
        //Инверсия
        if (!(age < 0 || age > 30)) {
            this.age = age;
        }

        /*
        if (age < 0 || age > 30) {
            // пусто - возраст не подходит
        } else {
            this.age = age;
        }
         */
        /*
         if (age < 0 || age > 30) {
            return;
        }
        this.age = age;
         */

    }

    public void setWeight(int weight) {
        if (weight < 0) {
            //Если входящее не устраивает ставим значение по умолчанию
            this.weight = 0;
            return;
        }

        if (!(weight > 50)) {
            this.weight = weight;
        }
    }

    public void sayMeow() {
        System.out.println("Meaow! " + name);
        testMethod();
    }

    private void testMethod() {
        System.out.println("Test!");
    }

    public String toString() {
        // System.out.printf("Cat: %s, age: %d, weight: %d \n", name, age, weight);
        String result = String.format("Cat: %s, age: %d, weight: %d", name, age, weight); // метод format позволяет сформировать строку по шаблону
        return result;
    }

}
