package x200837.main;

import x200837.main.AbstractReader.AbstractReader;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adam on 2015-10-20.
 */
public class Worker
{
    protected String page_file;

    public Worker(String page_file)
    {
        this.page_file=page_file;
    }

    public static void getLinks(String url) {

        /*String link = "";
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < url.length() - 6; i++) {
            if (url.charAt(i) == 'h' && url.charAt(i + 1) == 'r') {
                for (int k = i; k < url.length(); k++) {
                    if (url.charAt(k) == '>') {
                        link = url.substring(i + 6, k - 1);
                        links.add(link);
                        // Break the loop
                        k = url.length();
                    }
                }
            }
        }
        return links;*/
        int counter = 0;

        Pattern pattern = Pattern.compile("<a href=\"(.*?)\">");
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            counter++;
        }

        //return m.group();
        System.out.println("Znaleziono "+counter+" linkow.");


    }

}


