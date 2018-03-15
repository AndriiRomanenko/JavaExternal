package lesson.two;

/**
 * Created by adrie on 13.03.2018.
 */
public class Point extends Geometry{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int x){
        this(x, 0);
    }
    public Point(){
        this( 2, 2);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
