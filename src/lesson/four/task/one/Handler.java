package lesson.four.task.one;

import lesson.two.Geometry;
import lesson.two.Point;
import lesson.two.Triangle;

import java.io.InvalidObjectException;

/**
 * Created by adrie on 29.03.2018.
 */
public class Handler {
    private Triangle triangle;
    private final String path = "src\\resources\\serializationDemo";
    public Handler(){
        this.triangle = getTriangle();
    }
    private Triangle getTriangle(){
        Point pointOne = new Point(2,2);
        Point pointTwo = new Point(4,7);
        Point pointThree = new Point(6,7);
        Triangle triangle = new Triangle(pointOne, pointTwo, pointThree);
        return triangle;
    }
    public void start(){
        run();
    }

    private void run(){
        Serializator serializator = new Serializator();
        serializator.serialization(triangle, path);
        Geometry geometry = null;
        try{
            geometry = serializator.deserialization(path);
            serializator.getFields();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(geometry);
    }
}
