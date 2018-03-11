package lesson.one.task.one;

/**
 * Created by adrien on 09.03.2018.
 */
public class Rectangle {
    private int length;
    private int deep;

    public Rectangle(int length, int deep) {
        this.length = length;
        this.deep = deep;
    }

    public void createRectangle() {
        System.out.println("\nThis is rectangle\n");
        for(int i = 0;i<deep;i++){
            System.out.print("* ");
            while(i==0||i==deep-1) {
                for (int j = 1; j < length -1; j++) {
                    System.out.print("* ");
                }
                break;
            }
            while(i!=0&&i!=deep-1){
                for (int j = 1; j < length-1; j++) {
                    System.out.print("  ");
                }
                break;
            }
            System.out.print("* ");
            System.out.print("\n");
        }
    }
}
