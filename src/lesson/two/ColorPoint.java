package lesson.two;

/**
 * Created by adrie on 14.03.2018.
 */
public class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public ColorPoint(int x, String color){
        super(x);
        this.color = color;
    }
    public ColorPoint(String color){
        super();
        this.color = color;
    }
    public ColorPoint(){
        this.color = "Red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "color='" + color + '\'' +
                '}' + " " + super.toString();
    }
}
