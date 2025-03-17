package lesson_35.iquals;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Петр", "Иванов", "5.12.1990");
        Employee employee2 = new Employee("Иван", "Иванов", "21.10.2000");
        Employee employee3 = new Employee("Петр", "Петров", "21.10.2000");
        Employee date = new Employee("Петр", "Петров", "01.01.2015");


        // Два способа сравнения: == сравнивает ссылки
        System.out.println("employee == employee1 = " + (employee == employee1)); // false
        System.out.println("employee == employee3 = " + (employee == employee1)); // false

        System.out.println("employee.equals(employee1) = " + employee.equals(employee1)); // false
        System.out.println("employee.equals(employee3) = " + employee.equals(employee3)); // false до переопределения equals
        System.out.println("employee.equals(date) = " + employee.equals(date)); //


    }
}
