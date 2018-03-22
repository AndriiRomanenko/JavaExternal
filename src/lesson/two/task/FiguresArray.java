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

    public void add(Geometry figure){
        addFigure(figure);
    }

    private void addFigure(Geometry figure){
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

    public void display(){
        for(int i = 0; i<size; i++){
            System.out.println(array[i]);
        }
    }

}
