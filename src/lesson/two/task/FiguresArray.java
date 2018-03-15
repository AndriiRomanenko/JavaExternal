package lesson.two.task;

import lesson.two.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by adrie on 14.03.2018.
 */
public class FiguresArray {
    private Geometry[] array;
    private int size;
    public FiguresArray(){
        this.array = new Geometry[5];
        this.size = 0;
    }

    public static void main(String[] args) {
        FiguresArray figures = new FiguresArray();
        figures.addFigure(new Point());
        figures.addFigure(new Line(new Point(3,4), new Point(5,6)));
        figures.addFigure(new ColorPoint());
        figures.addFigure(new ColorPoint("Green"));
        figures.addFigure(new ColorLine("Black"));
        figures.addFigure(new Triangle(new Point(2,2), new Point(3,3), new Point(4,5)));
        figures.addFigure(new Point(6,9));
        figures.display();

    }
    public void addFigure(Geometry figure){
        if (size < array.length-1){
            array[size] = figure;
            ++size;
        } else {
            increaseArray();
            array[size] = figure;
            ++size;
        }
    }
    private void increaseArray(){
        int oldCapacity = array.length;
        int newCapacity = (oldCapacity * 3)/2+1;
        Geometry[] temp;
        if(newCapacity - oldCapacity>0){
            temp = new Geometry[newCapacity];
        } else {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, 0,temp, 0, size);
        array = temp;
    }

    private void display(){
        for(int i = 0; i<size; i++){
            System.out.println(array[i]);
        }
    }

}
