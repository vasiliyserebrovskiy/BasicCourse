package homework_35.task_03;

import java.util.Iterator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.03.2025)
 */
public class RectangleUtils extends Rectangle {

    public static MyList<Rectangle> removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        if (rectangles.isEmpty()) return new MyArrayList<>();

        MyList<Rectangle> newRectangle = new MyArrayList<>();

        for (Rectangle current : rectangles) {
            if (current.equals(rectangleToRemove)) {
                continue;
            } else {
                newRectangle.add(current);
            }
        }

        return newRectangle;
    }

    public static void removeDuplicates2(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        if (rectangles.isEmpty()) return;

        Iterator<Rectangle> rectIterator = rectangles.iterator();

        while (rectIterator.hasNext()) {
            Rectangle rectangle = rectIterator.next();

            if (rectangle.equals(rectangleToRemove)) {
                rectIterator.remove();
            }
        }

    }



}
