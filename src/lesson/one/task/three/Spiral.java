package lesson.one.task.three;


/**
 * Created by adrien on 11.03.2018.
 */
public class Spiral {
    private int[][] matrix;
    public Spiral(int m){
        checkIsOdd(m);
        this.matrix = new int[m][m];
        generateValues();
    }
    public static void main(String[] args) {
        Spiral spiral = new Spiral(7);
        spiral.display();
        spiral.displaySpiral();

    }
    public void display(){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void displaySpiral(){
        spiral();
    }
    private void spiral(){
        for(int outer = 0; outer < matrix.length/2; ++outer){
            System.out.print("\nRight horizontal: ");
            for(int rightHorizontal = outer; rightHorizontal < matrix.length-outer; ++rightHorizontal){
                System.out.print(matrix[outer][rightHorizontal] + " ");
            }
            System.out.print("\nDown vertical: ");
            for(int downVertical = outer+1; downVertical <= matrix.length-outer-1; ++downVertical){
                System.out.print(matrix[downVertical][matrix.length-outer-1] + " ");
            }
            System.out.print("\nLeft horizontal: ");
            for(int leftHorizontal = matrix.length-outer-2; leftHorizontal >= outer; --leftHorizontal){
                System.out.print(matrix[matrix.length-outer-1][leftHorizontal] + " ");
            }
            System.out.print("\nUp vertical: ");
            for(int upVertical = matrix.length-outer-2; upVertical >= outer+1; --upVertical){
                System.out.print(matrix[upVertical][outer] + " ");
            }
            System.out.println();
        }
        System.out.println("\nCentral element: "+matrix[matrix.length/2][matrix.length/2]);
    }
    private void generateValues(){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }
    private void checkIsOdd(int number){
        if(number%2==0){
            throw new IllegalArgumentException("You entered an even number");
        }
    }
}
