package lesson.one.task.one;

/**
 * Created by adrien on 10.03.2018.
 */
public class RightTriangle {
    private int deep;//число должно быть нечетное

    public RightTriangle(int deep) {
        this.deep = deep;
    }

    public void createRightTriangle() {
        System.out.println("\nThis is right triangle\n");
        int counter = 0;
        System.out.print("* ");
        System.out.print("\n");
        for(int i = 1; i<deep; i++) {
            System.out.print("* ");
            int spaceCounter = counter;
            while (spaceCounter != 0 && i!=deep-1) {
                System.out.print("  ");
                spaceCounter--;
            }
            counter++;
            while (i==deep-1){
                for(int k = 1; k<deep-1; k++){
                    System.out.print("* ");
                }
                break;
            }
            System.out.print("* ");
            System.out.print("\n");
        }
    }
}
