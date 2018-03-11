package lesson.one.task.one;

/**
 * Created by adrien on 10.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 6);
        rectangle.createRectangle();

        RightTriangle rightTriangle = new RightTriangle(9);
        rightTriangle.createRightTriangle();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(15);
        equilateralTriangle.createEquilateralTriangle();

        Rhombus rhombus = new Rhombus(11);
        rhombus.createRhombus();
    }
}
