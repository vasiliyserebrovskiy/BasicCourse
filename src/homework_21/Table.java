package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class Table {
    int width;
    int height;
    int length;
    boolean isFolding; // раскладной или обычный
    boolean isExtending; // Если стол раскладной - может быть разложен или сложен
    boolean isCluttered; // Завален ли наш стол чем-либо
    int thingsOnTable; // Вещи на столе

    public Table(int width, int height, int length, boolean isFolding) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.isFolding = isFolding;
        this.isExtending = false;
        this.thingsOnTable = 0;
        this.isCluttered = false;
    }

    public void tableInfo() {
        System.out.println("=====================");
        System.out.println("Наш стол имеет ширину = " + width + " высоту = " + height + " длинну = " + length + ".");
        System.out.println("Наш стол раскладной: " + ((isFolding) ? "Да" : "Нет"));
        if (isFolding) {
            System.out.println("Наш стол сейчас: " + ((isExtending) ? "разложен" : "сложен"));
        }
        System.out.println("Наш стол завален: " + ((isCluttered) ? "Да" : "Нет"));
        System.out.println("Вещей на столе: " + thingsOnTable);
        System.out.println("=====================");
    }

    public void extend() {
        if (isFolding) {
            if (isExtending) {
                System.out.println("Наш стол уже разложен.");
            } else {
                isExtending = true;
                System.out.println("Раскладываем стол.");
            }
        } else {
            System.out.println("Упс, наш стол не раскладывается!");
        }
    }

    public void collapse() {
        if (isFolding) {
            if (isExtending) {
                isExtending = false;
                System.out.println("Складываем стол.");
            } else {
                System.out.println("Наш стол уже сложен.");
            }
        } else {
            System.out.println("Упс, наш стол не умеет раскладываться и не может быть сложен!");
        }
    }

    //Захломление/расхломление стола
    public void putThingOnTable() {
        if (thingsOnTable < 5) {
            System.out.println("Положили вещь на стол");
            thingsOnTable++;
        } else {
            System.out.println("На столе уже много вещей! Ну ок. Кладем еще.");
            thingsOnTable++;
            isCluttered = true;
        }
    }

    public void takeThingsFromTable() {
        if (thingsOnTable == 0) {
            System.out.println("Стол идеален, он чист!");
        } else if (thingsOnTable > 5) {
            System.out.println("Стол захламлен. Но на одну вещь стало меньше!");
            thingsOnTable--;
        } else {
            System.out.println("Убрали вещь со стола. Стол не перегружен");
            thingsOnTable--;
            isCluttered = false;
        }
    }

    public void cleanTable() {
        System.out.println("Выполнена глобальная уборка стола! Ура, стол абсолютно чист!");
        isCluttered = false;
        thingsOnTable = 0;
    }


}
