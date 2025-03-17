package lesson_35.iquals;

import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Прописываю логику сравнения этого объекта с другим объектом, любого типа данных.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Переменные ссылаются на один и тот же объект

        if (!(obj instanceof Employee)) return false; // Проверяем что obj можно привести к Employee

        Employee employee = (Employee) obj;

        // сравнение значений полей, которые должны быть равными
    //        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dateOfBirth.equals(employee.dateOfBirth);
        // При таком сравнении возможно появление NPE, то есть если null.equals(empleoyee.<>) -> аварийное завршение программы
        // Objects.equals(null, employee.firstName) -> просто вернет false
        // Безопасное сравнение объектов с учетом возможности появления null значений.

        return Objects.equals(firstName,employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
