package lesson.six.task.two;

import java.io.*;
import java.util.function.BiConsumer;

/**
 * Created by adrie on 09.04.2018.
 */
public class Converter {
    public static String loadTextFromFile(String path){
        BufferedReader bf = null;
        StringBuilder sb = null;
        try {
            bf = new BufferedReader(new FileReader(new File(path)));
            String str;
            sb = new StringBuilder();
            while((str=bf.readLine())!=null)
                sb.append(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static String formatText(String text, BiConsumer<StringBuilder, String> function){
        StringBuilder sb = new StringBuilder();
        String[] temp = text.split("[\\s,.!?]+");
        for(String s: temp){
            function.accept(sb, s);
        }
        return sb.toString();
    }

    public static String deleteExtraSpaces(String text){
        BiConsumer<StringBuilder, String> function =
                (StringBuilder sb, String s) -> sb.append(s).append(" ");
        return formatText(text, function);
    }

    public static String deleteCharsByFirstLetter(String text){
        BiConsumer<StringBuilder, String> function =
                (StringBuilder sb, String s) -> sb.append(s.replace(s.charAt(0), ' '));
        return formatText(text, function);
    }

    public static String deleteCharsByLastLetter(String text){
        BiConsumer<StringBuilder, String> function =
                (StringBuilder sb, String s) -> sb.append(s.replace(s.charAt(s.length()-1), ' '));
        return formatText(text, function);
    }

    public static void main(String[] args) {
        String text = "asfjasfl alsfkja   alskfja aklfjakfj afals kjafl ajl fkjal sj as";
        String text2 = deleteCharsByFirstLetter(text);
        String text3 = deleteCharsByLastLetter(text);
        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
    }
}
