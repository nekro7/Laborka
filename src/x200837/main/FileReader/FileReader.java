package x200837.main.FileReader;

import x200837.main.AbstractReader.AbstractReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Adam on 2015-10-18.
 */
public class FileReader extends AbstractReader {


    public String wczytaj(String path)
    {
        byte[] zawartosc = new byte[0];
        try {
            zawartosc = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Nie mo¿na wczytaæ pliku.");
            e.printStackTrace();
        }
        return new String(zawartosc);
    }



    public FileReader(String path) {
        this.path = path;
    }
}
