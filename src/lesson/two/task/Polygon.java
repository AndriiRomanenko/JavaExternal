package lesson.two.task;

import lesson.two.Geometry;
import lesson.two.Line;
import lesson.two.Point;

import java.util.Arrays;

/**
 * Created by adrie on 14.03.2018.
 */
public class Polygon extends Geometry {
    private Line[] polygon;
    public Polygon(Line ... lines){
        checkPolygon(lines);
        this.polygon = lines;
    }

    private void checkPolygon(Line[] lines){
        if(lines.length < 3){
            throw new IllegalArgumentException("Few segments for constructing a polygon");
        }
        if(!isAngleArray(lines)){
            throw new IllegalArgumentException("One or more segments do not intersect");
        }
        if(checkAngleOn180(lines)){
            throw new IllegalArgumentException("Two sides shouldn't make an angle of 180 degrees");
        }
    }

    private boolean isAngleArray(Line[] lines){
        boolean flag = true;
        for(int i = 0; i<lines.length-1; i++){
            if(!isAngle(lines[i], lines[i+1])){
                flag = false;
                break;
            }
        }
        if(!isAngle(lines[lines.length-1],lines[0])) flag = false;
        return flag;
    }
    private boolean isAngle(Line line1, Line line2){
        if(line1.getEnd() == line2.getBegin()){
            return true;
        }
        return false;
    }
    private boolean checkAngleOn180(Line[] lines){
        boolean flag = false;
        for(int i = 0; i<lines.length-1; i++){
            int firstPointX = lines[i].getBegin().getX();
            int middlePointX = lines[i].getEnd().getX();
            int endPointX = lines[i+1].getEnd().getX();
            if(firstPointX == middlePointX && middlePointX == endPointX){
                return true;
            }
            int firstPointY = lines[i].getBegin().getY();
            int middlePointY = lines[i].getEnd().getY();
            int endPointY = lines[i+1].getEnd().getY();
            if(firstPointY == middlePointY && middlePointY == endPointY){
                return true;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "polygon=" + Arrays.toString(polygon) +
                '}';
    }
}
