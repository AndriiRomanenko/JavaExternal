package lesson.two;


import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by adrie on 14.03.2018.
 */
public class Triangle extends Geometry {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Line apexAB;
    private Line apexBC;
    private Line apexCA;
    private static final long serialVersionUID = 1L;
    public Triangle(Point a, Point b, Point c){
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
        setApexAB(a,b);
        setApexBC(b,c);
        setApexCA(c,a);
        checkIsTriangle(apexAB,apexBC,apexCA);
    }
    public Triangle(){
        super();
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Line getApexAB() {
        return apexAB;
    }

    public void setApexAB(Point a, Point b) {
        this.apexAB = new Line(a,b);
    }

    public Line getApexBC() {
        return apexBC;
    }

    public void setApexBC(Point b, Point c) {
        this.apexBC = new Line(b,c);
    }

    public Line getApexCA() {
        return apexCA;
    }

    public void setApexCA(Point c, Point a) {
        this.apexCA = new Line(c,a);
    }
    private void checkIsTriangle(Line a, Line b, Line c){
        if ((a.getBegin() != c.getEnd()) || (b.getBegin() != a.getEnd()) ||
                (c.getBegin() != b.getEnd())) {
            throw new IllegalArgumentException("The vertices of a triangle don't intersect");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", apexAB=" + apexAB +
                ", apexBC=" + apexBC +
                ", apexCA=" + apexCA +
                '}';
    }
}
