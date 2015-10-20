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
        //FileReader a = new FileReader(konfig.getProperty(Klucze.FILE));
        System.out.println(konfig.getProperty(FILE));
        //new Worker(ReaderChooser.create(konfig.getProperty(FILE))).getLinks();
        AbstractReader a;
        a =  ReaderChooser.stworz(konfig.getProperty(FILE));
        //Worker.getLinks
        Worker.getLinks(a.wczytaj(konfig.getProperty(FILE)));
    }

}
