package lesson.two;

/**
 * Created by adrie on 14.03.2018.
 */
public class ColorLine extends Line {
    private String color;
    public ColorLine(int x1, int y1, int x2, int y2, String color){
        super(x1,y1,x2,y2);
        this.color = color;
    }
    public ColorLine(Point begin, Point end, String color){
        super(begin, end);
        this.color = color;
    }
    public ColorLine(String color){
        super();
        this.color = color;
    }
    public ColorLine(){
        super();
        this.color = "Blue";
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}' + " " + super.toString();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
