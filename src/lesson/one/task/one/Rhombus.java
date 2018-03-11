package lesson.one.task.one;

/**
 * Created by adrien on 10.03.2018.
 */
public class Rhombus {
    private int length;//число должно быть нечетное

    public Rhombus(int length) {
        this.length = length;
    }

    public void createRhombus() {
        System.out.println("\nThis is rhombus\n");
        int middle = length/2+1;
        int lo = middle;
        int hi = middle;
        for(int deep = 0; deep < length; deep++) {
            while(deep<middle-1){
                for (int i = 1; i < length + 1; i++) {
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
                break;
            }
            while(deep>=middle-1){
                for (int i = 1; i < length + 1; i++) {
                    while (i == lo || i == hi) {
                        System.out.print("* ");
                        break;
                    }
                    while (i != lo && i != hi) {
                        System.out.print("  ");
                        break;
                    }
                }
                lo++;
                hi--;
                break;
            }
            System.out.print("\n");
        }
    }
}
