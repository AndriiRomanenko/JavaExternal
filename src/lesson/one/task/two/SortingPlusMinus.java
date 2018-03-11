package lesson.one.task.two;

import java.util.Arrays;

/**
 * Created by adrien on 10.03.2018.
 */
public class SortingPlusMinus {
    private int[] array;
    public SortingPlusMinus(int size){
        this.array = new int[size];
        generateArray();
    }
    public static void main(String[] args) {
        SortingPlusMinus sortingPlusMinus = new SortingPlusMinus(30);
        sortingPlusMinus.display();

        sortingPlusMinus.sort();
        sortingPlusMinus.display();
    }
    public void sort(){
        sortArray();
    }
    public void display(){
        System.out.println(Arrays.toString(array));
    }
    private void sortArray(){
        int start = 0;
        int end = array.length-1;
        while(start<end) {
            if (array[start] < 0 && array[end] >= 0) {
                swap(start, end);
                start++;
                end--;
            } else if (array[start] < 0 && array[end] < 0) {
                end--;
            } else if (array[start] >= 0) {
                start++;
            }
        }
    }
    private void swap(int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
    private void generateArray(){
        for(int i = 0; i<array.length;i++){
            array[i] = (int)(Math.random()*200-100);
        }
    }
}
