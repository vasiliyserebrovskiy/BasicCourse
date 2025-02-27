package homework_23;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.02.2025)
 */
public class Employee {
    private String name;
    private int age;

    private double salary;

    //Конструкторы
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0.0;
    }
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //Геттеры

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //Сеттеры
    public void setSalary(double salary) {
        if (!(salary < 0.0)) {
            this.salary = salary;
        }
    }

    public void setAge(int age) {
        if(!(age < 0 || age > 120)) {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (!(name == null || name.isEmpty()))
            this.name = name;
    }

    //Пересчет зарплаты
    public void recountSalary(int percent) {
        if (!(percent < -100 || percent > 100))
            this.salary = salary + salary * percent / 100;

    }

    // Метод вывода информации о сотруднике
    public String toString() {
        String result = String.format("Имя сотрудника: %s. Возраст сотрудника: %d. Зарплата: %.2f", name,age,salary);
        return result;
    }
}
