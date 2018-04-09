package lesson.six.task.two;

/**
 * Created by adrie on 09.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        String text = Converter.loadTextFromFile("src\\resources\\lesson\\six\\temp");
        text = Converter.deleteExtraSpaces(text);
        String text2 = Converter.deleteCharsByFirstLetter(text);
        String text3 = Converter.deleteCharsByLastLetter(text);
        System.out.println(text);
        System.out.println();
        System.out.println(text2);
        System.out.println();
        System.out.println(text3);
    }
}
