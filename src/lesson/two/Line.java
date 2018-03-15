package lesson.two;

/**
 * Created by adrie on 14.03.2018.
 */
public class Line extends Geometry{
    private Point begin;
    private Point end;
    public Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(){
        this.begin = new Point(2,2);
        this.end = new Point(4,4);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
