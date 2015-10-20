package x200837.main.WebPageReader;

import x200837.main.AbstractReader.AbstractReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Adam on 2015-10-18.
 */
public class WebPageReader extends AbstractReader {

    public String wczytaj(String path) {
        StringBuffer page = new StringBuffer();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new URL(path).openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                page.append(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Nie odnaleziono strony");
            e.printStackTrace();
        }
        return page.toString();

    }


    public WebPageReader(String filepath) {
        this.path = filepath;
    }
}
