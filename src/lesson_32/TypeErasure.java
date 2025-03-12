package lesson_32;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.03.2025)
 */

// нельзя создавать перегружаемые методы, отличающиеся только типами параметров (дженериков)
// Нельзя создавать объект типа T
public class TypeErasure <E> {
    private E value;

    public TypeErasure(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
//--------------------------------------------------------------------------
    public static void main(String[] args) {

        TypeErasure<Integer> t = new TypeErasure<>(5);

    }
}
