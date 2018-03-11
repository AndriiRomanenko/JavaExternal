package lesson.one.task.one;

/**
 * Created by adrien on 10.03.2018.
 */
public class EquilateralTriangle {
    private int length;//число должно быть нечетное

    public EquilateralTriangle(int length) {
        this.length = length;
    }

    public void createEquilateralTriangle() {
        System.out.println("\nThis is equilateral triangle\n");
        int middle = length/2+1;
        int lo = middle;
        int hi = middle;
        for(int deep = 0; deep < middle-1; deep++){
            for(int i = 1; i < length+1; i++){
                while (i == lo || i == hi) {
                    System.out.print("* ");
                    break;
                }
                while (i != lo && i != hi) {
                    System.out.print("  ");
                    break;
                }
            }
            lo--;
            hi++;
            System.out.print("\n");
        }
        for(int j = 0; j<length; j++){
            System.out.print("* ");
        }
    }
}
