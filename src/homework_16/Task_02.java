package homework_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.02.2025)
 */

/**
 * Task 2
 * Используйте цикл while для решения задачи:
 * ---------------------------------------------
 * Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */
public class Task_02 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println("Task" + i++);
        }
    }
}
