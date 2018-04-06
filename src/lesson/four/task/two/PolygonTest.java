package lesson.four.task.two;

import lesson.four.task.one.Serializator;
import lesson.two.Geometry;
import lesson.two.Line;
import lesson.two.task.Polygon;

import java.io.InvalidObjectException;

/**
 * Created by adrie on 29.03.2018.
 */
public class PolygonTest {
    private Polygon[] polygons;
    private String[] paths;
    public PolygonTest(){
        this.polygons = getPolygons();
        this.paths = getPaths();
    }
    private Polygon[] getPolygons(){
        Polygon one = new Polygon(new Line(1,1,2,2), new Line(2,2, 1,7),
                new Line(1,7, 6,4), new Line(6,4,1,1));
        Polygon two = new Polygon(new Line(2,2, 3,3), new Line(3,3, 2,8),
                new Line(2,8, 7,5), new Line(7,5,2,2));
        Polygon three = new Polygon(new Line(3,3,4,4), new Line(4,4, 3,9),
                new Line(3,9, 8,6), new Line(8,6,3,3));
        Polygon[] polygons = {one, two, three};
        return polygons;
    }
    private String[] getPaths(){
        String[] files = {"src\\resources\\lesson\\four\\polygonOne",
                "src\\resources\\lesson\\four\\polygonTwo",
                "src\\resources\\lesson\\four\\polygonThree"
        };
        return files;
    }
    public void start(){
        run();
    }

    private void run(){
        Serializator serializator = new Serializator();
        for(int i = 0; i < polygons.length; i++){
            serializator.serialization(polygons[i], paths[i]);
            Geometry geometry = null;
            try{
                geometry = serializator.deserialization(paths[i]);
            } catch (InvalidObjectException e) {
                e.printStackTrace();
            }
            System.out.println(geometry);
        }
    }
}
