package lesson.one.task.three;

import java.util.Arrays;

/**
 * Created by adrien on 11.03.2018.
 */
public class SortingColumnsByDescendingOrder {
    private int[][] matrix;
    private double[] average;

    public SortingColumnsByDescendingOrder(int row, int column){
        this.matrix = new int[row][column];
        this.average = new double[matrix[0].length];
        generateValues();
    }
    public static void main(String[] args) {
        SortingColumnsByDescendingOrder matrix = new SortingColumnsByDescendingOrder(6,8);
        matrix.display();
        matrix.sort();

        matrix.display();
        matrix.displayAverage();
    }
    public void display(){
        System.out.println();
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void displayAverage(){
        System.out.println();
        System.out.println(Arrays.toString(average));

    }
    public void sort(){
        sortMatrix();
    }
    private void sortMatrix(){
        saveAverageInArray();
        displayAverage();
        for(int i = average.length-1; i>1; i--){
            for(int j = 0; j<i; j++){
                if(average[j]<average[j+1]){
                    swap(j, j+1);
                    swapColumns(j, j+1);
                }
            }
        }
    }
    private void saveAverageInArray(){
        for(int i = 0; i<average.length; i++){
            average[i] = findAverageValue(i);
        }
    }
    private double findAverageValue(int column){
        double average = 0;
        for(int i = 0, j = column; i<matrix.length;i++){
            average += matrix[i][j];
        }
        average = average/matrix.length;
        return average;
    }
    private void swapColumns(int one, int two){
        for(int index = 0; index<matrix.length; index++) {
            int temp = matrix[index][one];
            matrix[index][one] = matrix[index][two];
            matrix[index][two] = temp;
        }
    }
    private void swap(int one, int two){
        double temp = average[one];
        average[one] = average[two];
        average[two] = temp;
    }
    private void generateValues(){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }

        }
    }
}
