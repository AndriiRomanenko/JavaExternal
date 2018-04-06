package lesson.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adrie on 06.04.2018.
 */
public class Handler {

    public List<String> getListOfReferencesByURL(String urlRef) {
        try {
            return getListByURL(urlRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> void display(List<T> list){
        displayList(list);
    }

    private <T> void displayList(List<T> list){
        for(T t: list){
            System.out.println(t);
        }
    }

    private List<String> getListByURL(String urlRef) throws IOException {
        List<String> list = new ArrayList<>();
        URL url = new URL(urlRef);
        URLConnection urlConnection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                urlConnection.getInputStream()));
        String regex = "(<[a]?[a-z\\s\\\"=]+)" +
                "(/[\\w]*)*(\\.)+(htm)+"+
                "(\\\">(.*)</[a]>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            matcher = pattern.matcher(inputLine);
            if(matcher.find()){
                list.add(getFullReference(url ,getReference(inputLine)));
            }
        }
        in.close();
        return list;
    }

    public String getStringByRegularExpression(String ref, String regexp){
        return getRegexpResult(ref, regexp);
    }

    private String getRegexpResult(String ref, String regexp){
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ref);
        String reference = null;
        if(matcher.find()){
            return  reference = matcher.group();
        }
        return null;
    }

    public String getReference(String ref){
        return getStringByRegularExpression(ref, "(/[\\w]*)*(\\.htm)+");
    }

    public String getFullReference(URL url, String ref){
        return getFullRef(url,ref);
    }

    private String getFullRef(URL url, String ref){
        String urlTemp = url.toExternalForm();
        String refTemp = ref;
        String[] urlArray = urlTemp.split("[/:]+");
        String[] refArray = refTemp.split("[/:]+");
        StringBuilder sb = new StringBuilder();
        sb.append(urlTemp).deleteCharAt(sb.length()-1);
        for(int i = 0; i<refArray.length; i++){
            int lengthArray = refArray.length;
            for(int j = 0; j<urlArray.length; j++){
                if(refArray[i].equals(urlArray[j])){
                    lengthArray--;
                }
            }
            if(lengthArray==refArray.length){
                sb.append(refArray[i]).append("/");
            }
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

    public Map<String, TreeMap<Integer, String>> getStatisticOfKeywords(List<String> keywords,List<String> urls){
        Map<String, TreeMap<Integer, String>> statistics = new HashMap<>();



        return statistics;
    }
}
