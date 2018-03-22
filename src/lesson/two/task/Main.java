package lesson.two.task;

import lesson.two.*;

/**
 * Created by adrie on 21.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        testFigureArray();
        testPolygon();
    }
    private static void testFigureArray(){
        System.out.println("Test figure array");
        FiguresArray figures = new FiguresArray();
        figures.add(new Point());
        figures.add(new Line(new Point(3,4), new Point(5,6)));
        figures.add(new ColorPoint());
        figures.add(new ColorPoint("Green"));
        figures.add(new ColorLine("Black"));
        figures.add(new Triangle(new Point(2,2), new Point(3,3), new Point(4,5)));
        figures.add(new Point(6,9));
        figures.display();
    }
    private static void testPolygon(){
        System.out.println("Test polygon");
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,10);
        Point point3 = new Point(10,10);
        Point point4 = new Point(10,0);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point4);
        Line line4 = new Line(point4,point1);
        Polygon polygon = new Polygon(line1,line2,line3,line4);
        System.out.println(polygon);
    }
}
