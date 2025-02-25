package homework_21;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.02.2025)
 */
public class TableMain {
    public static void main(String[] args) {

        // Раскладываемый стол
        Table bigTable = new Table(90, 80, 120, true);
        // Не раскладываемый стол
        Table smallTable = new Table(50, 80, 80, false);

        // Тестим раскладной стол
        bigTable.tableInfo();
        bigTable.extend();
        bigTable.tableInfo();
        bigTable.extend();
        bigTable.collapse();
        bigTable.collapse();
        bigTable.tableInfo();

        // Заваливем / разбираем стол
        bigTable.putThingOnTable();
        bigTable.tableInfo();
        bigTable.putThingOnTable();
        bigTable.putThingOnTable();
        bigTable.putThingOnTable();
        bigTable.putThingOnTable();
        bigTable.putThingOnTable();
        bigTable.tableInfo();
        bigTable.takeThingsFromTable();
        bigTable.takeThingsFromTable();
        bigTable.tableInfo();
        bigTable.takeThingsFromTable();
        bigTable.takeThingsFromTable();
        bigTable.takeThingsFromTable();
        bigTable.takeThingsFromTable();
        bigTable.takeThingsFromTable();
        bigTable.tableInfo();
        bigTable.putThingOnTable();
        bigTable.putThingOnTable();
        bigTable.tableInfo();
        bigTable.cleanTable();
        bigTable.tableInfo();

        // Малый стол
        smallTable.tableInfo();
        smallTable.extend();
        smallTable.collapse();
        smallTable.putThingOnTable();
        smallTable.putThingOnTable();
        smallTable.putThingOnTable();
        smallTable.putThingOnTable();
        smallTable.tableInfo();
        smallTable.putThingOnTable();
        smallTable.putThingOnTable();
        smallTable.tableInfo();
        smallTable.cleanTable();
        smallTable.tableInfo();
    }
}
