package lesson.one.task.two;

import java.util.Arrays;

/**
 * Created by adrien on 10.03.2018.
 */
public class SortingMinusPlus {
    private int[] array;
    public SortingMinusPlus(int size){
        this.array = new int[size];
        generateArray();
    }
    public static void main(String[] args) {
        SortingMinusPlus sortingPlusMinus = new SortingMinusPlus(30);
        sortingPlusMinus.display();

        sortingPlusMinus.sort();
        sortingPlusMinus.display();
    }
    public void display(){
        System.out.println(Arrays.toString(array));
    }

    public void sort(){
        sortArray();
    }
    private void sortArray(){
        int counter = 0;
        insertionSort();
        //считаем колличество отрицательных, после чего сдвинем указатель и отсортируем
        //в обратном порядке
        for(int i = 0; i<array.length; i++){
            if(array[i]<0) counter++;
        }
        reverseSelectionSort(counter, array.length);

    }
    private void insertionSort(){
        int in, out;
        for(out = 1; out<array.length; out++){
            int temp = array[out];
            in = out;
            while(in>0 && array[in-1] >= temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }

    }
    private void reverseSelectionSort(int startIndex, int endIndex){
        int out, in, max;
        for(out = startIndex; out<endIndex-1; out++){
            max = out;
            for(in = out+1; in<endIndex; in++){
                if (array[in] > array[max]) {
                    max = in;
                }
                  swap(out,max);
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
