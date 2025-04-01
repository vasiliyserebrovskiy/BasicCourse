package lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.04.2025)
 */
public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(5, "Max", 18));
    }

    public static void main(String[] args) {

        // Optional<T> - специальный класс обертка, который может содержать значение типа T, а может не содержать(быть пустым).
        // Появился в Java 8
        // Основная задача - уменьшить количество ошибок, возникающих при обращении к null.

        Optional<User> optUser = getById2(10);
        // boolean .isPresent() вернет true если не пусто Мы можем проверить есть ли в обертке значение

        if (optUser.isPresent()) {
            // Получение значения. get() распаковывает значение, завернутое в Optional
            // если вызвать его на пустом(содержащем null) получим NPE
            User user = optUser.get();
            System.out.println("User: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }
        // boolean isEmpty() - возвращает true если Optional пустой

        // orElse(T defaultValue) - распакует из Optional объект если он есть или вернет значение по умолчанию.

        User current = getById(10).orElse(null);
        System.out.println("current: " + current);

        //Optional используется для возвращаемых значений из методов в 99% случаев
        // не надо использовать как поле класса или параметр метода.

        // NPE
        //System.out.println(user.getName());

    } // END MAIN

    /*
    Как создать Optional
    Optional.of(value) - создает Optional, в котором содержится значение. (не пустой / не null)
    Если попытаться завернуть null в Optional - будет ошибка

    Optional.empty() - создает пустой Optional(в которой ничего нет)

    Optional.ofNullable(value) - создает Optional, который содержит значение или пустой
     */

    // Может прийти null. Обертка на это указывает, что необходимо проверить на null
    public static Optional<User> getById(int id) {
        // Список пользователей
        // Перебираем пользователей и сравниваем id
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public static Optional<User> getById2(int id) {
        // Список пользователей
        // Перебираем пользователей и сравниваем id
        User result = null;

        for (User user : users) {
            if (user.getId() == id) {
                result = user;
            }
        }

        // return Optional.of(result); // большие шансы что тут null
        return Optional.ofNullable(result);
    }

}
