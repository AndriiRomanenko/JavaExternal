package lesson.one.task.three;


/**
 * Created by adrien on 11.03.2018.
 */
public class SortingRowsByAscendingOrder {
    private int[][] matrix;
    private int[] series;
    private int[] values;

    public SortingRowsByAscendingOrder(int rows, int columns){
        this.matrix = new int[rows][columns];
        this.series = new int[matrix[0].length];
        this.values = new int[matrix[0].length];
        generateValues();
    }

    public static void main(String[] args) {
        SortingRowsByAscendingOrder matrix = new SortingRowsByAscendingOrder(8,8);
        matrix.findNumberOfSeries();
        matrix.display();

        matrix.sort();
        matrix.display();
    }
    public void display(){
        System.out.println();
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" number of series: " + series[i] + ", value: " + values[i]);
            System.out.println();
        }
    }
    public void sort(){
        sortMatrix();
    }
    private void sortMatrix(){
        for(int i = series.length-1; i>1; i--) {
            for (int j = 0; j < i; j++) {
                if(series[j] > series[j+1]){
                    swap(j, j+1);
                    swapRows(j, j+1);
                }
            }
        }
    }
    private void findNumberOfSeries(){
        int element;
        int counter;
        for(int i = 0; i<matrix.length; i++){
            counter = 0;
            element = 0;
            for(int j = 0; j<matrix[i].length; j++){
                int tempCounter = 0;
                int tempElement = matrix[i][j];
                for(int k = 0; k<matrix[i].length; k++){
                    if(matrix[i][k] == matrix[i][j] ){
                        tempCounter++;
                    }
                    if (tempCounter > counter){
                        counter = tempCounter;
                        element = tempElement;
                    }
                }
            }
            series[i] = counter;
            values[i] = element;
        }
    }
    private void swap(int one, int two){
        int temp = series[one];
        series[one] = series[two];
        series[two] = temp;
        int tempElement = values[one];
        values[one] = values[two];
        values[two] = tempElement;
    }
    private void swapRows(int one, int two){
        for(int index = 0; index<matrix.length; index++) {
            int temp = matrix[one][index];
            matrix[one][index] = matrix[two][index];
            matrix[two][index] = temp;
        }
    }
    private void generateValues(){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*5);
            }
        }
    }
}
