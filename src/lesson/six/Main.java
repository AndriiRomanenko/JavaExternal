package lesson.six;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args){
        Handler handler = new Handler();
        List<String> listOfReferences = handler.
                getListOfReferencesByURL("http://www.stihi-rus.ru/World/Shekspir/");
//        handler.display(listOfReferences);


    }



}
