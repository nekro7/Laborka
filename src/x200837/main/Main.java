package x200837.main;

import x200837.main.AbstractReader.AbstractReader;
import x200837.main.FileReader.FileReader;
import x200837.main.WebPageReader.WebPageReader;

import static x200837.main.Klucze.*;


/**
 * Created by Adam on 2015-10-17.
 */
public class Main {
    public static void main(String[] args) {
        Konfiguracja konfig = new Konfiguracja(args[0]);
        System.out.println(konfig.getProperty(FILE_PAGE));
        AbstractReader a =  ReaderChooser.stworz(konfig.getProperty(FILE_PAGE));
        Worker.getLinks(a.wczytaj(konfig.getProperty(FILE_PAGE)));
    }

}
