package homework_32.task_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */
public class Pair<T> {
    private T firstElement;
    private T secondElement;

    public Pair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirst() {
        return firstElement;
    }

    public T getSecond() {
        return secondElement;
    }

    public void setFirst(T firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecond(T secondElement) {
        this.secondElement = secondElement;
    }

    public void swap() {
        T temp = firstElement;
        firstElement = secondElement;
        secondElement = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pair {");
        sb.append(" firstElement = ").append(firstElement).append(",");
        sb.append(" secondElement = ").append(secondElement).append(" }");
        return sb.toString();
    }
}
