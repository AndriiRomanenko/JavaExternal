package lesson.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {

    public List<String> getListOfReferencesByURL(String urlRef) {
            return getListByURL(urlRef);
    }

    public <T> void display(List<T> list){
        displayList(list);
    }

    private <T> void displayList(List<T> list){
        for(T t: list){
            System.out.println(t);
        }
    }

    private List<String> getListByURL(String urlRef){
        List<String> list = new ArrayList<>();
        URL url = null;
        URLConnection urlConnection = null;
        BufferedReader in = null;
        try {
            url = new URL(urlRef);
            urlConnection = url.openConnection();
            in = new BufferedReader(new InputStreamReader(
                    urlConnection.getInputStream()));
            String regex = "(<[a]?[a-z\\s\\\"=]+)" +
                    "(/[\\w]*)*(\\.)+(htm)+" +
                    "(\\\">(.*)</[a]>)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher;
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                matcher = pattern.matcher(inputLine);
                if (matcher.find()) {
                    list.add(getFullReference(url, getReference(inputLine)));
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public String getStringByRegularExpression(String intro, String regexp){
        return getRegexpResult(intro, regexp);
    }

    private String getRegexpResult(String intro, String regexp){
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(intro);
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

    public Map<String, Map<Integer, String>> getStatisticOfKeywords(List<String> keywords,List<String> urls){
        return statisticOfKeywords(keywords, urls);
    }

    private Map<String, Map<Integer, String>> statisticOfKeywords(List<String> keywords,List<String> urls){
        Map<String, Map<Integer, String>> statistics = new HashMap<>();
        for(String key: keywords){
            statistics.put(key,getStatisticKeyword(key, urls));
        }
        return statistics;
    }

    public Map<Integer, String> getStatisticKeyword(String keyword, List<String> urls){
        return statisticKeyword(keyword, urls);
    }

    private Map<Integer, String> statisticKeyword(String keyword, List<String> urls){
        Map<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
        for(String s: urls){
            map.put(getCountKeyword(keyword,s),s);
        }
        return map;
    }
    public Integer getCountKeyword(String keyword, String ref){
        return countKeyword(keyword, ref);
    }
    private Integer countKeyword(String keyword, String ref){
        URL url = null;
        URLConnection urlConnection = null;
        BufferedReader in = null;
        int count = 0;
        try {
            url = new URL(ref);
            urlConnection = url.openConnection();
            in = new BufferedReader(new InputStreamReader(
                    urlConnection.getInputStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null){
//            String string = new String(inputLine.getBytes(), "UTF-8");
//            sb.append(string);
                sb.append(inputLine);
            }
            String regex = "([<][\\w]*(([\\s\\w-;=\\\"]*)([\\w\\s#;:./=-]*[\\s]*)(\\\"))*[>])+|" +
                    "(</[\\w]*>)+|" +
                    "([<][\\w]*(([\\s\\w\\\";=-]*)([\\w\\s#;:.=/-]*[\\s]*)(\\\"))*[/>])+|" +
                    "(&nbsp;)|" +
                    "(<!--[\\s\\w-.]*-->)|" + "(\\s)|" + "[,.:-]";

            String[] words = sb.toString().split(regex);
            for(String s: words){
                if(s.equalsIgnoreCase(keyword)) count++;
                // System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return count;
    }
    public void displayCount(String keyword, String ref) {
        int result = getCountKeyword(keyword,ref);
        String matchResult = result==1 ? " match" : " matches";
        System.out.println("Keyword: " + keyword +", found " + result + matchResult + " by " + ref);
    }

    public void displayStatisticKeyword(String keyword, List<String> urls){
        Map<Integer, String> map = getStatisticKeyword(keyword,urls);
        String print = "Keyword: " + keyword +", found: ";
        System.out.print(print);
        for(Map.Entry<Integer, String> pair : map.entrySet()) {
            Integer key = pair.getKey();
            String matchResult = key == 1 ? " match" : " matches";
            String value = pair.getValue();
            if (key == 0) {
                continue;
            } else {
                System.out.print("\n" + print.replaceAll("[\\w:,]+", " ") +
                        key + matchResult + " by " + value);
            }
        }
    }

    public void displayStatisticsOfKeywords(List<String> keys, List<String> urls){
        for(String key: keys){
            System.out.println();
            displayStatisticKeyword(key, urls);
        }
    }
}
