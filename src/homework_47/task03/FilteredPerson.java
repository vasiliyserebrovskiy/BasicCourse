package homework_47.task03;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.04.2025)
 */
/*
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
public class FilteredPerson {

    public static void main(String[] args) {
        List<Person> persons = getPersonsList();
        //System.out.println(persons);

        List<Person> filteredPersons = persons.stream()
                .filter(Objects::nonNull)
                .filter(person -> Objects.nonNull(person.getCity()))
                .filter(person -> person.getAge() > 30 && person.getCity().equals("Cologne"))
                .collect(Collectors.toList());

        System.out.println("Список персон: " + filteredPersons);
    }


    private static List<Person> getPersonsList() {
        return List.of(
                new Person("Alex", 35, "Munich"),
                new Person("Peter", 25, "Cologne"),
                new Person("Anna", 44, "Dusseldorf"),
                new Person("Michael", 36, "Bonn"),
                new Person("Michel", 30, null),
                new Person("Max", 50, "Munich"),
                new Person("Sascha", 38, "Cologne"),
                new Person("Julia", 18, "Munich"),
                new Person("Vitaliy", 40, "Cologne")
        );
    }

}
