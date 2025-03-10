package lesson_30.interfaces;

//Интерфейс может расширять другой интерфейс
public interface ColorPrintable extends Printable{

    //Дочерний интерфейс наследует все методы родительского интерфейса и может добавлять свои

    void colorPrint();



}
