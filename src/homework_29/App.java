package homework_29;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.03.2025)
 */
public class App {

    public static void main(String[] args) {

        Shape[] myShapes = new Shape[6];
        double totalArea = 0;
        double totalPerimeter = 0;
        double area;
        double perimeter;

        myShapes[0] = new Circle(5.6);
        myShapes[1] = new Rectangle(10,13.7);
        myShapes[2] = new Rectangle(15);
        myShapes[3] = new Triangle(5.5,7.2,3);
        myShapes[4] = new Triangle(5,11.5);
        myShapes[5] = new Triangle(7.7);



        for (int i = 0; i < myShapes.length; i++) {
            area = myShapes[i].calculateArea();
            perimeter = myShapes[i].calculatePerimeter();
            System.out.printf("--- %d ---\n", (i+1));
            System.out.printf("\"%s\" Area = %f\n", myShapes[i].getType(),area);
            System.out.printf("\"%s\" Perimeter = %f\n", myShapes[i].getType(),perimeter);
            totalArea += area;
            totalPerimeter += perimeter;
        }
        System.out.println("========================================\n");
        System.out.println("The total area of all the shapes: " + totalArea);
        System.out.println("The total perimeter of all the shapes: " + totalPerimeter);



    }
}
