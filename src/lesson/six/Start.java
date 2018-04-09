package lesson.six;

import java.util.ArrayList;
import java.util.List;

public class Start {
    private Handler handler;
    private String url;
    public Start(String url){
        this.url = url;
        handler = new Handler();
    }
    public void run(){
        List<String> urls = handler.
                getListOfReferencesByURL(url);
        System.out.println("List of urls\n");
        handler.display(urls);
        System.out.println("\nFind \"but\" word in first url from the list\n");
        handler.displayCount("but",urls.get(0));
        System.out.println("\nGet statistic by \"on\" word in url's list\n");
        handler.displayStatisticKeyword("on", urls);

        List<String> keywords = new ArrayList<>();
        keywords.add("love");
        keywords.add("am");
        keywords.add("home");
        keywords.add("honey");
        keywords.add("I");
        keywords.add("but");
        keywords.add("on");
        keywords.add("is");
        keywords.add("book");
        keywords.add("fire");
        keywords.add("heart");
        keywords.add("girl");
        keywords.add("water");
        keywords.add("blue");
        keywords.add("deep");
        keywords.add("earth");
        keywords.add("man");
        keywords.add("easy");
        keywords.add("her");
        keywords.add("smile");

        System.out.println("\nGetting statistic by 20 keywords");
        handler.displayStatisticsOfKeywords(keywords,urls);
    }
}
